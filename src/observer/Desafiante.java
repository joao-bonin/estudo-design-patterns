package observer;

public class Desafiante implements Participante {
	private String nome;
	
	public Desafiante(String nome) {
		this.nome = nome;
	}

	@Override
	public void atualiza() {
		System.out.println("Um novo Desafiante foi adicionado a partida: " + this.nome);

	}

}
