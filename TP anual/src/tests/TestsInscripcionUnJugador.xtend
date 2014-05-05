package tests

import static org.junit.Assert.*
import org.junit.Test
import opfv2.Partido
import opfv2.Jugador
import opfv2.InscripEstandar
import opfv2.InscripSolidario

class TestInscripcion {

	var Partido partido = new Partido(2040, 20140413, 'Tinglado')
	var Jugador jugador = new Jugador(15, "Pirulito")

	@Test
	def testInscribirEstandar() {
		jugador.incribirseEn(partido, new InscripEstandar)
		assertTrue(partido.estandares.contains(jugador))

	}

	@Test
	def testInscribirSolidario() {
		jugador.incribirseEn(partido, new InscripSolidario)

		assertTrue(partido.solidarios.contains(jugador))
	}

}
