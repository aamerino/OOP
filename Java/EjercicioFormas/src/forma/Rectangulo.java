package forma;

public class Rectangulo extends Forma{
	private double altura;
	private double base;
	
	public Rectangulo(){
		this.setAltura(2);
		this.setBase(4);
		
	}
	public Rectangulo(double altura, double base){
		this.setAltura(altura);
		this.setBase(base);
	}
	public Rectangulo(double lado){
		this(lado ,lado);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	@Override
	public double calcularArea() {
	return this.getBase() * this.getAltura();
	}
	
}
