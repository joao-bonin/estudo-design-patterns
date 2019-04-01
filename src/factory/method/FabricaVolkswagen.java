package factory.method;

public class FabricaVolkswagen extends FabricaDeCarros{

	@Override
	public void criaCarro(String tipo) {
		if("Gol".equalsIgnoreCase(tipo)) {
			carro = new Gol();
		}else if("Polo".equalsIgnoreCase(tipo)){
			carro = new Polo();
		}
		
	}

}
