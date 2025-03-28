import java.util.ArrayList;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		String paisNombre = JOptionPane.showInputDialog("Pais: ");
		Pais pais = new Pais(paisNombre);
		ArrayList<Provincia> provincias = new ArrayList<>();
		int cuantosProv = Integer.valueOf(JOptionPane.showInputDialog("Cuantas provincias hay?"));
		for (int i = 0; i < cuantosProv; i++) {
			String provNombre = JOptionPane.showInputDialog("Nombre de la provincia " + i + ":");
			ArrayList<Ciudad> ciudades = new ArrayList<>();
			int cuantosCiudad = Integer
					.valueOf(JOptionPane.showInputDialog("Cuantas ciudades hay en " + provNombre + "?"));
			for (int j = 0; j < cuantosCiudad; j++) {
				String ciudadNombre = JOptionPane.showInputDialog("Nombre de ciudad " + j + ":");
				int poblacion = Integer.valueOf(JOptionPane.showInputDialog("Poblacion en " + ciudadNombre + "?"));

				// Gastos
				int cuantosGastos = Integer.valueOf(JOptionPane.showInputDialog("Cantidad de gastos: "));
				ArrayList<Gasto> gastos = new ArrayList<>();
				for (int k = 0; k < cuantosGastos; k++) {
					int monto = Integer.valueOf(JOptionPane.showInputDialog("Monto"));
					gastos.add(new Gasto(monto));
				}
				// Impuestos
				int cuantosImpuestos = Integer.valueOf(JOptionPane.showInputDialog("Cantidad de impuestos: "));
				ArrayList<Impuesto> impuestos = new ArrayList<>();
				for (int k = 0; k < cuantosImpuestos; k++) {
					int monto = Integer.valueOf(JOptionPane.showInputDialog("Monto"));
					impuestos.add(new Impuesto(monto));
				}

				// initalize city
				// add to list
				ciudades.add(new Ciudad(ciudadNombre, poblacion, impuestos, gastos));
			}
			// initalize province
			// add to list
			provincias.add(new Provincia(provNombre, ciudades));
		}
		pais.setProvincias(provincias);
		// fin de initialization de todo

		// compilar listado con mas de 100k hab
		// compilar listado con deuda
		// hecho en Provincia

		// imprimir provincia, ciudad en deuda
		// imprimir provincias con >50% ciudades endudados
		for (Provincia prov : provincias) {
			System.out.println("Ciudades en deuda para provincia " + prov.getNombre());
			for (Ciudad ciudad : prov.getCiudadesEnDeficit()) {
				System.out.println(ciudad.getNombre());
			}
		}
		System.out.println("Provincias con >50% ciudades grandes en dueda");
		for (Provincia prov : pais.provinciasEnDeficitGrande()) {
			System.out.println(prov);
		}
	}
}
