package tests;

import excepciones.InscripcionRechazadaException;
import opfv2.InscripEstandar;
import opfv2.Jugador;
import opfv2.Partido;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class TestsInscripcionVariosJugadores {
  private Partido partido = new Partido(2040, 20140413, "El tinglado");
  
  @Before
  public void testInicio() {
    IntegerRange _upTo = new IntegerRange(1, 10);
    for (final Integer i : _upTo) {
      {
        Jugador jugador = new Jugador((i).intValue(), ("Player" + i));
        InscripEstandar _inscripEstandar = new InscripEstandar();
        jugador.incribirseEn(this.partido, _inscripEstandar);
      }
    }
  }
  
  @Test
  public void testInscribirJugadorMasde10enEstandarRechaza() {
    Jugador jugador11 = new Jugador(15, "Player11");
    try {
      InscripEstandar _inscripEstandar = new InscripEstandar();
      jugador11.incribirseEn(this.partido, _inscripEstandar);
    } catch (final Throwable _t) {
      if (_t instanceof InscripcionRechazadaException) {
        final InscripcionRechazadaException e = (InscripcionRechazadaException)_t;
        Assert.fail();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
