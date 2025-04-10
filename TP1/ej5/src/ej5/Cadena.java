import java.util.ArrayList;

public class Cadena {
    private String nombre;
    public ArrayList<Restaurante> restaurantes = new ArrayList<>();

    public Cadena(String nombre) {
        this.nombre = nombre;
        // todo cadena requiere un restaurante
        this.restaurantes.add(new Restaurante(1));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(ArrayList<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }

}
