package opfv2

import excepciones.InscripcionRechazadaException
import opfv2.TipoInscripcion
import opfv2.Jugador
import opfv2.Partido

class InscripEstandar extends TipoInscripcion {

	new(Inscripcion inscripto) {
		super(inscripto)
	}
	
	override inscribirA (Jugador jugador, Partido partido) {
		if (partido.estandares.size < 10) {
			partido.estandares.add (unaInscripcion)
		} else {
			throw new InscripcionRechazadaException ("Ya hay 10 inscriptos estandar en la lista")
		}
		
	}
}