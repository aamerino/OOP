package forma;

public class Circulo extends Forma{
	private double radius;
	private final double PI = Math.PI;
	
	public Circulo (){
		this.setRadius(1);
	}
	public Circulo (double radius){
		this.setRadius(radius);
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getPI() {
		return PI;
	}
	
	@Override
	public double calcularArea() {
	return PI * this.getRadius() * this.getRadius();
	}
	
}
