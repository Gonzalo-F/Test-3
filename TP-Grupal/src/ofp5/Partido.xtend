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

	new(int hora, int fecha, String lugar) {
		this.hora = hora
		this.fecha = fecha
		this.lugar = lugar
		this.jugadores = newArrayList()
		this.solidarios = newArrayList()
		this.condicionales = newArrayList()
	}

	/* */
	def inscribirA(Jugador jugador, String tipoInscripcion) {
		switch tipoInscripcion {
			case "estandar":
			if (this.tamanioLista() < 10) {
				jugadores.add(jugador)
			}
		case "solidario":
			solidarios.add(jugador)
		case "condicional":
			if (condicion) { /*Ojo esto: yo creo que condicion deberia ser un Boolean, NO un metodo booleano */
				condicionales.add(jugador)
			}
		}
	}

def int	tamanioLista(){
		jugadores.size
	}

	def	tieneJugador(Jugador jugador) {
		/*HELP!!!! */
		jugadores.exists[unJugador | unJugador.getNombre() = jugador.getNombre()]
	}

}
