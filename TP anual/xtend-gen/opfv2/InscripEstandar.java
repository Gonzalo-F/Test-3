package opfv2;

import opfv2.Inscripcion;
import opfv2.Jugador;
import opfv2.Partido;
import opfv2.TipoInscripcion;

@SuppressWarnings("all")
public class InscripEstandar extends TipoInscripcion {
  public InscripEstandar(final Inscripcion inscripto) {
    super(inscripto);
  }
  
  public void inscribirA(final Jugador jugador, final Partido partido) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field unaInscripcion is not visible");
  }
}
