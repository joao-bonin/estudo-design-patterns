package factory.simple;

public class Macico extends Tijolo{
	
	private String material = "Barro";
	
	private boolean temFuro = false;
	
	public Macico() {
		this.setAltura(0.5);
		this.setLargura(5.0);
		this.setProfundidade(15.0);
	}

	public String getMaterial() {
		return material;
	}

	public boolean isTemFuro() {
		return temFuro;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Material: " + getMaterial() + "\n").
		append("Possui furo? " + isTemFuro() +  "\n").
		append(super.toString());
		
		return builder.toString();
		

	}

}
