
class Estandar implements TipoInscripcion {
	 @Property Partido partido
	override inscribir (Jugador jugador){
		if (this.partido.jugadores.size < 10){	
		
			partido.agregarJugador (jugador, "estandar")
		
		}
	}
}
	
	
