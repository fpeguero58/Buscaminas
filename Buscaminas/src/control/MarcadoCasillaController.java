package control;

import modelo.Coordenada;
import modelo.Tablero;

public class MarcadoCasillaController {

	Tablero tablero;

	public MarcadoCasillaController(Tablero tablero) {
		super();
		this.tablero = tablero;
	}

	public boolean marcarCasillaController(Coordenada coordenada) {
		return tablero.marcarCasilla(coordenada);
	}

	public boolean desmarcarCasillaController(Coordenada coordenada) {
		return tablero.desmarcarCasilla(coordenada);
	}
}
