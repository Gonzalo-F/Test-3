package ofp5;

import ofp5.Jugador;
import ofp5.Partido;

@SuppressWarnings("all")
public interface InscripcionCondicionalNumerica {
  public abstract void inscribir(final Jugador jugador, final Partido partido, final int valorNum, final int ValorNum2);
}
