package ofp5

import java.util.Collection

class Partido {
	@Property String lugar
	@Property Collection<Jugador> jugadores
	@Property int hora
	@Property int fecha
	
	new(int hora, int fecha, String lugar){
		this.hora = hora
		this.fecha = fecha
		this.lugar = lugar
	}
	
	def agregarJugador(Jugador unJugador){
		jugadores.add(unJugador)
	}
	
}