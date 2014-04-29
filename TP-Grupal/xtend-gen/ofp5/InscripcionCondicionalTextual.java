package ofp5;

import ofp5.Jugador;
import ofp5.Partido;

@SuppressWarnings("all")
public interface InscripcionCondicionalTextual {
  public abstract void inscribir(final Jugador jugador, final Partido partido, final String valorText);
}
