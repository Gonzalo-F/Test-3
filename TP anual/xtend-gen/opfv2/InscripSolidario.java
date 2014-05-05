package opfv2;

import excepciones.InscripcionRechazadaException;
import java.util.ArrayList;
import opfv2.Jugador;
import opfv2.Partido;
import opfv2.TipoInscripcion;

@SuppressWarnings("all")
public class InscripSolidario implements TipoInscripcion {
  public void inscribir(final Jugador jugador, final Partido partido) {
    ArrayList<Jugador> _estandares = partido.getEstandares();
    int _size = _estandares.size();
    boolean _lessThan = (_size < 10);
    if (_lessThan) {
      ArrayList<Jugador> _solidarios = partido.getSolidarios();
      _solidarios.add(jugador);
    } else {
      throw new InscripcionRechazadaException("Ya hay 10 inscriptos estandar en la lista");
    }
  }
}
