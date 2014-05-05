package opfv2;

import opfv2.Partido;
import opfv2.TipoInscripcion;

@SuppressWarnings("all")
public class Jugador {
  private int _edad;
  
  public int getEdad() {
    return this._edad;
  }
  
  public void setEdad(final int edad) {
    this._edad = edad;
  }
  
  private String nombre;
  
  public Jugador(final int edad, final String nombre) {
    this.setEdad(edad);
    this.nombre = nombre;
  }
  
  public String getNombre() {
    return this.nombre;
  }
  
  public void incribirseEn(final Partido partido, final TipoInscripcion tipoInscripcion) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Jugador to Jugador");
  }
}
