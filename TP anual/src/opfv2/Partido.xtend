package opfv2

import java.util.ArrayList

class Partido {
	@Property
	String lugar
	int hora
	int fecha
	@Property ArrayList <InscripEstandar> estandares
	@Property ArrayList <InscripSolidario> solidarios
	@Property ArrayList <InscripCondicional> condicionales
	
	new(int hora, int fecha, String lugar) {
		this.hora = hora
		this.fecha = fecha
		this.lugar = lugar
		
		}
}