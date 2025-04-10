package figuras;

import java.util.ArrayList;

public abstract class Poligono {
	private String nombre;
	private ArrayList<Lado> lados;

	public Poligono(String nombre, ArrayList<Lado> lados) {
		this.nombre = nombre;
		this.lados = lados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
