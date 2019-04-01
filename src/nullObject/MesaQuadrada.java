package nullObject;

public class MesaQuadrada implements Mesa {
	
	private double medida;
	
	
	public MesaQuadrada() {
		this(1.0);
	}
	
	public MesaQuadrada(double medida) {
		this.medida = medida *= medida;
	}
	

	@Override
	public double area() {
		return medida;
	}

	@Override
	public void exibi() {
		System.out.println("Desenhando a mesa de jantar quadrada com area: " + area());

	}

	@Override
	public boolean isNull() {
		return false;
	}

}
