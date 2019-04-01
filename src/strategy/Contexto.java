package strategy;

public class Contexto {
	
	private Calcular calcular;

	//Pode ser o construtor, que irá selecionar a estrategia.
	public void setEstrategia(Calcular calcular) {
		this.calcular = calcular;
	}
	
	
	public int executarEstrategia(int a, int b) {
		return calcular.operacao(a, b);
	}

}
