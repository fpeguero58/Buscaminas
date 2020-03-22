package modelo;

public class Tablero {

	private Dificultad dificultad;
	private Densidad densidad;
	private int bombas;
	private Casilla[][] casillero;

	public Tablero(Dificultad dificultad, Densidad densidad) {
		super();
		this.dificultad = dificultad;
		this.densidad = densidad;
		this.casillero = new Casilla[this.getSize()][this.getSize()];
		this.bombas = calcularBombas();
	}

	public int getBombas() {
		return bombas;
	}

	public Casilla[][] getCasillero() {
		return casillero;
	}

	public int getSize() {
		return dificultad.getSize();
	}

	public float getCantidad() {
		return densidad.getCantidad();
	}

	public boolean marcarCasilla(Casilla casilla) {
		if (casilla.isVelada() && !casilla.isMarcada()) {
			casillero[casilla.getX()][casilla.getY()].setMarcada(true);
			return true;
		}
		return false;
	}

	public boolean desmarcarCasilla(Casilla casilla) {
		if (casilla.isVelada() && casilla.isMarcada()) {
			casillero[casilla.getX()][casilla.getY()].setMarcada(true);
			return true;
		}
		return false;
	}

	private int calcularBombas() {
		int totalCasillas = this.getSize() * this.getSize();
		return (int) (totalCasillas / this.getCantidad());
	}

}
