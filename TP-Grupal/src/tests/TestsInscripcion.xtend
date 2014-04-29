package tests
 
 import static org.junit.Assert.*
 import org.junit.Test
 
 class Test3 {
 	@Test
 	def testInscribirEstandar() {
 		var ofp5.Partido partido = new ofp5.Partido(2040, 20140413, 'Tinglado')
 		var ofp5.Jugador jugador = new ofp5.Jugador(15, "Pirulito")
 		partido.inscribirA(jugador, 'estandar')
 		assertTrue(partido.estaInscripto(jugador, 'estandar'))
 
 	}
 	@Test
 	def testInscribirSolidario() {
 		var ofp5.Partido partido = new ofp5.Partido(2040, 20140413, 'Tinglado')
 		var ofp5.Jugador jugador = new ofp5.Jugador(15, "Pirulito")
 		partido.inscribirA(jugador, 'solidario')
 		assertTrue(partido.estaInscripto(jugador, 'solidario'))
 
 	}
 }
 
 
 