package bridge;

/*
 * Neste caso a abstração poderia também ser uma
 * interface se caso fosse um comportamento especializado de cada implementação.
 * As implementações teriam que compor a interface Dispositivo
 * 
 */
public abstract class ControleRemoto {
	
	// Composição da implementação de dispositivo
	protected Dispositivo dispositivo;
	
	// Setamos na construção de um controle remoto qual o dispositivo que ele irá controlar.
	public ControleRemoto(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}
	
	public ControleRemoto() {}
	
	public void ligar() {
		System.out.println("Ligando o Dispositivo");
		if(dispositivo.isLigada()) {
			dispositivo.desligar();
		}else{
			dispositivo.ligar();
		}
	};
	
	public void aumentarVolume() {
		System.out.println("Aumentando o valume do dispositivo");
		dispositivo.setVolume(dispositivo.getVolume() + 10);
	};
	
	public void diminuirVolume() {
		System.out.println("Diminuindo o valume do dispositivo");
		dispositivo.setVolume(dispositivo.getVolume() - 10);
	};
	
	public void avancarCanal() {
		System.out.println("Avançando o canal do dispositivo");
		dispositivo.setCanal(dispositivo.getCanal() + 1);
	};
	
	public void voltarCanal() {
		System.out.println("Voltando o canal do dispositivo");
		dispositivo.setCanal(dispositivo.getCanal() - 1);
	};

}
