package opfv2;

import opfv2.Inscripcion;
import opfv2.Jugador;
import opfv2.Partido;

@SuppressWarnings("all")
public abstract class TipoInscripcion {
  private Inscripcion unaInscripcion;
  
  public TipoInscripcion(final Inscripcion insc) {
    this.unaInscripcion = insc;
  }
  
  public abstract void inscribirA(final Jugador jugador, final Partido partido);
}
