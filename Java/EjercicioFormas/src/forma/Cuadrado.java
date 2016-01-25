package forma;

public class Cuadrado extends Forma{
	private double lado;
	
	public Cuadrado(){
		this.setLado(0);
	}
	
	public Cuadrado(double lado){
		this.setLado(lado);
	}
	
	public double getLado() {
		return this.lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
	return this.getLado() * this.getLado();
	}
	
}
