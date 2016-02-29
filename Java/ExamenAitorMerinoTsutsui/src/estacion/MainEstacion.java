package estacion;

import bicicleta.Bicicleta;

public class MainEstacion {

	public static void main(String[] args) {
		Estacion estacion = new Estacion(3, "Montuiri", 10);
		estacion.consultarEstacion();
		System.out.println(estacion.anclajesLibres());

	}

}
