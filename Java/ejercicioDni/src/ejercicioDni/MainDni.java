package ejercicioDni;

public class MainDni {

	public static void main(String[] args) {
		Dni dniBueno = new Dni("43154813M");
		if (dniBueno.checkNumeroDni()){
			System.out.println("CheckParteNumero Ok");
		}else{
			System.out.println("CheckParteNumero Fail");
		};
		
		Dni dniMalo = new Dni("43154813N");
		if (dniMalo.checkNumeroDni()){
			System.out.println("CheckParteNumero Ok");
		}else{
			System.out.println("CheckParteNumero Fail");
		};
		
	}

}
