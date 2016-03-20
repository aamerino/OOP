package org.furious4.logica;

import java.util.HashMap;
import static org.junit.Assert.*;


public class Tablero {

	public static final int FILAS = 3;
	public static final int COLUMNAS = 3;
	public static Ficha[][] tablero = new Ficha[FILAS][COLUMNAS];
	public static final HashMap<Integer,int[]> posicionTablero = new HashMap<Integer,int[]>();
	static{
		for (int posicion = 9, fila = 0, columna = 0; posicion >= 0; posicion--, columna++){
			posicionTablero.put(posicion,new int[]{fila,columna});
			if (columna == 3){
				columna = 0;
				fila++;
			}
		}
	};
	
	public Tablero(){
		
	}

	public static int[] filaColumna(Integer posicion) {
		assertFalse((posicion >= 10) && (posicion <= 0));
		return (posicionTablero.get(posicion));
	}

}
