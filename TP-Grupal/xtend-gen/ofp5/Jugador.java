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
  
  public void inscribirseCondicional(final Partido partido, final String condicion, final int valorNum, final int valorNum2, final String valorText) {
    throw new Error("Unresolved compilation problems:"
      + "\nInscCondLugar cannot be resolved."
      + "\nInscCondFecha cannot be resolved."
      + "\ninscribir cannot be resolved"
      + "\ninscribir cannot be resolved");
  }
}
