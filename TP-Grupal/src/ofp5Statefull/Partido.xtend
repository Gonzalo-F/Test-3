package ofp5Statefull

class Partido {
	String lugar
	int hora
	int fecha
	InscEstandar inscEstandar
	InscSolidario inscSolidario
	InscCondicional inscCondicional

	new(int hora, int fecha, String lugar) {
		this.hora = hora
		this.fecha = fecha
		this.lugar = lugar
		this.inscEstandar = new InscEstandar
		this.inscSolidario = new InscSolidario
		this.inscCondicional = new InscCondicional
	}

	def inscribirA(Jugador jugador, String tipoInscripcion) {
		switch tipoInscripcion {
		case "estandar":
			{
				this.inscEstandar.inscribir(jugador)
			}
		case "solidario":
			{
				this.inscSolidario.inscribir(jugador)
			}
		case "condicional":
			{ 
				this.inscCondicional.inscribir(jugador)
			}
		}
	}
	
	
def estaInscripto(Jugador jugador, String tipoInscripcion){
	switch tipoInscripcion {
		case "estandar":
			{
				inscEstandar.jugadores.contains(jugador)
			}
		case "solidario":
			{
				inscSolidario.solidarios.contains(jugador)
			}
		}
	}
}