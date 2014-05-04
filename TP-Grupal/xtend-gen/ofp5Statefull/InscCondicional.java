package ofp5Statefull;

import java.util.ArrayList;
import ofp5Statefull.InscEstandar;
import ofp5Statefull.Inscripcion;
import ofp5Statefull.Jugador;
import ofp5Statefull.Partido;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class InscCondicional implements Inscripcion {
  private ArrayList<Jugador> _condicionales;
  
  public ArrayList<Jugador> getCondicionales() {
    return this._condicionales;
  }
  
  public void setCondicionales(final ArrayList<Jugador> condicionales) {
    this._condicionales = condicionales;
  }
  
  public InscCondicional() {
    ArrayList<Jugador> _newArrayList = CollectionLiterals.<Jugador>newArrayList();
    this.setCondicionales(_newArrayList);
  }
  
  public void inscribir(final Jugador jugador, final Partido partido) {
    InscEstandar _inscEstandar = partido.getInscEstandar();
    ArrayList<Jugador> _jugadores = _inscEstandar.getJugadores();
    int _size = _jugadores.size();
    boolean _lessThan = (_size < 10);
    if (_lessThan) {
      ArrayList<Jugador> _condicionales = this.getCondicionales();
      _condicionales.add(jugador);
    }
  }
}
