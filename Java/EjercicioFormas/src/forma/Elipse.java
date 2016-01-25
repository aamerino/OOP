package forma;

public class Elipse extends Forma{
	private double radius1;
	private double radius2;
	private final double PI = Math.PI;
	
	public Elipse(){
		this.setRadius1(1);
		this.setRadius2(1);
		
	}
	
	public Elipse(double radius1, double radius2){
		this.setRadius1(radius1);
		this.setRadius2(radius2);
	}

	public double getRadius1() {
		return radius1;
	}

	public void setRadius1(double radius1) {
		this.radius1 = radius1;
	}

	public double getRadius2() {
		return radius2;
	}

	public void setRadius2(double radius2) {
		this.radius2 = radius2;
	}
	
	@Override
	public double calcularArea() {
		return PI * this.getRadius1() * this.getRadius2();
		}
	

}
