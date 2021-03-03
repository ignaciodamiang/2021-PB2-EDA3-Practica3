package ar.edu.unlam.pbii.grupo03;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Empresa {

	private String nombre;
	private Set<Persona> personasVinculadas;
	private Set<Producto> productos;
	private Set<Compra> compras;

	public Empresa(String nombre) {
		this.nombre = nombre;
		personasVinculadas = new HashSet<Persona>();
		productos = new TreeSet<Producto>();
		compras = new TreeSet<Compra>();

	}

	public String getNombre() {
		return nombre;
	}

	public void vincularPersona(Persona vinculada) {
		personasVinculadas.add(vinculada);
	}

	public Integer getCantidadDePersonasVinculadas() {
		return personasVinculadas.size();
	}

	public void agregarProducto(Producto aVender) {
		productos.add(aVender);
	}

	public void registrarCompra(Persona comprador, Producto vendido) throws ConflictoDeInteresesException, ProductoNoEncontradoException {
		if (comprador instanceof Director) {
			throw new ConflictoDeInteresesException("Un directivo no puede comprar en la empresa.");
		}
		if (!(productos.contains(vendido))) {
			throw new ProductoNoEncontradoException("El producto no se encuentra en stock.");
		}
		if (personasVinculadas.contains(comprador) && productos.contains(vendido)) {
			if (comprador instanceof Empleado) {
				vendido.setPrecio(vendido.getPrecio() * 0.80);
			}
			Compra nuevaCompra = new Compra(vendido, comprador);
			compras.add(nuevaCompra);
			comprador.registrarCompra(vendido);
		}
	}
}
