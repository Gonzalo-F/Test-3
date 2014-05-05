package opfv2

class InscripSolidario implements TipoInscripcion {
	
	
	override inscribir(Jugador jugador, Partido partido) {
		if (partido.estandares.size< 10){
			partido.solidarios.add(jugador)
		} else {
			throw new InscripcionRechazadaException ("Ya hay 10 inscriptos estandar en la lista")
		}
		
		
	}
	
}