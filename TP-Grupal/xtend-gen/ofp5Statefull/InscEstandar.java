package ofp5Statefull;

import java.util.ArrayList;
import ofp5Statefull.Inscripcion;
import ofp5Statefull.Jugador;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class InscEstandar implements Inscripcion {
  private ArrayList<Jugador> _jugadores;
  
  public ArrayList<Jugador> getJugadores() {
    return this._jugadores;
  }
  
  public void setJugadores(final ArrayList<Jugador> jugadores) {
    this._jugadores = jugadores;
  }
  
  public InscEstandar() {
    ArrayList<Jugador> _newArrayList = CollectionLiterals.<Jugador>newArrayList();
    this.setJugadores(_newArrayList);
  }
  
  public void inscribir(final Jugador jugador) {
    ArrayList<Jugador> _jugadores = this.getJugadores();
    int _size = _jugadores.size();
    boolean _lessThan = (_size < 10);
    if (_lessThan) {
      ArrayList<Jugador> _jugadores_1 = this.getJugadores();
      _jugadores_1.add(jugador);
    }
  }
}
