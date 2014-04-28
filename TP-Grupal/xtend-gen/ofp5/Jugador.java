package ofp5;

import ofp5.Partido;

@SuppressWarnings("all")
public class Jugador {
  private int _edad;
  
  public int getEdad() {
    return this._edad;
  }
  
  public void setEdad(final int edad) {
    this._edad = edad;
  }
  
  public Jugador(final int edad) {
    this.setEdad(edad);
  }
  
  public void inscribirseA(final Partido partido, final String tipoInscripcion) {
    partido.inscribirA(this, tipoInscripcion);
  }
}
