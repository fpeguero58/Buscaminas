package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import modelo.Coordenada;
import modelo.Tablero;

class marcadoControllerTest {

	@Test
	void marcarCasillaTest() {
		Tablero tablero = new Tablero(10, 0);
		tablero.getCasilla(new Coordenada(1, 1)).setMarcada(true);
		Coordenada posicion[] = { new Coordenada(2, 2), new Coordenada(1, 1) };
		boolean resultado[] = { true, false };
		for (int i = 0; i < resultado.length; i++) {
			assertEquals(resultado[i], tablero.marcarCasilla(posicion[i]));
		}
	}

	@Test
	void desmarcarCasillaTest() {
		Tablero tablero = new Tablero(10, 0);
		tablero.getCasilla(new Coordenada(1, 1)).setMarcada(true);
		Coordenada posicion[] = { new Coordenada(2, 2), new Coordenada(1, 1) };
		boolean resultado[] = { false, true };
		for (int i = 0; i < resultado.length; i++) {
			assertEquals(resultado[i], tablero.desmarcarCasilla(posicion[i]));
		}
	}
}
