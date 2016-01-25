package forma;

public class MainRectangulo {

	public static void main(String[] args) {
		Rectangulo primerRectangulo = new Rectangulo(10, 20);
		if (primerRectangulo.calcularArea() == 200){
			System.out.println("OK");
		}
		else{
			System.out.println("FAIL");
		}
	}

}
