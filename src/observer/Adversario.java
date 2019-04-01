package observer;

public class Adversario implements Participante{
	
	private String nome;
	
	public Adversario(String nome) {
		this.nome = nome;
	}

	@Override
	public void atualiza() {
		System.out.println("Um novo Adversário foi adicionado a partida: " + this.nome);
		
	}

}
