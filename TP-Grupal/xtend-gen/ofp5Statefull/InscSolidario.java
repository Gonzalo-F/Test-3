package ofp5Statefull;

import java.util.ArrayList;
import ofp5Statefull.InscEstandar;
import ofp5Statefull.Inscripcion;
import ofp5Statefull.Jugador;
import ofp5Statefull.Partido;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class InscSolidario implements Inscripcion {
  private ArrayList<Jugador> _solidarios;
  
  public ArrayList<Jugador> getSolidarios() {
    return this._solidarios;
  }
  
  public void setSolidarios(final ArrayList<Jugador> solidarios) {
    this._solidarios = solidarios;
  }
  
  public InscSolidario() {
    ArrayList<Jugador> _newArrayList = CollectionLiterals.<Jugador>newArrayList();
    this.setSolidarios(_newArrayList);
  }
  
  public void inscribir(final Jugador jugador, final Partido partido) {
    boolean _and = false;
    InscEstandar _inscEstandar = partido.getInscEstandar();
    ArrayList<Jugador> _jugadores = _inscEstandar.getJugadores();
    int _size = _jugadores.size();
    boolean _lessThan = (_size < 10);
    if (!_lessThan) {
      _and = false;
    } else {
      ArrayList<Jugador> _solidarios = this.getSolidarios();
      int _size_1 = _solidarios.size();
      boolean _lessThan_1 = (_size_1 < 10);
      _and = _lessThan_1;
    }
    if (_and) {
      ArrayList<Jugador> _solidarios_1 = this.getSolidarios();
      _solidarios_1.add(jugador);
    } else {
      boolean _and_1 = false;
      InscEstandar _inscEstandar_1 = partido.getInscEstandar();
      ArrayList<Jugador> _jugadores_1 = _inscEstandar_1.getJugadores();
      int _size_2 = _jugadores_1.size();
      boolean _lessThan_2 = (_size_2 < 10);
      if (!_lessThan_2) {
        _and_1 = false;
      } else {
        ArrayList<Jugador> _solidarios_2 = this.getSolidarios();
        int _size_3 = _solidarios_2.size();
        boolean _greaterThan = (_size_3 > 10);
        _and_1 = _greaterThan;
      }
      if (_and_1) {
        ArrayList<Jugador> _solidarios_3 = this.getSolidarios();
        ArrayList<Jugador> _solidarios_4 = this.getSolidarios();
        Jugador _get = _solidarios_4.get(1);
        _solidarios_3.remove(_get);
        ArrayList<Jugador> _solidarios_5 = this.getSolidarios();
        _solidarios_5.add(jugador);
      }
    }
  }
}
