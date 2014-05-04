package tests

import static org.junit.Assert.*
import org.junit.Test
import org.junit.Before

class TestsInscripcionVariosJugadores {

@Before
	def testInicio() {
		var opfv2.Partido partido = new opfv2.Partido(2040, 20140413, "El tinglado")
		for (i: 1 .. 10) {
			var opfv2.Jugador jugador = new opfv2.Jugador(i, "Player" + i)
			var opfv2.Inscripcion inscrip = new opfv2.Inscripcion
			inscrip.inscribir(jugador,partido)
		}
	}

@Test
 	def testInscribirJugadorMasde10enEstandarRechaza(){
 		var opfv2.Jugador jugador11 = new opfv2.Jugador(15, "Player11")
 		var opfv2.Inscripcion insc2 = new opfv2.Inscripcion
 		try {
 			insc2.inscribir (jugador11, partido)
 			} catch (excepciones.InscripcionRechazadaException e){
 			fail()
 			}
 	}
}
