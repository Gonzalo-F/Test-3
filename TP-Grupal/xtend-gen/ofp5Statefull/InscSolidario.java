package ofp5Statefull;

import java.util.ArrayList;
import ofp5Statefull.Inscripcion;
import ofp5Statefull.Jugador;
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
  
  public void inscribir(final Jugador jugador) {
    ArrayList<Jugador> _solidarios = this.getSolidarios();
    int _size = _solidarios.size();
    boolean _lessThan = (_size < 10);
    if (_lessThan) {
      ArrayList<Jugador> _solidarios_1 = this.getSolidarios();
      _solidarios_1.add(jugador);
    } else {
      ArrayList<Jugador> _solidarios_2 = this.getSolidarios();
      ArrayList<Jugador> _solidarios_3 = this.getSolidarios();
      Jugador _get = _solidarios_3.get(1);
      _solidarios_2.remove(_get);
      ArrayList<Jugador> _solidarios_4 = this.getSolidarios();
      _solidarios_4.add(jugador);
    }
  }
}
