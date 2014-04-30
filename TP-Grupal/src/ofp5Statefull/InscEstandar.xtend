package ofp5Statefull

import java.util.ArrayList

class InscEstandar implements Inscripcion {
	
	@Property ArrayList<Jugador> jugadores
	
	new(){
		this.jugadores = newArrayList()
	}
	
	override inscribir (Jugador jugador, Partido partido){
		if (jugadores.size < 10){	
		
			jugadores.add(jugador)
		
		}
	}
}