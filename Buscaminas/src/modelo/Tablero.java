package modelo;

import utiles.Utiles;

public class Tablero {

	private int numeroMinas;
	private Casilla[][] casillero;

	public Tablero(int lado, int numeroMinas) {
		super();
		this.casillero = new Casilla[lado][lado];
		this.numeroMinas = numeroMinas;
		colocarMinas();
	}

	public int getNumeroMinas() {
		return numeroMinas;
	}

	public Casilla[][] getCasillero() {
		return casillero;
	}

	public Casilla getCasilla(Coordenada posicion) {
		return casillero[posicion.getX()][posicion.getY()];
	}

	public boolean marcarCasilla(Coordenada posicion) {
		if (casillero[posicion.getX()][posicion.getY()].isVelada()
				&& !casillero[posicion.getX()][posicion.getY()].isMarcada()) {
			casillero[posicion.getX()][posicion.getY()].setMarcada(true);
			return true;
		}
		return false;
	}

	public boolean desmarcarCasilla(Coordenada posicion) {
		if (casillero[posicion.getX()][posicion.getY()].isVelada()
				&& casillero[posicion.getX()][posicion.getY()].isMarcada()) {
			casillero[posicion.getX()][posicion.getY()].setMarcada(true);
			return true;
		}
		return false;
	}

	private void colocarMinas() {
		int x, y;
		for (int i = 0; i < this.numeroMinas; i++) {
			do {
				x = Utiles.dameNumero(this.casillero.length);
				y = Utiles.dameNumero(this.casillero.length);
			} while (this.casillero[x][y].isMina());
			casillero[x][y].setMina(true);
		}
	}
}
