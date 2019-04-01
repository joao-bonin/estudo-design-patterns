package State;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import state.Restaurante;

class StateTest {

	@Test
	void realiza_pedido() {
		Restaurante restauranteChines = new Restaurante();
		
		List<String> itens = Arrays.asList("1/2 Porção - Lombinho Chinês", "1 Porção -Yakimeshi", "1 - Coca-cola 2L");
		
		restauranteChines.fazerPedido(itens);
	}
	

	@Test
	void faz_encadeamento() {
		Restaurante restauranteChines = new Restaurante();
		
		//Vai alterando as etapas pelo sub-classe
		restauranteChines.proximaEtapa();
		restauranteChines.proximaEtapa();
		restauranteChines.proximaEtapa();
	}

}
