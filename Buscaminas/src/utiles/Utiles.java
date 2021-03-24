package utiles;

public class Utiles {

	public static int dameNumero(int limite) {
		assert limite > 1;
		return (int) (Math.random() * (limite));
	}
}
