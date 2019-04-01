package state;

import java.util.List;

/**
 * Classe de Contexto do padrão State
 * @author manolo
 *
 */
public class Restaurante {
	
	private Pedido pedido;
	
	//Estado corrente do objeto
	public Restaurante() {
		pedido = new Iniciado();
	}
	
	//Altera o status do pedido
	public void setStatusDopedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	//Realiza o encadeamento de etapas
	public void proximaEtapa() {
		pedido.alteraStatus(this);
	}
	
	//Metodo que realiza o pedido
	public void fazerPedido(List<String> itens) {
		 
		System.out.println("*** Itens do Pedido *** ");
		itens.forEach(x -> System.out.println(x));
		
		System.out.println("========================================================");

		pedido.iniciaEtapa();
		pedido.imprimeStatus();
		pedido.alteraStatus(this);
		
		
		System.out.println("========================================================");
		
		pedido.iniciaEtapa();
		pedido.imprimeStatus();
		pedido.alteraStatus(this);
		
		System.out.println("========================================================");
		
		pedido.iniciaEtapa();
		pedido.imprimeStatus();
		pedido.alteraStatus(this);
		
	}
	
	

}
