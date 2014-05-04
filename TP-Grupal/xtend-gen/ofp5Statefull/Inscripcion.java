package ofp5Statefull;

import ofp5Statefull.Jugador;
import ofp5Statefull.Partido;

@SuppressWarnings("all")
public interface Inscripcion {
  public abstract void inscribir(final Jugador jugador, final Partido partido);
}
