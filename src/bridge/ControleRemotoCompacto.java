package bridge;

public class ControleRemotoCompacto extends ControleRemoto{
	
	public ControleRemotoCompacto(Dispositivo dispositivo) {
		super(dispositivo);
	}

	public void mute() {
		System.out.println("Controle remoto compacto: mutado");
		dispositivo.setVolume(0);
	}

}
