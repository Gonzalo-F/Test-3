package ofp5Statefull

import java.util.ArrayList

class InscCondicional implements Inscripcion {
	
	@Property ArrayList<Jugador> condicionales
	
	new(){
		this.condicionales = newArrayList()
	}
	
	override inscribir (Jugador jugador, Partido partido){
		if (partido.inscEstandar.jugadores.size < 10)
		{
			condicionales.add(jugador)
		}
	}
}