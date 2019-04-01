package factory.method;

public class FabricaFiat extends FabricaDeCarros{

	@Override
	public void criaCarro(String tipo) {
		if("Palio".equalsIgnoreCase(tipo)) {
			carro = new Palio();
		}else if("Uno".equalsIgnoreCase(tipo)){
			carro = new Uno();
		}
		
	}

}
