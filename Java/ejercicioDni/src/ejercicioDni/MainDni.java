package ejercicioDni;

public class MainDni {

	public static void main(String[] args) {
		Dni dniBueno = new Dni("43154813M");
		if (dniBueno.checkNumeroDni()){
			System.out.println("CheckParteNumero Ok");
		}else{
			System.out.println("CheckParteNumero Fail");
		};
		String dni = "43154813M";
		dni.matches("[0-9]{8}");

	}

}
