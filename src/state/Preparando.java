package state;

import java.time.LocalDateTime;

public class Preparando implements Pedido {

	@Override
	public Pedido iniciaEtapa() {
		System.out.println("O pedido está sendo preparado");
		return this;
	}

	@Override
	public void alteraStatus(Restaurante pedido) {
		System.out.println("STATUS: PREPARANDO");
		pedido.setStatusDopedido(new Entrega());
	}

	@Override
	public Pedido imprimeStatus() {
		System.out.println("O pedido começou a ser preparado na cozinha às " + LocalDateTime.now());
		return this;
	}

}
