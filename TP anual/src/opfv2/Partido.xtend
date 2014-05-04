package opfv2

class Partido {
	@Property
	String lugar
	int hora
	int fecha
	TipoInscripcion tipoinscripcion

	new(int hora, int fecha, String lugar) {
		this.hora = hora
		this.fecha = fecha
		this.lugar = lugar
		
		}
}