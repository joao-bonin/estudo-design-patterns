package strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestaCalculadora {

	@Test
	void soma() {
		Contexto contexto = new Contexto();
		Somar somar = new Somar();
		
		contexto.setEstrategia(somar);
		int resultadoSoma = contexto.executarEstrategia(5, 5);
		
		assertEquals(10, resultadoSoma);
	}
	
	@Test
	void subtracao() {
		Contexto contexto = new Contexto();
		Subtrair subtrair = new Subtrair();
		
		contexto.setEstrategia(subtrair);
		int resultadoSubtracao = contexto.executarEstrategia(10, 10);
		
		assertEquals(0, resultadoSubtracao);
	}
	
	@Test
	void mutiplicacao() {
		Contexto contexto = new Contexto();
		Mutiplicar mutiplicar = new Mutiplicar();
		
		contexto.setEstrategia(mutiplicar);
		int resultadoMutiplicacao = contexto.executarEstrategia(10, 10);
		
		assertEquals(100, resultadoMutiplicacao);
	}

}
