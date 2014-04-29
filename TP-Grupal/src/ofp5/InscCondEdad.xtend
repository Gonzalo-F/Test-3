package ofp5

class InscCondEdad implements InscripcionCondicionalNumerica{
	
	override inscribir(Jugador jugador, Partido partido, int valorNum, int valorNum2){
		if( (partido.jugadores.filter [persona | persona.edad < valorNum]).size < valorNum2 ){
			partido.agregarJugador(jugador, "condicional")
		}
	}
}