package ofp5Statefull;

import java.util.ArrayList;
import ofp5Statefull.Inscripcion;
import ofp5Statefull.Jugador;
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
  
  public void inscribir(final Jugador jugador) {
    ArrayList<Jugador> _condicionales = this.getCondicionales();
    _condicionales.add(jugador);
  }
}
