
class Solidario implements TipoInscripcion {
	 @Property Partido partido
	 override inscribir (Jugador jugador){
	 	if (this.partido.jugadores.size < 10){	
		
			this.partido.agregarJugador (jugador, "solidario")
		
		}
	}
	 	
	 }
	
