package es.sorayavay.listado;

import java.io.Serializable;

public class DatoCategoria implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombre;
	private String descripcion;

	public DatoCategoria(final String nombre, final String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}

}
