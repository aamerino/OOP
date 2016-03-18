package org.furious4.logica;


public class Oxo {
	
	public enum Ficha{X , O};

	public static final int FILAS = 3;
	public static final int COLUMNAS = 3;
	public static Ficha[][] tablero = new Ficha[FILAS][COLUMNAS];
	
	public static boolean ponerFicha(int fila, int columna){
		return (checkLimites(fila) && checkLimites(columna));
	};
	
	public static boolean ponerFicha(int fila, int columna, Ficha fichaJugador){
		if(checkLimites(fila) && checkLimites(columna)){
			tablero[fila][columna] = fichaJugador;
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean checkLimites(int posicion){
		return(posicion < 1 || posicion > 3);
	}
	
	public static void inicializarTablero(Ficha[][] matriz){
	
	}


	
	
}
