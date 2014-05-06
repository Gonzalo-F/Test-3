package opfv2

class Inscripcion {
	@Property
	tipoDeInscripcion
	
	def inscribir (Jugador unJugador, Partido unPartido){
		tipoDeInscripcion.inscribir (unJugador, unPartido)
	}
}