package ofp5Statefull;

import com.google.common.base.Objects;
import java.util.ArrayList;
import ofp5Statefull.InscCondicional;
import ofp5Statefull.InscEstandar;
import ofp5Statefull.InscSolidario;
import ofp5Statefull.Jugador;

@SuppressWarnings("all")
public class Partido {
  private String lugar;
  
  private int hora;
  
  private int fecha;
  
  private InscEstandar _inscEstandar;
  
  public InscEstandar getInscEstandar() {
    return this._inscEstandar;
  }
  
  public void setInscEstandar(final InscEstandar inscEstandar) {
    this._inscEstandar = inscEstandar;
  }
  
  private InscSolidario inscSolidario;
  
  private InscCondicional inscCondicional;
  
  public Partido(final int hora, final int fecha, final String lugar) {
    this.hora = hora;
    this.fecha = fecha;
    this.lugar = lugar;
    InscEstandar _inscEstandar = new InscEstandar();
    this.setInscEstandar(_inscEstandar);
    InscSolidario _inscSolidario = new InscSolidario();
    this.inscSolidario = _inscSolidario;
    InscCondicional _inscCondicional = new InscCondicional();
    this.inscCondicional = _inscCondicional;
  }
  
  public void inscribirA(final Jugador jugador, final String tipoInscripcion) {
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(tipoInscripcion,"estandar")) {
        _matched=true;
        InscEstandar _inscEstandar = this.getInscEstandar();
        _inscEstandar.inscribir(jugador, this);
      }
    }
    if (!_matched) {
      if (Objects.equal(tipoInscripcion,"solidario")) {
        _matched=true;
        this.inscSolidario.inscribir(jugador, this);
      }
    }
    if (!_matched) {
      if (Objects.equal(tipoInscripcion,"condicional")) {
        _matched=true;
        this.inscCondicional.inscribir(jugador, this);
      }
    }
  }
  
  public boolean estaInscripto(final Jugador jugador, final String tipoInscripcion) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(tipoInscripcion,"estandar")) {
        _matched=true;
        InscEstandar _inscEstandar = this.getInscEstandar();
        ArrayList<Jugador> _jugadores = _inscEstandar.getJugadores();
        _switchResult = _jugadores.contains(jugador);
      }
    }
    if (!_matched) {
      if (Objects.equal(tipoInscripcion,"solidario")) {
        _matched=true;
        ArrayList<Jugador> _solidarios = this.inscSolidario.getSolidarios();
        _switchResult = _solidarios.contains(jugador);
      }
    }
    return _switchResult;
  }
}
