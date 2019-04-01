package factory.method;

public abstract class FabricaDeCarros {
	protected Carro carro;
	
	// Este é o Factory Method
	public abstract void criaCarro(String tipo);
	
	public Carro entregaCarro() {
		return carro;
				
	}

}
