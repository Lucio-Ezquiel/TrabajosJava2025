import java.util.ArrayList;

public class Pais {
	private String nombre;
	private ArrayList<Provincia> provincias;

	public Pais(String nombre, ArrayList<Provincia> provincias) {
		this.nombre = nombre;
		this.provincias = provincias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Provincia> getProvincias() {
		return provincias;
	}

	public void setProvincias(ArrayList<Provincia> provincias) {
		this.provincias = provincias;
	}

}
