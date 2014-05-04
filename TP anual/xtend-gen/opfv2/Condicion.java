package opfv2;

import opfv2.Partido;

@SuppressWarnings("all")
public interface Condicion {
  public abstract boolean cumple(final Partido partido);
}
