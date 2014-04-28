package ofp5

class InscEstandar implements Inscripcion {
	
	override inscribirse (Partido partido){
		partido.agregarJugador (this)
	}
}