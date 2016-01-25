package forma;

public class MainCirculo {

	public static void main(String[] args) {
		Circulo primerCirculo = new Circulo(10);
		if (primerCirculo.calcularArea() == 314.159){
			System.out.println("OK");
		}
		else{
			System.out.println("FAIL");
		}
	}

}
