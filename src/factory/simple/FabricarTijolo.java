package factory.simple;

/**
 * Colocamos a classe e o mtodo como final e static
 * Com a vantagem de não precisarmos instanciar a fabrica e
 * impossibilitarmos a extensão da classe no programa, assim
 * como impedir a instanciação de objetos utilizando p construtor
 * private
 * 
 * @author manolo
 *
 */
public final class FabricarTijolo {
	
	private FabricarTijolo() {}

	
	/**
	 * Está é o padrão Simple Factory
	 * 
	 * @param string
	 * @return 
	 */
	public static Tijolo criarTijolo(String tipo) {
		
		Tijolo tijolo = null;
		
		if("Macico".equalsIgnoreCase(tipo)) {
			tijolo = new Macico();
		}else if("Ceramica".equalsIgnoreCase(tipo)) {
			tijolo = new Ceramica();
		}else {
			tijolo = new Concreto();
		}
		return tijolo;
		
	}

}
