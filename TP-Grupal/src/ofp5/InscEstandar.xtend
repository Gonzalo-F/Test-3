package ofp5

class InscEstandar implements Inscripcion {
	
	override inscribir (Jugador jugador, Partido partido){
		if (partido.jugadores.size < 10){	
		
			partido.agregarJugador (jugador)
		
		}
	}
}