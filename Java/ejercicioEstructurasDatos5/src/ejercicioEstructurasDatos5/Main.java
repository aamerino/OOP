package ejercicioEstructurasDatos5;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
        Random aleatorio = new Random();
        int[][] matriz = new int[4][5];
        int[] sumaFilas = { 0, 0, 0, 0 };
        int[] sumaPares = { 0, 0, 0, 0, 0 };
        
        for (int fila = 0; fila < matriz.length; fila++) {
			 for (int columna = 0; columna < matriz[fila].length; columna++) {
	                matriz[fila][columna] = aleatorio.nextInt(10) + 1;
			 }
        }
        //Recorrer fila
        for (int fila = 0; fila < matriz.length; fila++) {
			 for (int columna = 0; columna < matriz[fila].length; columna++) {
				 sumaFilas[fila] += matriz[fila][columna];
			 }
        }
        for (int i = 0; i < sumaFilas.length; i++) {
            System.out.println("La Suma de los elementos de la fila  "
                    + (i + 1) + " : " + sumaFilas[i]);
        }
        //Recorrer columna
        for (int columna = 0; columna < 5; columna++) {
            for (int fila = 0; fila < 4; fila++) {
                if (matriz[fila][columna] % 2 == 0) {
                    sumaPares[columna] += matriz[fila][columna];
                }
            }
        }
        for (int i = 0; i < sumaPares.length; i++) {
            System.out.println("La Suma de los elementos pares de la columna  "
                    + (i + 1) + " : " + sumaPares[i]);
        }
}
}