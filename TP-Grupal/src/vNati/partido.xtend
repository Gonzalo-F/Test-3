

import java.util.ArrayList

class Partido {
	@Property String lugar
	@Property ArrayList<Jugador> jugadores
	@Property ArrayList<Jugador> solidarios
	@Property ArrayList<Jugador> condicionales
	@Property int hora
	@Property int fecha
	@Property TipoInscripcion tipoinscripcion

	
	//no esto a mi entender basicamente es copiar y pegar lo que hizo Gonzo//
	//no lo segui poniendo porque nose como van a dejar el tema de la incripcion//
	
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