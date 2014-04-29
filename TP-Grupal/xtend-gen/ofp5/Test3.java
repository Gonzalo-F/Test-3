package ofp5;

import ofp5.Jugador;
import ofp5.Partido;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class Test3 {
  @Test
  public void testInscribirEstandar() {
    Partido partido = new Partido(2040, 20140413, "Tinglado");
    Jugador jugador = new Jugador(15);
    jugador.inscribirseA(partido, "estandar");
    boolean _estaEnElPartido = jugador.estaEnElPartido(partido);
    Assert.assertTrue(_estaEnElPartido);
  }
}
