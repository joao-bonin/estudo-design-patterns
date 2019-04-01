package state;

import java.time.LocalDateTime;

public class Entrega implements Pedido {

	@Override
	public Pedido iniciaEtapa() {
		System.out.println("Pedido sai para entrega");
		return this;
	}

	@Override
	public void alteraStatus(Restaurante pedido) {
		System.out.println("STATUS: SAIU PARA ENTREGA");
		pedido.setStatusDopedido(new Iniciado());
	}

	@Override
	public Pedido imprimeStatus() {
		System.out.println("O pedido saiu para entrega às: " + LocalDateTime.now());
		return this;
	}

}
