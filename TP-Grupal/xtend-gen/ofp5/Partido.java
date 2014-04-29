package ofp5;

import com.google.common.base.Objects;
import java.util.ArrayList;
import ofp5.InscEstandar;
import ofp5.InscSolidario;
import ofp5.Jugador;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class Partido {
  private String lugar;
  
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
  
  private int hora;
  
  private int fecha;
  
  public Partido(final int hora, final int fecha, final String lugar) {
    this.hora = hora;
    this.fecha = fecha;
    this.lugar = lugar;
    ArrayList<Jugador> _newArrayList = CollectionLiterals.<Jugador>newArrayList();
    this.setJugadores(_newArrayList);
    ArrayList<Jugador> _newArrayList_1 = CollectionLiterals.<Jugador>newArrayList();
    this.setSolidarios(_newArrayList_1);
    ArrayList<Jugador> _newArrayList_2 = CollectionLiterals.<Jugador>newArrayList();
    this.setCondicionales(_newArrayList_2);
  }
  
  public Boolean inscribirA(final Jugador jugador, final String tipoInscripcion) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(tipoInscripcion,"estandar")) {
        _matched=true;
        InscEstandar _inscEstandar = new InscEstandar();
        _inscEstandar.inscribir(jugador, this);
      }
    }
    if (!_matched) {
      if (Objects.equal(tipoInscripcion,"solidario")) {
        _matched=true;
        InscSolidario _inscSolidario = new InscSolidario();
        _inscSolidario.inscribir(jugador, this);
      }
    }
    if (!_matched) {
      if (Objects.equal(tipoInscripcion,"condicional")) {
        _matched=true;
        ArrayList<Jugador> _condicionales = this.getCondicionales();
        _switchResult = _condicionales.add(jugador);
      }
    }
    return _switchResult;
  }
  
  public boolean agregarJugador(final Jugador jugador, final String tipoInscripcion) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(tipoInscripcion,"estandar")) {
        _matched=true;
        ArrayList<Jugador> _jugadores = this.getJugadores();
        _switchResult = _jugadores.add(jugador);
      }
    }
    if (!_matched) {
      if (Objects.equal(tipoInscripcion,"solidario")) {
        _matched=true;
        ArrayList<Jugador> _solidarios = this.getSolidarios();
        _switchResult = _solidarios.add(jugador);
      }
    }
    return _switchResult;
  }
  
  public boolean estaInscripto(final Jugador jugador, final String tipoInscripcion) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(tipoInscripcion,"estandar")) {
        _matched=true;
        ArrayList<Jugador> _jugadores = this.getJugadores();
        _switchResult = _jugadores.contains(jugador);
      }
    }
    if (!_matched) {
      if (Objects.equal(tipoInscripcion,"solidario")) {
        _matched=true;
        ArrayList<Jugador> _solidarios = this.getSolidarios();
        _switchResult = _solidarios.contains(jugador);
      }
    }
    return _switchResult;
  }
}
