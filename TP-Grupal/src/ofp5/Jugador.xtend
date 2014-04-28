package ofp5

class Jugador {
	@Property int edad
	 
	
	new(int edad){
		this.edad = edad
		
	}
	
	def void inscribirseA(Partido partido, String tipoInscripcion){
		partido.inscribirA(this, tipoInscripcion)
	}
	
}