package composite;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements Player{

	private String nome;
	private List<Player> playlist;
	
	
	public Playlist(String nome) {
		this.nome= nome;
		this.playlist = new ArrayList<>();
	}

	@Override
	public void play() {
		System.out.println("Executando a playlist: " + this.nome);
		for (Player player : playlist) {
			//Aqui esta a chamada recursiva, que irá varrer toda "arvore de elementos".
			player.play();
		}
	}

	public void adiciona(Player faixa) {
		playlist.add(faixa);
		
	}
	
	public void remove(Player faixa) {
		playlist.remove(faixa);
		
	}
}
