package factoryMethod;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import factory.method.Carro;
import factory.method.FabricaFiat;
import factory.method.FabricaVolkswagen;
import factory.simple.FabricarTijolo;

class FactoryMethodTest {

	@Test
	void teste_simple_factory() {
		List<String> tipos = Arrays.asList("macico", "ceramica", "concreto");
		tipos.forEach((tipo) -> System.out.println(FabricarTijolo.criarTijolo(tipo).toString()));
	}
	
	@Test
	void teste_factory_method() {
		// Cria Carros da volks
		FabricaVolkswagen wolksWagem = new FabricaVolkswagen();
		wolksWagem.criaCarro("gol");
		Carro entregaCarroWolkswagen = wolksWagem.entregaCarro();
		System.out.println(entregaCarroWolkswagen);
		
		//Cria carros da Fiat
		FabricaFiat fabricaFiat = new FabricaFiat();
		fabricaFiat.criaCarro("Palio");
		Carro entregaCarroFiat = fabricaFiat.entregaCarro();
		System.out.println(entregaCarroFiat);
		
	}

}
