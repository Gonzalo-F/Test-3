package opfv2
import excepciones.InscripcionRechazadaException

class InscripCondicional implements TipoInscripcion {
	
	override inscribirA (Jugador jugador, Partido partido, Inscripcion unaInsc) {
			if (partido.estandares.size < 10) {
			partido.condicionales.add (unaInsc)
		} else {
			throw new InscripcionRechazadaException ("Ya hay 10 inscriptos estandar en la lista")
		}
	
	}
}