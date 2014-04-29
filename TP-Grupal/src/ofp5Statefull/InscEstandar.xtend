package ofp5Statefull

import java.util.ArrayList

class InscEstandar implements Inscripcion {
	
	@Property ArrayList<Jugador> jugadores
	
	new(){
		this.jugadores = newArrayList()
	}
	
	override inscribir (Jugador jugador){
		if (jugadores.size < 10){	
		
			jugadores.add(jugador)
		
		}
	}
}