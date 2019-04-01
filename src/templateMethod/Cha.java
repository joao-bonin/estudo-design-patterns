package templateMethod;

public class Cha extends Preparar {
	
	public Cha(String tipoCha) {
		this.tipo  = tipoCha;
	}

	@Override
	void ferverAgua() {
		System.out.println("Fervendo agua... (TEMPO: 8 Minutos)");

	}

	@Override
	void escolherBebida() {
		System.out.println("Tipo de Chá escolhido é: " + this.tipo);

	}

	@Override
	void misturar() {
		System.out.println("Realizando a infusão do chá...");

	}

}
