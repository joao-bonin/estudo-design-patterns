package factory.simple;

public class Concreto extends Tijolo{
	
	private String material = "Concreto";
	
	private boolean temFuro = true;
	
	public Concreto() {
		this.setAltura(10.0);
		this.setLargura(25.0);
		this.setProfundidade(20.0);
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
