package figuras;

import java.util.ArrayList;

public abstract class Elipse {
	private String nombre;

	public Elipse(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String name) {
		this.nombre = name;
	}
}
