package nullObject;

public class NullMesa implements Mesa{

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0.0d;
	}

	@Override
	public void exibi() {
		System.out.println("Null Object não pode ser imprimido");
		
	}

	@Override
	public boolean isNull() {
		return true;
	}

	
	
}
