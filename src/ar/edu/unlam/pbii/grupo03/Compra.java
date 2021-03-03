package ar.edu.unlam.pbii.grupo03;

public class Compra implements Comparable<Compra>{
	private Producto producto;
	private Persona persona;
	
	public Compra(Producto producto, Persona persona) {
		this.producto=producto;
		this.persona=persona;
	}

	public Producto getProducto() {
		return producto;
	}

	public Persona getPersona() {
		return persona;
	}

	@Override
	public int compareTo(Compra o) {
		return 0;
	}
}
