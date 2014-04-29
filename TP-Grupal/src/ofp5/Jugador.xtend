package ofp5

class Jugador {
	@Property int edad
	 
	
	new(int edad){
		this.edad = edad
		
	}
	
	def void inscribirseA(Partido partido, String tipoInscripcion){
		partido.inscribirA(this, tipoInscripcion)
	}
	
	def estaEnElPartido(Partido partido) {
 		partido.tieneJugador(this)
  	}

	def void inscribirseCondicional(Partido partido, String condicion, int valorNum, int valorNum2, String valorText){
		if (condicion == "edad"){
			new InscCondEdad().inscribir(this, partido, valorNum, valorNum2)
			}
		else if (condicion == "lugar"){
				new InscCondLugar().inscribir(this, partido, valorText)
				}
			else if(condicion == "fecha"){
					new InscCondFecha().inscribir(this, partido, valorNum)
				}
	}

}
