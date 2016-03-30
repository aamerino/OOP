package org.furious4.logica;

import java.util.HashMap;
import static org.junit.Assert.*;


public class PosicionTablero {

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
	public static int[] filaColumna(Integer posicion) {
		assertFalse((posicion >= 10) && (posicion <= 0));
		return (posicionTablero.get(posicion));
	}

}
