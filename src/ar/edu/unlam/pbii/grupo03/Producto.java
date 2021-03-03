package ar.edu.unlam.pbii.grupo03;

public class Producto implements Comparable<Producto>{

	private Integer codigo;
	private String descripcion;
	private Double precio;
	public Producto(Integer codigo, String descripcion, Double precio) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	@Override
	public int compareTo(Producto o) {
		return 0;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
}
