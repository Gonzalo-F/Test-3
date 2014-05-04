package tests

import excepciones.InscripcionRechazadaException
import opfv2.Jugador
import opfv2.Partido
import opfv2.Inscripcion
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*

class TestsInscripcionVariosJugadores {

	Partido partido
	
	@Before
	def testInicio() {
		var Partido partido = new Partido(2040, 20140413, "El tinglado")
		for (i: 1 .. 10) {
			
			var Jugador jugador = new Jugador(i, "Player" + i)
			
			var Inscripcion inscrip = new Inscripcion
			
			jugador.incribirseA(partido)
			
			inscrip.inscribir(jugador,partido)
		}
	}

@Test
 	def testInscribirJugadorMasde10enEstandarRechaza(){
		 		
 		var Jugador jugador11 = new Jugador(15, "Player11")
 		var Inscripcion insc2 = new Inscripcion
 		
 		try {
 			jugador11.incribirseA(partido)
 			insc2.inscribir (jugador11, partido)
 			} catch (InscripcionRechazadaException e){
 			fail()
 			}
 	}
}
