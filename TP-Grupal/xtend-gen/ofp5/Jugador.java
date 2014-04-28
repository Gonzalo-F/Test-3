package ofp5;

import ofp5.InscEstandar;
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
  
  private InscEstandar tipoInscripcion;
  
  public Jugador(final int edad) {
    this.setEdad(edad);
  }
  
  public void inscribirse(final Partido partido) {
    this.tipoInscripcion.inscribir(this, partido);
  }
}
