package ofp5

import static org.junit.Assert.*
import org.junit.Test

class Test3 {
	@Test
	def testInscribirEstandar() {
		var Partido partido = new Partido(2040, 20140413, 'Tinglado')
		var Jugador jugador = new Jugador(15)
		jugador.inscribirseA(partido,'estandar')
		assertEquals(partido.tamanioLista(),1)
		/*Esto deberia ir, el size no me dice nada assertTrue(jugador.estaEnElPartido(partido)) */

	}

}
