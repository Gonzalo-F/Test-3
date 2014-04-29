package ofp5;

import com.google.common.base.Objects;
import ofp5.InscEstandar;
import ofp5.InscSolidario;
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
    boolean _equals = Objects.equal(tipoInscripcion, "estandar");
    if (_equals) {
      InscEstandar _inscEstandar = new InscEstandar();
      _inscEstandar.inscribir(this, partido);
    } else {
      boolean _equals_1 = Objects.equal(tipoInscripcion, "solidario");
      if (_equals_1) {
        InscSolidario _inscSolidario = new InscSolidario();
        _inscSolidario.inscribir(this, partido);
      }
    }
  }
  
  public boolean estaEnElPartido(final Partido partido) {
    return partido.tieneJugador(this);
  }
  
  public void inscribirseCondicional(final Partido partido, final String condicion, final int valorNum, final int valorNum2, final String valorText) {
    throw new Error("Unresolved compilation problems:"
      + "\nInscCondLugar cannot be resolved."
      + "\nInscCondFecha cannot be resolved."
      + "\ninscribir cannot be resolved"
      + "\ninscribir cannot be resolved");
  }
}
