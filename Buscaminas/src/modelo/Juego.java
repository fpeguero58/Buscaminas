package modelo;

public class Juego {

	private Dificultad dificultad;
	private Densidad densidad;
	private int bombas;
	private Casilla[][] tablero;

	public Juego(Dificultad dificultad, Densidad densidad) {
		super();
		this.dificultad = dificultad;
		this.densidad = densidad;
		this.tablero = new Casilla[this.getSize()][this.getSize()];
		this.bombas = calcularBombas();
	}

	public int getBombas() {
		return bombas;
	}

	public Casilla[][] getTablero() {
		return tablero;
	}

	public int getSize() {
		return dificultad.getSize();
	}

	public float getCantidad() {
		return densidad.getCantidad();
	}

	private int calcularBombas() {
		int totalCasillas = this.getSize() * this.getSize();
		return (int) (totalCasillas / this.getCantidad());
	}

}
