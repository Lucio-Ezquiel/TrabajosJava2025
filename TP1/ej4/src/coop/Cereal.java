import java.util.ArrayList;

public abstract class Cereal {
    private String nombre;
    private ArrayList<Mineral> mineralesNecesarios;

    public Cereal() {
    }

    public Cereal(String nombre, ArrayList<Mineral> mineralesNecesarios) {
        this.nombre = nombre;
        this.mineralesNecesarios = mineralesNecesarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Mineral> getMineralesNecesarios() {
        return mineralesNecesarios;
    }

    public void setMineralesNecesarios(ArrayList<Mineral> mineralesNecesarios) {
        this.mineralesNecesarios = mineralesNecesarios;
    }

}
