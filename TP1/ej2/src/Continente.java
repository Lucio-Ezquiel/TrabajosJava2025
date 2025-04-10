import java.util.ArrayList;

public class Continente {
	private String nombre;
	private ArrayList<Pais> paises;

	public Continente(String nombre, ArrayList<Pais> paises) {
		this.nombre = nombre;
		this.paises = paises;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Pais> getPaises() {
		return paises;
	}

	public void setPaises(ArrayList<Pais> paises) {
		this.paises = paises;
	}

}
