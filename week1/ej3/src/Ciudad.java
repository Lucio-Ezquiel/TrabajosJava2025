import java.util.ArrayList;

public class Ciudad {
	private String nombre;
	private int poblacion;
	private ArrayList<Impuesto> impuestos;
	private ArrayList<Gasto> gastos;

	public Ciudad(String nombre, int poblacion) {
		this.nombre = nombre;
		this.poblacion = poblacion;
	}

	public Ciudad(String nombre, int poblacion, ArrayList<Impuesto> impuestos, ArrayList<Gasto> gastos) {
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.impuestos = impuestos;
		this.gastos = gastos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	public ArrayList<Impuesto> getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(ArrayList<Impuesto> impuestos) {
		this.impuestos = impuestos;
	}

	public ArrayList<Gasto> getGastos() {
		return gastos;
	}

	public void setGastos(ArrayList<Gasto> gastos) {
		this.gastos = gastos;
	}

	public boolean getCiudadGrande() {
		return (poblacion > 100000);
	}

	public double getImpuestoTotal() {
		double total = 0;
		for (Impuesto impuesto : impuestos) {
			total += impuesto.getMonto();
		}
		return total;
	}

	public double getGastoTotal() {
		double total = 0;
		for (Gasto gasto : gastos) {
			total += gasto.getMonto();
		}
		return total;
	}

	public double getDeficit() {
		return getImpuestoTotal() - getGastoTotal();
	}

	public boolean getEnDeficit() {
		return (getImpuestoTotal() < getGastoTotal());
	}
}
