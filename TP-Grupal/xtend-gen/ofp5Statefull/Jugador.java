package ofp5Statefull;

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
}
