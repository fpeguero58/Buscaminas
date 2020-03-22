package modelo;

public class Casilla {

	private Coordenada coordenada;
	private boolean velada, mina, marcada;
	private int minasAlrededor;

	public int getX() {
		return coordenada.getX();
	}

	public int getY() {
		return coordenada.getY();
	}

	public boolean isVelada() {
		return velada;
	}

	public void setVelada(boolean velada) {
		this.velada = velada;
	}

	public boolean isMina() {
		return mina;
	}

	public void setMina(boolean mina) {
		this.mina = mina;
	}

	public boolean isMarcada() {
		return marcada;
	}

	public void setMarcada(boolean marcada) {
		this.marcada = marcada;
	}

	public int getMinasAlrededor() {
		return minasAlrededor;
	}

	public void setMinasAlrededor(int minasAlrededor) {
		this.minasAlrededor = minasAlrededor;
	}

}
