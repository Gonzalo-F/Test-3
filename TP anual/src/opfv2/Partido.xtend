package opfv2

import java.util.ArrayList

class Partido {
	@Property
	String lugar
	int hora
	int fecha
	@Property ArrayList<Inscripcion> estandares
	@Property ArrayList<Inscripcion> solidarios
	@Property ArrayList<Inscripcion> condicionales

	new(int hora, int fecha, String lugar) {
		this.hora = hora
		this.fecha = fecha
		this.lugar = lugar
		this.estandares = new ArrayList()
		this.solidarios = new ArrayList()
		this.condicionales = new ArrayList()
	}
}
