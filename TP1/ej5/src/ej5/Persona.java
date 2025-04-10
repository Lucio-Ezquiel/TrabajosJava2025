import java.util.ArrayList;

public class Persona {
    private String nombre;
    private ArrayList<Resenia> resenias = new ArrayList<>();

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Resenia> getResenias() {
        return resenias;
    }

    public void setResenias(ArrayList<Resenia> resenias) {
        this.resenias = resenias;
    }

}
