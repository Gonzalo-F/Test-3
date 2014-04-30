package ofp5

class InscCondicional implements Inscripcion {
	override inscribir (Jugador jugador, Partido partido){
		if (/*condicion deberia ser un booleano, claramente*/"condicion"){
			partido.agregarJugador(jugador, 'condicional')
		} else {
			throw new excepciones.InscripcionRechazadaException("El partido no cumple las condiciones del jugador")
		}
	}
}