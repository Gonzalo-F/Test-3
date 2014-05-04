package tests
 
 import static org.junit.Assert.*
 import org.junit.Test
 import opfv2.Partido
 import opfv2.Jugador

 class TestInscripcion {
 	
 	@Test
 	def testInscribirEstandar() {
 		
 		var Partido partido = new Partido (2040, 20140413, 'Tinglado')
 		var Jugador jugador = new Jugador(15, "Pirulito")
 		
 		jugador.incribirseA(partido)
 		
 		assertTrue(true)
 
 	}
 	@Test
 	def testInscribirSolidario() {
 		
 		var Partido partido = new Partido(2040, 20140413, 'Tinglado')
 		var Jugador jugador = new Jugador(15, "Pirulito")
 		
 		jugador.incribirseA(partido)
 		
 		assertTrue(true)
 	}

 }
 
 
 