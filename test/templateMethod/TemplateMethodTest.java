package templateMethod;

import org.junit.jupiter.api.Test;

class TemplateMethodTest {

	@Test
	void preparar_um_cafe() {
		
		Preparar cafe = new Cafe("Arabico");
		
		cafe.prepararBebida();
		
	}
	
	@Test
	void preparar_um_cha() {
		
		Preparar cha = new Cha("Erva Cidreira");
		
		cha.prepararBebida();
		
	}

}
