package opfv2;

import opfv2.TipoInscripcion;

@SuppressWarnings("all")
public class Partido {
  private String _lugar;
  
  public String getLugar() {
    return this._lugar;
  }
  
  public void setLugar(final String lugar) {
    this._lugar = lugar;
  }
  
  private int hora;
  
  private int fecha;
  
  private TipoInscripcion tipoinscripcion;
  
  public Partido(final int hora, final int fecha, final String lugar) {
    this.hora = hora;
    this.fecha = fecha;
    this.setLugar(lugar);
  }
}