package tests;

import opfv2.InscripEstandar;
import opfv2.Jugador;
import opfv2.Partido;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class TestsInscripcionVariosJugadores {
  private Partido partido;
  
  @Before
  public void testInicio() {
    Partido partido = new Partido(2040, 20140413, "El tinglado");
    IntegerRange _upTo = new IntegerRange(1, 10);
    for (final Integer i : _upTo) {
      {
        Jugador jugador = new Jugador((i).intValue(), ("Player" + i));
        InscripEstandar _inscripEstandar = new InscripEstandar();
        jugador.incribirseEn(partido, _inscripEstandar);
      }
    }
  }
  
  @Test
  public void testInscribirJugadorMasde10enEstandarRechaza() {
    throw new Error("Unresolved compilation problems:"
      + "\nInscripcionRechazadaException cannot be resolved to a type.");
  }
}
