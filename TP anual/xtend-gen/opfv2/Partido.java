package opfv2;

import java.util.ArrayList;
import opfv2.InscripCondicional;
import opfv2.InscripEstandar;
import opfv2.InscripSolidario;

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
  
  private ArrayList<InscripEstandar> _estandares;
  
  public ArrayList<InscripEstandar> getEstandares() {
    return this._estandares;
  }
  
  public void setEstandares(final ArrayList<InscripEstandar> estandares) {
    this._estandares = estandares;
  }
  
  private ArrayList<InscripSolidario> _solidarios;
  
  public ArrayList<InscripSolidario> getSolidarios() {
    return this._solidarios;
  }
  
  public void setSolidarios(final ArrayList<InscripSolidario> solidarios) {
    this._solidarios = solidarios;
  }
  
  private ArrayList<InscripCondicional> _condicionales;
  
  public ArrayList<InscripCondicional> getCondicionales() {
    return this._condicionales;
  }
  
  public void setCondicionales(final ArrayList<InscripCondicional> condicionales) {
    this._condicionales = condicionales;
  }
  
  public Partido(final int hora, final int fecha, final String lugar) {
    this.hora = hora;
    this.fecha = fecha;
    this.setLugar(lugar);
  }
}
