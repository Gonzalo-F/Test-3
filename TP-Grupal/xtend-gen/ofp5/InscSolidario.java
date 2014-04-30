package ofp5;

import java.util.ArrayList;
import ofp5.Inscripcion;
import ofp5.Jugador;
import ofp5.Partido;

@SuppressWarnings("all")
public class InscSolidario implements Inscripcion {
  public void inscribir(final Jugador jugador, final Partido partido) {
    boolean _and = false;
    ArrayList<Jugador> _jugadores = partido.getJugadores();
    int _size = _jugadores.size();
    boolean _lessThan = (_size < 10);
    if (!_lessThan) {
      _and = false;
    } else {
      ArrayList<Jugador> _solidarios = partido.getSolidarios();
      int _size_1 = _solidarios.size();
      boolean _lessThan_1 = (_size_1 < 10);
      _and = _lessThan_1;
    }
    if (_and) {
      partido.agregarJugador(jugador, "solidario");
    } else {
      boolean _and_1 = false;
      ArrayList<Jugador> _jugadores_1 = partido.getJugadores();
      int _size_2 = _jugadores_1.size();
      boolean _lessThan_2 = (_size_2 < 10);
      if (!_lessThan_2) {
        _and_1 = false;
      } else {
        ArrayList<Jugador> _solidarios_1 = partido.getSolidarios();
        int _size_3 = _solidarios_1.size();
        boolean _lessThan_3 = (_size_3 < 10);
        _and_1 = _lessThan_3;
      }
      if (_and_1) {
        partido.agregarJugador(jugador, "solidario");
      } else {
        ArrayList<Jugador> _solidarios_2 = partido.getSolidarios();
        ArrayList<Jugador> _solidarios_3 = partido.getSolidarios();
        Jugador _get = _solidarios_3.get(1);
        _solidarios_2.remove(_get);
        partido.agregarJugador(jugador, "solidario");
      }
    }
  }
}
