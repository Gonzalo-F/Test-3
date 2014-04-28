package ofp5;

import ofp5.Jugador;
import ofp5.Partido;

@SuppressWarnings("all")
public interface Inscripcion {
  public abstract void inscribir(final Jugador jugador, final Partido partido);
}
