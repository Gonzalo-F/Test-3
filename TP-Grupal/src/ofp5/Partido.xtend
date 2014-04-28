package ofp5

import java.util.Collection

class Partido {
	@Property String lugar
	@Property Collection<Jugador> jugadores
	@Property Collection<Jugador> solidarios
	@Property Collection<Jugador> condicionales
	@Property int hora
	@Property int fecha
	
	new(int hora, int fecha, String lugar){
		this.hora = hora
		this.fecha = fecha
		this.lugar = lugar
	}
	
	
	def inscribirA(Jugador jugador, String tipoInscripcion){
		if (tipoInscripcion == "estandar"){
			new InscEstandar().inscribir(jugador, this)
			}
		else if(tipoInscripcion == "solidario"){
			new InscSolidario().inscribir(jugador, this)
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
	
}