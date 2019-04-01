package composite;

public class Faixa implements Player{
	
	private String faixa;

	public Faixa(String faixa) {
		this.faixa = faixa;
	}

	@Override
	public void play() {
		System.out.println("Tocando a musica: " + this.faixa);
		
	}

}
