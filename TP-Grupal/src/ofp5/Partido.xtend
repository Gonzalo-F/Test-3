package ofp5

import java.util.ArrayList

class Partido {
	@Property
	String lugar
	ArrayList<Jugador> jugadores
	ArrayList<Jugador> solidarios
	ArrayList<Jugador> condicionales
	int hora
	int fecha
	
	new(int hora, int fecha, String lugar){
		this.hora = hora
		this.fecha = fecha
		this.lugar = lugar
		this.jugadores = newArrayList()
		this.solidarios = newArrayList()
		this.condicionales = newArrayList()
	}
	
	
	def inscribirA(Jugador jugador, String tipoInscripcion){
		if (tipoInscripcion == "estandar"){
			new InscEstandar().inscribir(jugador, this)
			}
		else {
			if(tipoInscripcion == "solidario"){
				new InscSolidario().inscribir(jugador, this)
			}
			
			}
	}
	
	def agregarJugador(Jugador jugador, String tipoInscripcion){
		if (tipoInscripcion == "estandar"){
			jugadores.add(jugador)
			}
		else if(tipoInscripcion == "solidario"){
				solidarios.add(jugador)
			}
			else{
				condicionales.add(jugador)
			}
	}

def tieneJugador(Jugador jugador) {
		jugadores.exists[jugador]
	}
	
}