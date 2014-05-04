package opfv2

class Jugador {
	@Property
	int edad
	String nombre
	 
	new (int edad, String nombre){
		this.edad = edad
		this.nombre = nombre
	}
	
	def getNombre() 
	{
		nombre
	}
	
	def incribirseA(Partido partido){
		partido.tipoInscripcion.inscribir(this, Partido partido)
	}
}