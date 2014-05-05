package opfv2

import java.util.ArrayList

class Partido {
	@Property
	String lugar
	int hora
	int fecha
	ArrayList <Jugador> estandares
	ArrayList <Jugador> solidarios
	ArrayList <Jugador> condicionales
	
	new(int hora, int fecha, String lugar) {
		this.hora = hora
		this.fecha = fecha
		this.lugar = lugar
		
		}
}