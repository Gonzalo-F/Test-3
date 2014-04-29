package tests;

import ofp5Statefull.Jugador;
import ofp5Statefull.Partido;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class Test3 {
  @Test
  public void testInscribirEstandar() {
    Partido partido = new Partido(2040, 20140413, "Tinglado");
    Jugador jugador = new Jugador(15, "Pirulito");
    partido.inscribirA(jugador, "estandar");
    boolean _estaInscripto = partido.estaInscripto(jugador, "estandar");
    Assert.assertTrue(_estaInscripto);
  }
  
  @Test
  public void testInscribirSolidario() {
    Partido partido = new Partido(2040, 20140413, "Tinglado");
    Jugador jugador = new Jugador(15, "Pirulito");
    partido.inscribirA(jugador, "solidario");
    boolean _estaInscripto = partido.estaInscripto(jugador, "solidario");
    Assert.assertTrue(_estaInscripto);
  }
}
