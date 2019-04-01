package state;

public interface Pedido {
	
	Pedido iniciaEtapa();
	
	//Alteração do estado é realizada nas Sub-classes
	void alteraStatus(Restaurante pedido);

	Pedido imprimeStatus();
}
