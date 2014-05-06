package opfv2

abstract class TipoInscripcion {
	var	Inscripcion unaInscripcion
	
	new (Inscripcion insc){
		this.unaInscripcion = insc
	}
	def abstract void inscribirA(Jugador jugador,Partido partido)
}