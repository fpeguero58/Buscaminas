package modelo;

public enum Dificultad {

	facil(5), medio(8), dificl(12);

	private int size;

	private Dificultad(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

}
