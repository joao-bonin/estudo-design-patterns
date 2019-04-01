package composite;

import org.junit.jupiter.api.Test;

class PlayerTest {

	@Test
	void compoe_uma_playlist() {
		
		Player playlist = new Playlist("Rock & Roll");
		
		Player anos70 = new Playlist("Anos 70'");
		
		Player ledZeppelin = new Faixa("Led Zeppelin - Black Dog");
		Player theWho = new Faixa("The Who - Pinball Wizard");
		Player blackSabbath = new Faixa("Black Sabbath - Sabbath Bloody Sabbath");
		Player deepPurple = new Faixa("Deep Purple - Perfect Strangers");
		
		((Playlist) anos70).adiciona(ledZeppelin);
		((Playlist) anos70).adiciona(theWho);
		((Playlist) anos70).adiciona(blackSabbath);
		((Playlist) anos70).adiciona(deepPurple);

		
		Player anos80 = new Playlist("Anos 80'");
		((Playlist) anos80).adiciona(new Faixa("Van Halen - Jump"));

		
		((Playlist) playlist).adiciona(anos70);
		((Playlist) playlist).adiciona(anos80);
		playlist.play();
		
		// Executa a playlist
		//anos80.play();
		
		// Executa uma musica
		//ledZeppelin.play();

		
		
		
	}

}
