package vNati;

import java.util.ArrayList;
import vNati.Jugador;
import vNati.Partido;
import vNati.TipoInscripcion;

@SuppressWarnings("all")
public class Solidario implements TipoInscripcion {
  private Partido _partido;
  
  public Partido getPartido() {
    return this._partido;
  }
  
  public void setPartido(final Partido partido) {
    this._partido = partido;
  }
  
  public void inscribir(final Jugador jugador) {
    Partido _partido = this.getPartido();
    ArrayList<Jugador> _jugadores = _partido.getJugadores();
    int _size = _jugadores.size();
    boolean _lessThan = (_size < 10);
    if (_lessThan) {
      Partido _partido_1 = this.getPartido();
      _partido_1.agregarJugador(jugador, "solidario");
    }
  }
}
