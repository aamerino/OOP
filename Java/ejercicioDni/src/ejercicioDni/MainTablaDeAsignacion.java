package ejercicioDni;

public class MainTablaDeAsignacion {

	public static void main(String[] args) {
		TablaDeAsignacion tabla = new TablaDeAsignacion();
		if (tabla.getLetra(1) == 'R') {
			System.out.println("getLetra Ok");
		}else{
			System.out.println("getLetra Fail");
		}

	}

}
