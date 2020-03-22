package modelo;

public enum Densidad {

	normal(0.1f), alta(0.2f);

	private float cantidad;

	private Densidad(float cantidad) {
		this.cantidad = cantidad;
	}

	public float getCantidad() {
		return cantidad;
	}

}
