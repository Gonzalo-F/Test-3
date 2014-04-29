package ofp5

class InscSolidario implements Inscripcion {
	
	override inscribir (Jugador jugador, Partido partido){
		if (partido.jugadores.size < 10){	
		
			partido.agregarJugador (jugador, 'solidario')
		}
		else{
			partido.solidarios.remove(partido.solidarios.get(1))
			partido.agregarJugador (jugador, 'solidario')
		}
	}
}