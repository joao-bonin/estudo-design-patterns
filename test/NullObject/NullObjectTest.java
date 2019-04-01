package NullObject;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import nullObject.Mesa;
import nullObject.MesaQuadrada;
import nullObject.MesaRetangular;
import nullObject.NullMesa;

class NullObjectTest {

	@Test
	void testa_null_object() {
		Mesa mesa = null;
		//Mesa mesa =  new MesaRetangular();
		//mesa.exibi();
		
		mesa = (mesa != null) ? mesa : new NullMesa();
		
		//assertFalse(mesa.isNull());
		assertTrue(mesa.isNull());
	}
	
	@Test
	void testa_mesa_retangular_passando_parametros() {
		Mesa mesa = new MesaRetangular(5, 4);
		assertFalse(mesa.isNull());
		assertEquals(20, mesa.area());
	}
	
	@Test
	void testa_mesa_retangular_sem_parametros() {
		Mesa mesa = new MesaRetangular();
		assertFalse(mesa.isNull());
		assertEquals(1, mesa.area());
	}
	
	@Test
	void testa_mesa_quadrada_passando_parametros() {
		Mesa mesa = new MesaQuadrada(5);
		assertFalse(mesa.isNull());
		assertEquals(25, mesa.area());
	}
	
	@Test
	void testa_mesa_quadrada_sem_parametros() {
		Mesa mesa = new MesaQuadrada();
		assertFalse(mesa.isNull());
		assertEquals(1, mesa.area());
	}
	
	
	@Test
	void constroi_mesa_por_parametro() {
		List<String> formatos = Arrays.asList("Quadrado", "Retangular", null, "Redonda");
		formatos.forEach((formato) -> constroiMesa(formato).exibi());
	}

	/**
	 * Uma especia de Factory Method
	 * 
	 * @param formato
	 * @return
	 */
	private static Mesa constroiMesa(String formato) {
		Mesa mesa = null;
		
		if("Quadrado".equalsIgnoreCase(formato)) {
			mesa = new MesaQuadrada();
		}else if ("Retangular".equalsIgnoreCase(formato)) {
			mesa = new MesaRetangular();
		}else {
			/*
			 * Aqui que é o "Cerne" do Pattern.
			 * Caso tentarmos recuperar algo que nao exista sempre instanciamos a classe Null...
			 * Um cenario para entender melhor o contexto do Pattern seria:
			 * Imagina que temos um sala (com relacionamento a mesa). Quando instanciarmos a sala e fizermos um getMesa,
			 * podemos devovelr a referencia polimorfica, ou caso não exista o objeto NullMesa.
			 * 
			 * A grande vantagem seria que tratamos isso somente na recuperação do objeto.
			 * Logo, Não iriamos precisar nos preucupar com a verificação em vários pontos do sitema 
			 */
			
			mesa = new NullMesa();
		}
		
		return mesa;
		
	}

}
