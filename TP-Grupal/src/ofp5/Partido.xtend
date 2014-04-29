package ofp5

import java.util.ArrayList

class Partido {
	String lugar
	@Property ArrayList<Jugador> jugadores
	@Property ArrayList<Jugador> solidarios
	@Property ArrayList<Jugador> condicionales
	int hora
	int fecha

	new(int hora, int fecha, String lugar) {
		this.hora = hora
		this.fecha = fecha
		this.lugar = lugar
		this.jugadores = newArrayList()
		this.solidarios = newArrayList()
		this.condicionales = newArrayList()
	}

	def inscribirA(Jugador jugador, String tipoInscripcion) {
		switch tipoInscripcion {
		case "estandar":
			{
				new InscEstandar().inscribir(jugador, this)
			}
		case "solidario":
			{
				new InscSolidario().inscribir(jugador, this)
			}
		case "condicional":
			{ 
				condicionales.add(jugador)
			}
		}
	}
	
	def agregarJugador(Jugador jugador, String tipoInscripcion){
		switch tipoInscripcion {
		case "estandar":
			{
				jugadores.add(jugador)
			}
		case "solidario":
			{
				solidarios.add(jugador)
			}
		}
	}

def estaInscripto(Jugador jugador, String tipoInscripcion){
	switch tipoInscripcion {
		case "estandar":
			{
				jugadores.contains(jugador)
			}
		case "solidario":
			{
				solidarios.contains(jugador)
			}
		}
	}
}