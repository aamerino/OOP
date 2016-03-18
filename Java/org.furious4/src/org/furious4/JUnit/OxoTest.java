package org.furious4.JUnit;

import static org.junit.Assert.*;

import org.furious4.logica.Oxo;
import org.junit.Test;

public class OxoTest {
	Oxo.Ficha[][] tablero = new Oxo.Ficha[3][3];
	
	@Test
	public void cuandoUnaFichaFueraDeFilaEntoncesFalse() {
		assertFalse(Oxo.ponerFicha(4,1));
	}
	
	@Test
	public void cuandoUnaFichaFueraDeColumnaEntoncesFalse() {
		assertFalse(Oxo.ponerFicha(1,4));
	}
	
	@Test
	public void dadoUnTableroCuandoInicializamosPosicionEntoncesTodosNull(){
		assertEquals(tablero.length, 3);
		Oxo.inicializarTablero(tablero);
			
		for (int fila = 0; fila < tablero.length; fila++){
			for (int columna = 0; columna < tablero[fila].length; columna++){
				assertNull(tablero[fila][columna]);
			}
		} 
	}
	
	@Test
	public void dadoUnTableroCuandoDamosValorDeJugadorEntoncesDevuelveTrue(){
		Oxo.Ficha jugador = Oxo.Ficha.O;
		assertTrue(Oxo.ponerFicha(0, 0, jugador));
	}
}
