package bridge;

public class Receiver implements Dispositivo{

	private boolean ligada = false;
	private int volume = 30;
	private int canal = 1;

	@Override
	public boolean isLigada() {
		return ligada;
		
	}

	@Override
	public void ligar() {
		ligada = true;
		
	}

	@Override
	public void desligar() {
		ligada  = false;
		
	}

	@Override
	public void setVolume(int porcentagem) {
		if(volume > 100) {
			this.volume = 100;
		}else if (volume < 0) {
			this.volume = 0;
		}else{
			this.volume = porcentagem;
		}
		
	}

	@Override
	public int getVolume() {
		return volume;
	}

	@Override
	public void setCanal(int canal) {
		this.canal = canal;
		
	}

	@Override
	public int getCanal() {
		return canal;
	}

	@Override
	public void imprimeStatus() {
        System.out.println("------------------------------------");
        System.out.println("| Eu sou um Receiver.");
        System.out.println("| Estou no momento " + (ligada ? "ligada" : "desligada"));
        System.out.println("| O meu volume atual é " + volume + "%");
        System.out.println("| A minha estação atual é " + canal);
        System.out.println("------------------------------------\n");
		
	}

}
