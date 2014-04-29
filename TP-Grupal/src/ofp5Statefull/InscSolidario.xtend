package ofp5Statefull

import java.util.ArrayList

class InscSolidario implements Inscripcion {
	
	@Property ArrayList<Jugador> solidarios
	
	new(){
		this.solidarios = newArrayList()
	}
	
	override inscribir (Jugador jugador){
		if (solidarios.size < 10)
		{	
				solidarios.add(jugador)
		}
		else
		{
			solidarios.remove(solidarios.get(1))
			solidarios.add(jugador)
		}
	}
}