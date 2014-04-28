package ofp5;

import java.util.Collection;
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
  
  private Collection<Jugador> _jugadores;
  
  public Collection<Jugador> getJugadores() {
    return this._jugadores;
  }
  
  public void setJugadores(final Collection<Jugador> jugadores) {
    this._jugadores = jugadores;
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
}
