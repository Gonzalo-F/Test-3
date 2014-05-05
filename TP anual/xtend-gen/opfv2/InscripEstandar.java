package opfv2;

import java.util.ArrayList;
import opfv2.Jugador;
import opfv2.Partido;
import opfv2.TipoInscripcion;

@SuppressWarnings("all")
public class InscripEstandar implements TipoInscripcion {
  private ArrayList<Jugador> _estandares;
  
  public ArrayList<Jugador> getEstandares() {
    return this._estandares;
  }
  
  public void setEstandares(final ArrayList<Jugador> estandares) {
    this._estandares = estandares;
  }
  
  public void inscribir(final Jugador jugador, final Partido partido) {
    throw new Error("Unresolved compilation problems:"
      + "\nInscripcionRechazadaException cannot be resolved.");
  }
}
