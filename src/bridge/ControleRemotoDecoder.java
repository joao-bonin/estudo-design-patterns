package bridge;

public class ControleRemotoDecoder extends ControleRemoto{
	
	private boolean isDecoderLigado = false;
	
	public ControleRemotoDecoder(Dispositivo dispositivo) {
		super(dispositivo);
	}
	
	public void ligarDecoder() {
		if(isDecoderLigado) {
			isDecoderLigado = false;
		}else{
			isDecoderLigado = true;
		}
		System.out.println("Controle Remoto Decoder: O Decoder está " + isDecoderLigado);
	}

}
