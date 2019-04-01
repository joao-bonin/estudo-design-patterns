package observer;

import java.util.ArrayList;
import java.util.List;

/*
 * Criação do "Subject"
 */
public class Partida {

	private List<Participante> participantes = new ArrayList<>();
	
	public void addParticipante(Participante participante) {
		participantes.add(participante);
	}

	public void atualiza() {
		participantes.forEach(participante -> participante.atualiza());
	}

	public List<Participante> getParticipantes() {
		return this.participantes;
	}

}
