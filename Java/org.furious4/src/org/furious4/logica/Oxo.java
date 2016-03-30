package org.furious4.logica;

import static org.junit.Assert.*;


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
	
	public static void resetearTablero(Ficha[][] matriz){
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				matriz[fila][columna] = null;
			}
		}
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

	public static Object checkFilas(Ficha[][] matriz){
		for(Ficha[] fila:matriz){
			if(Oxo.checkFila(fila) != null){
				return Oxo.checkFila(fila);
			}
		}
		return null;
	}

	private static Object checkFila(Ficha[]fila){
		for (Ficha valor : fila) {
			for (int i = 0; i < fila.length; i++) {
				if (valor != fila[i] || valor == null) {
					return null;
				}
			}
		}
		return fila[0];
	}
	public static Ficha checkColumnas(Ficha[][] matriz) {
		assertTrue(matriz.length == matriz[0].length);

		for (int columna = 0; columna < matriz[0].length; columna++) {
			if(Oxo.checkColumna(matriz, columna) != null){
				return Oxo.checkColumna(matriz, columna);
			};
		}
		//Ayy lmao
		return null;
		}
	private static Ficha checkColumna(Ficha[][] matriz, int columna) {
		for (int i = 0; i < matriz.length; i++){
			if (matriz[0][columna] != matriz[i][columna] || matriz[0][columna] == null){
				return null;
			}
		}
		return matriz[0][columna];
	}
	
	public static Object checkDiagonales(Ficha[][] matriz) {
		assertTrue(matriz.length == matriz[0].length);
		int contadorDiagonalA = 0;
		int contadorDiagonalB = 0;
		int filasArray = matriz.length;
		int lmao = filasArray-1;
		for (int i = 0, j = lmao; i < filasArray; i++ , j--){
			if (matriz[0][0] == matriz[i][i] && matriz[i][i] != null){
				contadorDiagonalA++;
			}else{
				;
			}
			if (matriz[0][lmao] == matriz[i][j] && matriz[i][j] != null){
				contadorDiagonalB++;
			}else{
				;
			}
		}
		if (contadorDiagonalA == filasArray){
			return matriz[0][0];
		}
		if (contadorDiagonalB == filasArray){
			return matriz[0][lmao];
		}
		return null;
	}

	public static Object checkGanador(Ficha[][] matriz) {
		assertTrue(matriz.length == matriz[0].length);
		if(Oxo.checkFilas(matriz) != null){
			return Oxo.checkFilas(matriz);
		}else if(Oxo.checkColumnas(matriz) != null){
			return Oxo.checkColumnas(matriz);
		}else if(Oxo.checkDiagonales(matriz) != null){
			return Oxo.checkDiagonales(matriz);
		}
		return null;
	}

		
	
	
}
