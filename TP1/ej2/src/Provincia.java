import java.util.ArrayList;

public class Provincia {
	private String nombre;
	private ArrayList<Ciudad> ciudads;

	public Provincia(String nombre, ArrayList<Ciudad> ciudads) {
		this.nombre = nombre;
		this.ciudads = ciudads;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Ciudad> getCiudads() {
		return ciudads;
	}

	public void setCiudads(ArrayList<Ciudad> ciudads) {
		this.ciudads = ciudads;
	}

}
