package observer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CadastroPeladaTest {

	@Test
	void criando_nova_pelada() {
		Partida partida = new Partida();
		
		partida.addParticipante(new Adversario("João"));
		partida.addParticipante(new Adversario("Flávio"));
		partida.addParticipante(new Adversario("Ana Maria"));
		partida.addParticipante(new Adversario("Pedro"));
		partida.addParticipante(new Adversario("Carla"));
		
		partida.addParticipante(new Desafiante("Marta"));
		partida.addParticipante(new Desafiante("Manuel"));
		partida.addParticipante(new Desafiante("Bolinha"));
		partida.addParticipante(new Desafiante("Manu"));
		partida.addParticipante(new Desafiante("Lindomar"));
		
		
		
		partida.atualiza();
		
		assertEquals(10, partida.getParticipantes().size());
		
	}


}
