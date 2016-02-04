package validadorFechas;

import java.util.Map;

public class MainFecha {
	public static void main(String[] args){
	Fecha fechaCorrecta = new Fecha(15,2,2016);
	
	if  (fechaCorrecta.checkFecha()){
		System.out.println("Fecha ok");
	}
		else{
		System.out.println("Fecha Fail");
		
	}
	Fecha fechaIncorrecta = new Fecha(29,2,1903);
	if  (fechaIncorrecta.checkFecha()){
		System.out.println("Fecha ok");
	}
		else{
		System.out.println("Fecha Fail");
		
	}
	
}
}