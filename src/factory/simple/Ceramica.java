package factory.simple;

public class Ceramica extends Tijolo{
	
	private String material = "Argila";
	
	private boolean temFuro = true;
	
	public Ceramica() {
		this.setAltura(8.0);
		this.setLargura(11.0);
		this.setProfundidade(12.0);
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
