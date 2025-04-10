import java.util.ArrayList;

public class Provincia {
	private String nombre;
	private ArrayList<Ciudad> ciudades;

	public Provincia(String nombre, ArrayList<Ciudad> ciudades) {
		this.nombre = nombre;
		this.ciudades = ciudades;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Ciudad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(ArrayList<Ciudad> ciudads) {
		this.ciudades = ciudads;
	}

	public ArrayList<Ciudad> getCiudadesEnDeficit() {
		ArrayList<Ciudad> ciudadConDeficit = new ArrayList<>();
		for (Ciudad ciudad : ciudades) {
			if (ciudad.getEnDeficit() && ciudad.getCiudadGrande()) {
				ciudadConDeficit.add(ciudad);
			}
		}
		return ciudadConDeficit;
	}

	public boolean getProvinciaSeveramenteEnDeficit() {
		return ((getCiudadesEnDeficit().size() / ciudades.size()) >= 0.5);
	}
}
