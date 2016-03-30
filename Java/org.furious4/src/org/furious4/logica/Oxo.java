package org.furious4.logica;

import static org.junit.Assert.assertFalse;

public class Oxo {

	public static final int FILAS = 3;
	public static final int COLUMNAS = 3;
	public static Ficha[][] tablero = new Ficha[FILAS][COLUMNAS];

	public static boolean ponerFicha(int fila, int columna) {
		return (checkLimites(fila) && checkLimites(columna));
	};

	public static boolean ponerFicha(Ficha[][] matriz, int fila, int columna, Ficha fichaJugador) {
		if (checkLimites(fila) && checkLimites(columna)) {
			matriz[fila][columna] = fichaJugador;
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkLimites(int posicion) {
		return (posicion >= 0 && posicion < 3);
	}

	public static void inicializarTablero(Ficha[][] matriz) {
	}

	public static int[] devolverFilaColumna(Integer asds) {
		return PosicionTablero.filaColumna(asds);
	}

	public static boolean ponerFicha(Ficha[][] matriz, int posicion, Ficha jugador) {
		assertFalse((posicion >= 10) && (posicion <= 0));
		int[] arrayPosicion = PosicionTablero.filaColumna(posicion);
		int fila = arrayPosicion[0];
		int columna = arrayPosicion[1];
		return ponerFicha(matriz, fila, columna, jugador);
	}

	public static Object checkFilas(Ficha[] fila) {
		for (Ficha valor : fila) {
			for (int i = 0; i < fila.length; i++) {
				if (valor != fila[i]) {
					return null;
				}
			}
		}
		return fila[0];
	}

	public static Ficha checkColumnas(Ficha[][] matriz) {
		assertFalse(matriz.length == matriz[0].length);

		for (int columna = 0; columna < matriz[0].length; columna++) {
			int filasArray = matriz.length;
			for (int i = 0; i < filasArray; i++) {
				if (matriz[0][columna] != matriz[0][i]) {
					return null;
				}else{
					;
				}
				return matriz[columna][0];
			}
		}
		//Ayy lmao
		return null;
		}
	public static Ficha checkColumna(Ficha[][] matriz, int columna) {
		for (int i = 0; i < matriz.length; i++){
			
		}
	}
	
	public static Object checkDiagonales(Ficha[][] matriz) {
		assert(matriz.length == matriz[0].length);
		int contadorDiagonalA = 0;
		int contadorDiagonalB = 0;
		int filasArray = matriz.length;
		for (int i = 0, j = filasArray; i < filasArray; i++ , j--){
			if (matriz[0][0] == matriz[i][i]){
				contadorDiagonalA++;
			}else{
				;
			}
			if (matriz[0][filasArray] != matriz[i][j]){
				contadorDiagonalB++;
			}else{
				;
			}
		}
		if (contadorDiagonalA == filasArray){
			return matriz[0][0];
		}
		if (contadorDiagonalB == filasArray){
			return matriz[0][filasArray];
		}
		return null;
	}

		
	
	
}
