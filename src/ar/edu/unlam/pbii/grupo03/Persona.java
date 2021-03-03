package ar.edu.unlam.pbii.grupo03;

import java.util.Set;
import java.util.TreeSet;

public abstract class Persona {
	private Integer dni;
	private String nombre;
	private Set<Producto> compras;
	public Persona(Integer dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		compras = new TreeSet<Producto>();
	}
	public Integer getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void registrarCompra(Producto comprado) {
		compras.add(comprado);
	}
	public Double getPrecioDelProducto(Producto productoComprado) {
		if (compras.contains(productoComprado)) {
			return productoComprado.getPrecio();
		}
		return null;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Persona))
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	
}
