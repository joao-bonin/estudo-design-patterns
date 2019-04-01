package strategy;

public class Somar implements Calcular{

	@Override
	public int operacao(int a, int b) {
		return a+b;
	}

}
