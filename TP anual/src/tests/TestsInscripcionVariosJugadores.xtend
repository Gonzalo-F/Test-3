package tests

import excepciones.InscripcionRechazadaException
import opfv2.Jugador
import opfv2.Partido
import org.junit.Before
import org.junit.Test
import static org.junit.Assert.*
import opfv2.InscripEstandar

class TestsInscripcionVariosJugadores {

	var Partido partido = new Partido(2040, 20140413, "El tinglado")

	@Before
	def testInicio() {
		for (i : 1 .. 10) {
			var Jugador jugador = new Jugador(i, "Player" + i)
			jugador.incribirseEn(partido, new InscripEstandar)
		}
	}

	@Test
	def testInscribirJugadorMasde10enEstandarRechaza() {
		var Jugador jugador11 = new Jugador(15, "Player11")
		try {
			jugador11.incribirseEn(partido, new InscripEstandar)
		} catch (InscripcionRechazadaException e) {
			fail()
		}
	}
}
