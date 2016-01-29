package forma;

import java.util.ArrayList;

public class MainForma {

	public static void main(String[] args) {
		ArrayList<Forma> listaArray = new ArrayList<>();

		Rectangulo primerRectangulo = new Rectangulo(100, 200);
		listaArray.add(primerRectangulo);

		Circulo primerCirculo = new Circulo(50);
		listaArray.add(primerCirculo);

		Cuadrado primerCuadrado = new Cuadrado(400);
		listaArray.add(primerCuadrado);

		Elipse primerElipse = new Elipse(10, 20);
		listaArray.add(primerElipse);

		for (Forma i : listaArray) {
			System.out.print(i.getClass().getSimpleName() + ": ");
			System.out.println(i.calcularArea());
		}

	}

}
