package ofp5;

import com.google.common.base.Objects;
import java.util.ArrayList;
import ofp5.InscEstandar;
import ofp5.InscSolidario;
import ofp5.Jugador;

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
  }
  
  public void inscribirA(final Jugador jugador, final String tipoInscripcion) {
    boolean _equals = Objects.equal(tipoInscripcion, "estandar");
    if (_equals) {
      InscEstandar _inscEstandar = new InscEstandar();
      _inscEstandar.inscribir(jugador, this);
    } else {
      boolean _equals_1 = Objects.equal(tipoInscripcion, "solidario");
      if (_equals_1) {
        InscSolidario _inscSolidario = new InscSolidario();
        _inscSolidario.inscribir(jugador, this);
      }
    }
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
}
