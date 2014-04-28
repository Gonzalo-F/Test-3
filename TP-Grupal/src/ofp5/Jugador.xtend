package ofp5

class Jugador {
	@Property int edad
	
	InscEstandar tipoInscripcion
	
	 
	
	new(int edad){
		this.edad = edad
		
	}
	
	def void inscribirse(Partido partido){
		tipoInscripcion.inscribir(this, partido)
	}
	
}