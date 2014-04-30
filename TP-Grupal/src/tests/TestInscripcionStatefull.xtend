package tests

import static org.junit.Assert.*
 import org.junit.Test
 
 class TestInscripcionStatefull {
 	@Test
 	def testInscribirEstandarStatefull() {
 		var ofp5Statefull.Partido partido = new ofp5Statefull.Partido(2040, 20140413, 'Tinglado')
 		var ofp5Statefull.Jugador jugador = new ofp5Statefull.Jugador(15, "Pirulito")
 		partido.inscribirA(jugador, 'estandar')
 		assertTrue(partido.estaInscripto(jugador, 'estandar'))
 
 	}
 	@Test
 	def testInscribirSolidarioStatefull() {
 		var ofp5Statefull.Partido partido = new ofp5Statefull.Partido(2040, 20140413, 'Tinglado')
 		var ofp5Statefull.Jugador jugador = new ofp5Statefull.Jugador(15, "Pirulito")
 		partido.inscribirA(jugador, 'solidario')
 		assertTrue(partido.estaInscripto(jugador, 'solidario'))
 
 	}
 @Test
 	def testInscribirJugadorMasde10enEstandarRechazaStatefull(){
 		var ofp5Statefull.Partido partido = new ofp5Statefull.Partido(2040, 20140413, 'Tinglado')
 		var ofp5Statefull.Jugador jugador1 = new ofp5Statefull.Jugador(15, "Player1")
 		partido.inscribirA(jugador1, 'estandar')
 		var ofp5Statefull.Jugador jugador2 = new ofp5Statefull.Jugador(15, "Player2")
 		partido.inscribirA(jugador2, 'estandar')
 		var ofp5Statefull.Jugador jugador3 = new ofp5Statefull.Jugador(15, "Player3")
 		partido.inscribirA(jugador3, 'estandar')
 		var ofp5Statefull.Jugador jugador4 = new ofp5Statefull.Jugador(15, "Player4")
 		partido.inscribirA(jugador4, 'estandar')
 		var ofp5Statefull.Jugador jugador5 = new ofp5Statefull.Jugador(15, "Player5")
 		partido.inscribirA(jugador5, 'estandar')
 		var ofp5Statefull.Jugador jugador6 = new ofp5Statefull.Jugador(15, "Player6")
 		partido.inscribirA(jugador6, 'estandar')
 		var ofp5Statefull.Jugador jugador7 = new ofp5Statefull.Jugador(15, "Player7")
 		partido.inscribirA(jugador7, 'estandar')
 		var ofp5Statefull.Jugador jugador8 = new ofp5Statefull.Jugador(15, "Player8")
 		partido.inscribirA(jugador8, 'estandar')
 		var ofp5Statefull.Jugador jugador9 = new ofp5Statefull.Jugador(15, "Player9")
 		partido.inscribirA(jugador9, 'estandar')
 		var ofp5Statefull.Jugador jugador10 = new ofp5Statefull.Jugador(15, "Player10")
 		partido.inscribirA(jugador10, 'estandar')
 		var ofp5Statefull.Jugador jugador11 = new ofp5Statefull.Jugador(15, "Player11")
 		try {
 			partido.inscribirA(jugador11, 'estandar')
 			} catch (excepciones.InscripcionRechazadaException e){
 			return
 			}
 	}
 }
 
 
 