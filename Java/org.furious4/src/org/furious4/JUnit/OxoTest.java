package org.furious4.JUnit;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.furious4.logica.Ficha;
import org.furious4.logica.Oxo;
import org.junit.Before;
import org.junit.Test;

public class OxoTest {
	Ficha[][] tablero = new Ficha[3][3];

	@Test
	public void cuandoUnaFichaFueraDeFilaEntoncesFalse() {
		assertFalse(Oxo.ponerFicha(4, 1));
	}

	@Test
	public void cuandoUnaFichaFueraDeColumnaEntoncesFalse() {
		assertFalse(Oxo.ponerFicha(1, 4));
	}

	@Test
	public void dadoUnTableroCuandoInicializamosPosicionEntoncesTodosNull() {
		assertEquals(tablero.length, 3);
		Oxo.inicializarTablero(tablero);

		for (int fila = 0; fila < tablero.length; fila++) {
			for (int columna = 0; columna < tablero[fila].length; columna++) {
				assertNull(tablero[fila][columna]);
			}
		}
	}

	@Test
	public void dadoUnTableroCuandoDamosValorDeJugadorEntoncesAnadeValorAFichaYDevuelveTrue() {
		Ficha jugador = Ficha.O;
		assertTrue(Oxo.ponerFicha(tablero, 0, 0, jugador));
	}

	@Test
	public void dadaUnaPosicionDevuelveFilaYColumna() {
		Integer posicion = 5;
		int[] respuestaEsperada = { 1, 1 };
		assertArrayEquals(respuestaEsperada, Oxo.devolverFilaColumna(posicion));
	}

	@Test
	public void cuandoPonemosUnaFichaPorPosicionYJugadorDevuelveTrue() {
		Ficha jugador = Ficha.X;
		assertTrue(Oxo.ponerFicha(tablero, 9, jugador));
	}

	@Test
	public void dadoUnTableroConGanadorPorFilasDevuelveJugador() {
		Ficha jugador = Ficha.O;
		Oxo.ponerFicha(tablero, 9, jugador);
		Oxo.ponerFicha(tablero, 8, jugador);
		Oxo.ponerFicha(tablero, 7, jugador);
		assertEquals(jugador, Oxo.checkFilas(tablero));
	}

	@Test
	public void dadoUnTableroConGanadorPorColumnaDevuelveJugador() {
		Ficha jugador = Ficha.O;
		Oxo.ponerFicha(tablero, 9, jugador);
		Oxo.ponerFicha(tablero, 6, jugador);
		Oxo.ponerFicha(tablero, 3, jugador);
		assertEquals(jugador, Oxo.checkColumnas(tablero));
		
	}
	@Test
	public void dadoUnTableroConGanadorPorDiagonalDevuelveJugador() {
		Ficha jugador = Ficha.O;
		Oxo.ponerFicha(tablero, 9, jugador);
		Oxo.ponerFicha(tablero, 5, jugador);
		Oxo.ponerFicha(tablero, 1, jugador);
		assertEquals(jugador, Oxo.checkDiagonales(tablero));
	}
	@Test
	public void dadoUnTableroCuandoReseteamosPosicionEntoncesTodosNull() {
		assertEquals(tablero.length, 3);
		Oxo.resetearTablero(tablero);

		for (int fila = 0; fila < tablero.length; fila++) {
			for (int columna = 0; columna < tablero[fila].length; columna++) {
				assertNull(tablero[fila][columna]);
			}
		}
	}
	
	@Before 
	public void resetearTablero(){
		Oxo.resetearTablero(tablero);
	}
	@Test
	public void dadaUnaPartidaConGanadorDevuelveJugadorGanador() {
		Ficha jugadorO = Ficha.O;
		Ficha jugadorX = Ficha.X;
		Oxo.ponerFicha(tablero, 7, jugadorX);
		assertNull(Oxo.checkGanador(tablero));
		Oxo.ponerFicha(tablero, 9, jugadorO);
		assertNull(Oxo.checkGanador(tablero));
		Oxo.ponerFicha(tablero, 3, jugadorX);
		assertNull(Oxo.checkGanador(tablero));
		Oxo.ponerFicha(tablero, 5, jugadorO);
		assertNull(Oxo.checkGanador(tablero));
		Oxo.ponerFicha(tablero, 1, jugadorX);
		assertNull(Oxo.checkGanador(tablero));
		Oxo.ponerFicha(tablero, 4, jugadorO);
		assertNull(Oxo.checkGanador(tablero));
		Oxo.ponerFicha(tablero, 2, jugadorX);
		assertEquals(jugadorX, Oxo.checkGanador(tablero));
	}
	

}
