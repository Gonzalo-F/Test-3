package opfv2;

import opfv2.Inscripcion;
import opfv2.Jugador;
import opfv2.Partido;

@SuppressWarnings("all")
public interface TipoInscripcion {
  public abstract void inscribirA(final Jugador unJugador, final Partido unPartido, final Inscripcion unaInscripcion);
}
