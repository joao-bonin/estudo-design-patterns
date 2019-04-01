package state;

import java.time.LocalDateTime;

public class Iniciado implements Pedido {

	@Override
	public Pedido iniciaEtapa() {
		System.out.println("Iniciando o pedido");
		return this;
	}

	@Override
	public void alteraStatus(Restaurante pedido) {
		System.out.println("STATUS: INICIADO");
		pedido.setStatusDopedido(new Preparando());
	}

	@Override
	public Pedido imprimeStatus() {
		System.out.println("O pedido foi iniciado às: " + LocalDateTime.now());
		return this;
	}

}
