package ofp5;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test2 {

	@Test
	public void InscEstandarTest() {
		
		Partido partido = new Partido(20, 12, "loro");
		Jugador jugador = new Jugador(15);
				
		assertTrue(partido.agregarJugador(jugador,"estandar"));
	}

}
