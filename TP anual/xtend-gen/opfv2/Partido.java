package opfv2;

import java.util.ArrayList;
import opfv2.Jugador;

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
  
  private ArrayList<Jugador> _estandares;
  
  public ArrayList<Jugador> getEstandares() {
    return this._estandares;
  }
  
  public void setEstandares(final ArrayList<Jugador> estandares) {
    this._estandares = estandares;
  }
  
  private ArrayList<Jugador> _solidarios;
  
  public ArrayList<Jugador> getSolidarios() {
    return this._solidarios;
  }
  
  public void setSolidarios(final ArrayList<Jugador> solidarios) {
    this._solidarios = solidarios;
  }
  
  private ArrayList<Jugador> _condicionales;
  
  public ArrayList<Jugador> getCondicionales() {
    return this._condicionales;
  }
  
  public void setCondicionales(final ArrayList<Jugador> condicionales) {
    this._condicionales = condicionales;
  }
  
  public Partido(final int hora, final int fecha, final String lugar) {
    this.hora = hora;
    this.fecha = fecha;
    this.setLugar(lugar);
    ArrayList<Jugador> _arrayList = new ArrayList<Jugador>();
    this.setEstandares(_arrayList);
    ArrayList<Jugador> _arrayList_1 = new ArrayList<Jugador>();
    this.setSolidarios(_arrayList_1);
    ArrayList<Jugador> _arrayList_2 = new ArrayList<Jugador>();
    this.setCondicionales(_arrayList_2);
  }
}
