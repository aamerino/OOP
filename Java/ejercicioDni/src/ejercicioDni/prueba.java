package ejercicioDni;

public class prueba {

	public static void main(String[] args) {
		DniCif casoTest = new DniCif("X3154813M");
		System.out.println(casoTest.isDni());
		System.out.println(casoTest.convertirNif());

	}

}
