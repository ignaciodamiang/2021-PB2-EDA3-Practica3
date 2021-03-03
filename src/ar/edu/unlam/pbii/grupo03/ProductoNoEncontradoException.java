package ar.edu.unlam.pbii.grupo03;

@SuppressWarnings("serial")
public class ProductoNoEncontradoException extends Exception {
	public ProductoNoEncontradoException(String mensaje) {
		super(mensaje);
	}
}
