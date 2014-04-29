package ofp5;

import java.util.ArrayList;
import ofp5.Inscripcion;
import ofp5.Jugador;
import ofp5.Partido;

@SuppressWarnings("all")
public class InscSolidario implements Inscripcion {
  public void inscribir(final Jugador jugador, final Partido partido) {
    ArrayList<Jugador> _solidarios = partido.getSolidarios();
    int _size = _solidarios.size();
    boolean _lessThan = (_size < 10);
    if (_lessThan) {
      partido.agregarJugador(jugador, "solidario");
    } else {
      ArrayList<Jugador> _solidarios_1 = partido.getSolidarios();
      ArrayList<Jugador> _solidarios_2 = partido.getSolidarios();
      Jugador _get = _solidarios_2.get(1);
      _solidarios_1.remove(_get);
      partido.agregarJugador(jugador, "solidario");
    }
  }
}
