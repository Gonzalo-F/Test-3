package ofp5

class Jugador {
	@Property int edad
	
}

interface Inscripcion {
	def void inscribirse(Partido partido);

}

class Partido {
	@Property String lugar
	@Property Collection<Jugador> jugadores
	@Property int hora
	@Property int fecha
	
}

class InscEstandar implements Inscripcion {
	
	def inscribirse (Partido partido){
		partido.agregarJugador (this)
	}
}