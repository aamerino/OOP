package ejercicioEstructurasDatos4;

public class Main {

	public static void main(String[] args) {
		int[][] matriz = new int[10][10];
		 for (int fila = 0; fila < matriz.length; fila++) {
			 for (int columna = 0; columna < matriz[fila].length; columna++) {
	                if (fila == columna) {
	                    matriz[fila][columna] = 1;
	                }
	                else{
	                    matriz[fila][columna] = 0;
	                } 
	                System.out.println(matriz[fila][columna] + " ");
	}

		 }
	}
}
