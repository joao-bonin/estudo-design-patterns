package bridge;

import org.junit.jupiter.api.Test;

class BridgeTest {

	@Test
	void liga_a_tv_com_controle_remoto_simples() {
		Dispositivo tv = new Tv();		
		ControleRemotoCompacto controleRemotoCompacto = new ControleRemotoCompacto(tv);
		controleRemotoCompacto.ligar();
		controleRemotoCompacto.aumentarVolume();
		
		controleRemotoCompacto.avancarCanal();
		controleRemotoCompacto.avancarCanal();
		
		controleRemotoCompacto.mute();
		
		tv.imprimeStatus();
		
		
	}
	
	@Test
	public void liga_a_tv_controle_remoto_decoder_e_liga_o_decoder() {
		Dispositivo tv  = new Tv();
		ControleRemotoDecoder controleRemotoDecoder = new ControleRemotoDecoder(tv);
		
		controleRemotoDecoder.ligar();
		controleRemotoDecoder.ligarDecoder();
		
		tv.imprimeStatus();
	}
	
	@Test
	public void liga_o_receiver_com_controle_remoto_decoder_e_liga_o_decoder() {
		Dispositivo receiver  = new Receiver();
		ControleRemotoDecoder controleRemotoDecoder = new ControleRemotoDecoder(receiver);
		
		controleRemotoDecoder.ligar();
		controleRemotoDecoder.ligarDecoder();
		
		receiver.imprimeStatus();
	}

}
