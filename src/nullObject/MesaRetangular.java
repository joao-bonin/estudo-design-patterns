package nullObject;

public class MesaRetangular implements Mesa{
	
    private final double diametro; 
    private final double largura;
    
    public MesaRetangular() {
		this(1.0d, 1.0d);
	}
    
    public MesaRetangular(double diametro, double largura) {
    	this.diametro = diametro;
    	this.largura = largura;
    }
	

	@Override
	public double area() {
		return diametro * largura;
	}

	@Override
	public void exibi() {
		System.out.println("Desenhando a mesa de jantar retangular com area: " + area());
		
	}

	@Override
	public boolean isNull() {
		return false;
	}


}
