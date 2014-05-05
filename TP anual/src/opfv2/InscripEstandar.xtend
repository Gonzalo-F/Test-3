package opfv2

import excepciones.InscripcionRechazadaException

class InscripEstandar implements TipoInscripcion {

	override inscribir(Jugador jugador, Partido partido) {
		if (partido.estandares.size < 10) {
			partido.estandares.add (jugador)
		} else {
			throw new InscripcionRechazadaException ("Ya hay 10 inscriptos estandar en la lista")
		}
		
	}
}