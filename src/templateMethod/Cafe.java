package templateMethod;

public class Cafe extends Preparar{
	
	public Cafe(String tipoCafe) {
		this.tipo = tipoCafe;
	}

	@Override
	void ferverAgua() {
		System.out.println("Fervendo agua... (TEMPO: 10 Minutos)");
		
	}

	@Override
	void escolherBebida() {
		System.out.println("Tipo de Café escolhido é: " + this.tipo);
		
	}

	@Override
	void misturar() {
		System.out.println("Misturando o café com o coador de pano");
		
	}

}
