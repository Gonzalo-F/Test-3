package opfv2

class Inscripcion {
	@Property
	TipoInscripcion tipoDeInscripcion
	Partido partido
	Jugador jugador
	
	def inscribir (Jugador unJugador, Partido unPartido){
		this.partido = unPartido
		this.jugador = unJugador
		tipoDeInscripcion.inscribir (unJugador, unPartido)
	}
}