import java.util.ArrayList;

public class Restaurante {
    private int local;
    private ArrayList<Plato> platos = new ArrayList<>(20);

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public void addPlato(Plato p) {
        this.platos.add(p);
    }

    public Restaurante(int local) {
        this.local = local;
    }

    public int getLocal() {
        return local;
    }

    public void setLocal(int local) {
        this.local = local;
    }

}
