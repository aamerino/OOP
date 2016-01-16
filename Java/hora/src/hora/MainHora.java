package hora;

public class MainHora {
	
	public static void main(String[] args) {
		Hora primeraHora = new Hora(10, 20, 30);
		if (primeraHora.getHoraCompleta().equals("[10, 20, 30]")){
			System.out.print("Ok");
		}
		else {
			System.out.print("Fail");
		}
		if (primeraHora.getHorasPersonalizado("%s:%s:%s").equals("10:20:30")){
			System.out.print("Ok");
			}
		else {
			System.out.print("Fail");
		}
	}
}

