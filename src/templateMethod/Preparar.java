package templateMethod;

public abstract class Preparar {
	
	String tipo; 
	
	/**
	 * Este é o template method.
	 */
	public final void prepararBebida() {
		ferverAgua();
		escolherBebida();
		misturar();
	}
	
	abstract void ferverAgua();
	
	abstract void escolherBebida();
	
	abstract void misturar();


	


}
