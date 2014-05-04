package tests
 
 import static org.junit.Assert.*
 import org.junit.Test
 
 class TestInscripcion {
 	@Test
 	def testInscribirEstandar() {
 		var opfv2.Partido partido = new opfv2.Partido (2040, 20140413, 'Tinglado')
 		var opfv2.Jugador jugador = new opfv2.Jugador(15, "Pirulito")
 		partido.inscribirA(jugador, 'estandar')
 		assertTrue(partido.estaInscripto(jugador, 'estandar'))
 
 	}
 	@Test
 	def testInscribirSolidario() {
 		var opfv2.Partido partido = new opfv2.Partido(2040, 20140413, 'Tinglado')
 		var opfv2.Jugador jugador = new opfv2.Jugador(15, "Pirulito")
 		partido.inscribirA(jugador, 'solidario')
 		assertTrue(partido.estaInscripto(jugador, 'solidario'))
 	}

 }
 
 
 