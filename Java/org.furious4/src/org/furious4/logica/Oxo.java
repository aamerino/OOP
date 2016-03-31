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
		assertTrue(Oxo.tableroInvariantes(matriz));
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
		assertTrue(Oxo.tableroInvariantes(matriz));
		for (int columna = 0; columna < matriz[0].length; columna++) {
			if(Oxo.checkColumna(matriz, columna) != null){
				assertTrue(Oxo.tableroInvariantes(matriz));
				return Oxo.checkColumna(matriz, columna);
			};
		}
		//Ayy lmao
		assertTrue(Oxo.tableroInvariantes(matriz));
		return null;
		}
	private static Ficha checkColumna(Ficha[][] matriz, int columna) {
		for (int i = 0; i < matriz.length; i++){
			if (matriz[0][columna] != matriz[i][columna] || matriz[0][columna] == null){
				assertTrue(Oxo.tableroInvariantes(matriz));
				return null;
			}
		}
		assertTrue(Oxo.tableroInvariantes(matriz));
		return matriz[0][columna];
	}
	
	public static Object checkDiagonales(Ficha[][] matriz) {
		assertTrue(Oxo.tableroInvariantes(matriz));
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
			assertTrue(Oxo.tableroInvariantes(matriz));
			return matriz[0][0];
		}
		if (contadorDiagonalB == filasArray){
			assertTrue(Oxo.tableroInvariantes(matriz));
			return matriz[0][lmao];
		}
		return null;
	}

	public static Object checkGanador(Ficha[][] matriz) {
		assertTrue(matriz.length == matriz[0].length);
		if(Oxo.checkFilas(matriz) != null){
			assertTrue(Oxo.tableroInvariantes(matriz));
			return Oxo.checkFilas(matriz);
		}else if(Oxo.checkColumnas(matriz) != null){
			assertTrue(Oxo.tableroInvariantes(matriz));
			return Oxo.checkColumnas(matriz);
		}else if(Oxo.checkDiagonales(matriz) != null){
			assertTrue(Oxo.tableroInvariantes(matriz));
			return Oxo.checkDiagonales(matriz);
		}
		assertTrue(Oxo.tableroInvariantes(matriz));
		return null;
	}

		
	
	private static Boolean tableroInvariantes(Ficha[][] matriz){
		if(matriz.length != matriz[0].length){
			return false;
		}
		Ficha jugadorO = Ficha.O;
		Ficha jugadorX = Ficha.X;
		for (Ficha[] fila:tablero) {
			for(Ficha ficha:fila){ 
				if(ficha != jugadorO && ficha != jugadorX && ficha != null ){
					assertTrue(Oxo.tableroInvariantes(matriz));
					return false;
				};
			}
		}
		return true;
	}
}
