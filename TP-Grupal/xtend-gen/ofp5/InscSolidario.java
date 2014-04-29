package ofp5;

import java.util.ArrayList;
import ofp5.Inscripcion;
import ofp5.Jugador;
import ofp5.Partido;

@SuppressWarnings("all")
public class InscSolidario implements Inscripcion {
  public void inscribir(final Jugador jugador, final Partido partido) {
    ArrayList<Jugador> _jugadores = partido.getJugadores();
    int _size = _jugadores.size();
    boolean _lessThan = (_size < 10);
    if (_lessThan) {
      partido.agregarJugador(jugador, "solidario");
    } else {
      ArrayList<Jugador> _solidarios = partido.getSolidarios();
      ArrayList<Jugador> _solidarios_1 = partido.getSolidarios();
      Jugador _get = _solidarios_1.get(1);
      _solidarios.remove(_get);
      partido.agregarJugador(jugador, "solidario");
    }
  }
}
