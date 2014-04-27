package statefull

import org.junit.Test
import org.junit.Assert

@Test
class Testeo2 {
	def void testfuckingTesteo() {
		var Recepcionista unaRecep
		unaRecep = new Recepcionista
		var Mundo unMundo
		unMundo = new Mundo
		unaRecep.saludar(unMundo)
		Assert.AssertTrue(recepcionista.saludar(unMundo))
	}
}
