package ofp5;

import java.util.Collection;
import ofp5.Inscripcion;
import ofp5.Jugador;
import ofp5.Partido;

@SuppressWarnings("all")
public class InscEstandar implements Inscripcion {
  public void inscribir(final Jugador jugador, final Partido partido) {
    Collection<Jugador> _jugadores = partido.getJugadores();
    int _size = _jugadores.size();
    boolean _lessThan = (_size < 10);
    if (_lessThan) {
      partido.agregarJugador(jugador);
    }
  }
}
