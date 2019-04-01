package chainOfResponsability;

public abstract class BancoChain {
	
	protected BancoChain next;
	protected IDBancos identificadorDoBanco;
	
	
	public BancoChain(IDBancos id) {
		this.next = null;
		this.identificadorDoBanco = id;
	}
	
	// Metodo que realiza o encadeamento por recursividade na Super Classe
	// Executando desta forma todos os elementos da cadeia.
	public void setNext(BancoChain forma) {
		if(next == null) {
			next = forma;
		}else {
			next.setNext(forma);
		}
		
	}
	
	public void efetuarPagamento(IDBancos id) throws Exception{
		if(podeEfetuarPagamento(id)) {
			efetuaPagamento();
		}else {
			if(next == null) {
				throw new Exception("Banco não cadastrado");
			}
			next.efetuarPagamento(id);
		}
	}

	public boolean podeEfetuarPagamento(IDBancos id) {
		if(id.equals(identificadorDoBanco)) {
			return true;
		}
		return false;
	}
	
	// Representa a execução logica somente daquele elemento.
	protected abstract void efetuaPagamento();
	


}
