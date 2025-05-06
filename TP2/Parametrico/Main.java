import java.util.ArrayList;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<AutoF1> autos = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();

        AutoF1 m1 = new AutoF1("Maserati");

        autos.add(m1);
        strings.add("Hola Mundo!");
    }
}
