package opfv2;

import opfv2.Condicion;
import opfv2.Partido;

@SuppressWarnings("all")
public class CondicionEdad implements Condicion {
  public boolean cumple(final Partido partido) {
    return true;
  }
}
