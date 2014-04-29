package ofp5;

import com.google.common.base.Objects;
import java.util.ArrayList;
import ofp5.Jugador;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class Partido {
  private String _lugar;
  
  public String getLugar() {
    return this._lugar;
  }
  
  public void setLugar(final String lugar) {
    this._lugar = lugar;
  }
  
  private ArrayList<Jugador> _jugadores;
  
  public ArrayList<Jugador> getJugadores() {
    return this._jugadores;
  }
  
  public void setJugadores(final ArrayList<Jugador> jugadores) {
    this._jugadores = jugadores;
  }
  
  private ArrayList<Jugador> _solidarios;
  
  public ArrayList<Jugador> getSolidarios() {
    return this._solidarios;
  }
  
  public void setSolidarios(final ArrayList<Jugador> solidarios) {
    this._solidarios = solidarios;
  }
  
  private ArrayList<Jugador> _condicionales;
  
  public ArrayList<Jugador> getCondicionales() {
    return this._condicionales;
  }
  
  public void setCondicionales(final ArrayList<Jugador> condicionales) {
    this._condicionales = condicionales;
  }
  
  private int _hora;
  
  public int getHora() {
    return this._hora;
  }
  
  public void setHora(final int hora) {
    this._hora = hora;
  }
  
  private int _fecha;
  
  public int getFecha() {
    return this._fecha;
  }
  
  public void setFecha(final int fecha) {
    this._fecha = fecha;
  }
  
  public Partido(final int hora, final int fecha, final String lugar) {
    this.setHora(hora);
    this.setFecha(fecha);
    this.setLugar(lugar);
    ArrayList<Jugador> _newArrayList = CollectionLiterals.<Jugador>newArrayList();
    this.setJugadores(_newArrayList);
    ArrayList<Jugador> _newArrayList_1 = CollectionLiterals.<Jugador>newArrayList();
    this.setSolidarios(_newArrayList_1);
    ArrayList<Jugador> _newArrayList_2 = CollectionLiterals.<Jugador>newArrayList();
    this.setCondicionales(_newArrayList_2);
  }
  
  public boolean agregarJugador(final Jugador jugador, final String tipoInscripcion) {
    boolean _xifexpression = false;
    boolean _equals = Objects.equal(tipoInscripcion, "estandar");
    if (_equals) {
      ArrayList<Jugador> _jugadores = this.getJugadores();
      _xifexpression = _jugadores.add(jugador);
    } else {
      boolean _xifexpression_1 = false;
      boolean _equals_1 = Objects.equal(tipoInscripcion, "solidario");
      if (_equals_1) {
        ArrayList<Jugador> _solidarios = this.getSolidarios();
        _xifexpression_1 = _solidarios.add(jugador);
      } else {
        ArrayList<Jugador> _condicionales = this.getCondicionales();
        _xifexpression_1 = _condicionales.add(jugador);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public boolean tieneJugador(final Jugador jugador) {
    ArrayList<Jugador> _jugadores = this.getJugadores();
    return _jugadores.contains(jugador);
  }
}
