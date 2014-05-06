package opfv2;

import java.util.ArrayList;
import opfv2.Inscripcion;

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
  
  private ArrayList<Inscripcion> _estandares;
  
  public ArrayList<Inscripcion> getEstandares() {
    return this._estandares;
  }
  
  public void setEstandares(final ArrayList<Inscripcion> estandares) {
    this._estandares = estandares;
  }
  
  private ArrayList<Inscripcion> _solidarios;
  
  public ArrayList<Inscripcion> getSolidarios() {
    return this._solidarios;
  }
  
  public void setSolidarios(final ArrayList<Inscripcion> solidarios) {
    this._solidarios = solidarios;
  }
  
  private ArrayList<Inscripcion> _condicionales;
  
  public ArrayList<Inscripcion> getCondicionales() {
    return this._condicionales;
  }
  
  public void setCondicionales(final ArrayList<Inscripcion> condicionales) {
    this._condicionales = condicionales;
  }
  
  public Partido(final int hora, final int fecha, final String lugar) {
    this.hora = hora;
    this.fecha = fecha;
    this.setLugar(lugar);
    ArrayList<Inscripcion> _arrayList = new ArrayList<Inscripcion>();
    this.setEstandares(_arrayList);
    ArrayList<Inscripcion> _arrayList_1 = new ArrayList<Inscripcion>();
    this.setSolidarios(_arrayList_1);
    ArrayList<Inscripcion> _arrayList_2 = new ArrayList<Inscripcion>();
    this.setCondicionales(_arrayList_2);
  }
}
