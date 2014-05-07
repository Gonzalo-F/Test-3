package opfv2;

import excepciones.InscripcionRechazadaException;
import java.util.ArrayList;
import opfv2.Inscripcion;
import opfv2.Jugador;
import opfv2.Partido;
import opfv2.TipoInscripcion;

@SuppressWarnings("all")
public class InscripCondicional implements TipoInscripcion {
  public void inscribirA(final Jugador jugador, final Partido partido, final Inscripcion unaInsc) {
    ArrayList<Inscripcion> _estandares = partido.getEstandares();
    int _size = _estandares.size();
    boolean _lessThan = (_size < 10);
    if (_lessThan) {
      ArrayList<Inscripcion> _condicionales = partido.getCondicionales();
      _condicionales.add(unaInsc);
    } else {
      throw new InscripcionRechazadaException("Ya hay 10 inscriptos estandar en la lista");
    }
  }
}
