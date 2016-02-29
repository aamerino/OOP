package ejercicioEstructurasDatos1;

public class Main {

	public static void main(String[] args) {
		double[] ventasTienda = {1000, 32.40, 50.50};
		double mayor = ventasTienda[0];
		double menor = ventasTienda[0];
		double total = 0;
		
		for (double ventas : ventasTienda){
			if (ventas > mayor){
				mayor = ventas;
			}else{
			}
			if (ventas < menor){
				menor = ventas;
			}else{
			}
			total += ventas;
			
		}
		System.out.println("Tienda que menos vendio: " + menor);
		System.out.println("Tienda que mas vendio: " + mayor);
		System.out.println("Total: " + total);


	}

}
