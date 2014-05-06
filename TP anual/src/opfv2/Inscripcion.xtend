package opfv2

class Inscripcion {
	@Property
	TipoInscripcion tipoDeInscripcion
	Partido partido
	Jugador jugador
	
	def inscribir (Jugador unJugador, Partido unPartido){
		tipoDeInscripcion.inscribir (unJugador, unPartido)
	}
	new (Jugador unJugador, Partido unPartido){
		this.jugador = unJugador
		this.partido = unPartido
	}
}