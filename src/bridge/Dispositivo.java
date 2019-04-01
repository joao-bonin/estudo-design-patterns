package bridge;

/**
 * Essa é a implementação dos dispositivos.
 * 
 * @author manolo
 *
 */
public interface Dispositivo {
	
	boolean isLigada();
	
	void ligar();
	
	void desligar();
	
	void setVolume(int porcentagem);
	
	int getVolume();
	
	void setCanal(int canal);
	
	int getCanal();
	
	void imprimeStatus();
	
	
	
	

}
