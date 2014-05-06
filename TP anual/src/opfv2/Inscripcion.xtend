package opfv2

class Inscripcion {
	@Property
	TipoInscripcion tipo
	Partido partido
	Jugador jugador
	
	def void inscribir (Jugador unJugador, Partido unPartido){
		tipo.inscribirA(unJugador, unPartido, this)
	}
	new (Jugador unJugador, Partido unPartido){
		this.jugador = unJugador
		this.partido = unPartido
	}
}