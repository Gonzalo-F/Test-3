package opfv2;

import opfv2.Partido;

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
  
  public Object incribirseA(final Partido partido) {
    throw new Error("Unresolved compilation problems:"
      + "\nextraneous input \'partido\' expecting \')\'"
      + "\nThe method tipoInscripcion is undefined for the type Jugador"
      + "\ninscribir cannot be resolved");
  }
}
