package ofp5;

import java.util.ArrayList;
import ofp5.InscripcionCondicionalNumerica;
import ofp5.Jugador;
import ofp5.Partido;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class InscCondEdad implements InscripcionCondicionalNumerica {
  public void inscribir(final Jugador jugador, final Partido partido, final int valorNum, final int valorNum2) {
    ArrayList<Jugador> _jugadores = partido.getJugadores();
    final Function1<Jugador,Boolean> _function = new Function1<Jugador,Boolean>() {
      public Boolean apply(final Jugador persona) {
        int _edad = persona.getEdad();
        return Boolean.valueOf((_edad < valorNum));
      }
    };
    Iterable<Jugador> _filter = IterableExtensions.<Jugador>filter(_jugadores, _function);
    int _size = IterableExtensions.size(_filter);
    boolean _lessThan = (_size < valorNum2);
    if (_lessThan) {
      partido.agregarJugador(jugador, "condicional");
    }
  }
}
