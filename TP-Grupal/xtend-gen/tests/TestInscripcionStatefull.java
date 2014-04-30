package tests;

import excepciones.InscripcionRechazadaException;
import ofp5Statefull.Jugador;
import ofp5Statefull.Partido;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestInscripcionStatefull {
  @Test
  public void testInscribirEstandarStatefull() {
    Partido partido = new Partido(2040, 20140413, "Tinglado");
    Jugador jugador = new Jugador(15, "Pirulito");
    partido.inscribirA(jugador, "estandar");
    boolean _estaInscripto = partido.estaInscripto(jugador, "estandar");
    Assert.assertTrue(_estaInscripto);
  }
  
  @Test
  public void testInscribirSolidarioStatefull() {
    Partido partido = new Partido(2040, 20140413, "Tinglado");
    Jugador jugador = new Jugador(15, "Pirulito");
    partido.inscribirA(jugador, "solidario");
    boolean _estaInscripto = partido.estaInscripto(jugador, "solidario");
    Assert.assertTrue(_estaInscripto);
  }
  
  @Test
  public void testInscribirJugadorMasde10enEstandarRechazaStatefull() {
    Partido partido = new Partido(2040, 20140413, "Tinglado");
    Jugador jugador1 = new Jugador(15, "Player1");
    partido.inscribirA(jugador1, "estandar");
    Jugador jugador2 = new Jugador(15, "Player2");
    partido.inscribirA(jugador2, "estandar");
    Jugador jugador3 = new Jugador(15, "Player3");
    partido.inscribirA(jugador3, "estandar");
    Jugador jugador4 = new Jugador(15, "Player4");
    partido.inscribirA(jugador4, "estandar");
    Jugador jugador5 = new Jugador(15, "Player5");
    partido.inscribirA(jugador5, "estandar");
    Jugador jugador6 = new Jugador(15, "Player6");
    partido.inscribirA(jugador6, "estandar");
    Jugador jugador7 = new Jugador(15, "Player7");
    partido.inscribirA(jugador7, "estandar");
    Jugador jugador8 = new Jugador(15, "Player8");
    partido.inscribirA(jugador8, "estandar");
    Jugador jugador9 = new Jugador(15, "Player9");
    partido.inscribirA(jugador9, "estandar");
    Jugador jugador10 = new Jugador(15, "Player10");
    partido.inscribirA(jugador10, "estandar");
    Jugador jugador11 = new Jugador(15, "Player11");
    try {
      partido.inscribirA(jugador11, "estandar");
    } catch (final Throwable _t) {
      if (_t instanceof InscripcionRechazadaException) {
        final InscripcionRechazadaException e = (InscripcionRechazadaException)_t;
        return;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
