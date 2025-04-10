package figuras;

import java.util.ArrayList;

public class Figura {
	private ArrayList<Poligono> poligonos;
	private ArrayList<Elipse> elipses;

	public Figura() {
		this.poligonos = new ArrayList<>();
		this.elipses = new ArrayList<>();
	}

	public void agregarPoligono(Poligono poli) {
		poligonos.add(poli);
	}

	public void borrarPoligono(Poligono poli) {
		poligonos.remove(poli);
	}

	public void mostrarPoligonos() {
		for (Poligono p : poligonos) {
			System.out.println(p.getNombre());
		}
	}

	public void agregarElipse(Elipse elip) {
		elipses.add(elip);
	}

	public void borrarElipsei(Elipse elip) {
		poligonos.remove(elip);
	}

	public void mostrarElipses() {
		for (Elipse e : elipses) {
			System.out.println(e.getNombre());
		}
	}

}
