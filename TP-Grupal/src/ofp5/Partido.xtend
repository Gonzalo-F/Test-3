package ofp5

import java.util.Collection

class Partido {
	@Property String lugar
	@Property Collection<Jugador> jugadores
	@Property int hora
	@Property int fecha
	
}