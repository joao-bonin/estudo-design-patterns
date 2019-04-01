package factory.simple;

public class Tijolo {
	
	private double altura;
	
	private double largura;
	
	private double comprimento;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getProfundidade() {
		return comprimento;
	}

	public void setProfundidade(double profundidade) {
		this.comprimento = profundidade;
	}
	
	@Override
	public String toString() {
		StringBuilder string =  new StringBuilder();
		string.append("O tijolo possui as seguintes dimensões: \n");
		string.append("Altura: " + getAltura() + "\n");
		string.append("Largura: " + getLargura() + "\n");
		string.append("Comprimento: " + getProfundidade() + "\n");
		string.append("****************************************");
		return string.toString();
	}

}
