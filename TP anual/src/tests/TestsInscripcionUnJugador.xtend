package tests

import static org.junit.Assert.*
import org.junit.Test
import opfv2.Partido
import opfv2.Jugador
import opfv2.Inscripcion
import opfv2.InscripEstandar
import opfv2.InscripSolidario

class TestInscripcion {

	var Partido unPartido = new Partido(2040, 20140413, 'Tinglado')
	var Jugador unJugador = new Jugador(15, "Pirulito")

	@Test
	def testInscribirEstandar() {
		var inscri = new Inscripcion(unJugador, unPartido)
		inscri.tipo = new InscripEstandar(inscri)
		inscri.inscribir(unJugador, unPartido)
		assertTrue(unPartido.estandares.contains(unJugador))

	}

	@Test
	def testInscribirSolidario() {
		var Inscripcion inscri = new Inscripcion(unJugador, unPartido)
		inscri.tipo = new InscripSolidario()
		inscri.inscribir(unJugador, unPartido)
		assertTrue(unPartido.solidarios.contains(unJugador))
	}

}
