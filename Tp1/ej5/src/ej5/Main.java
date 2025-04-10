import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cadena mcd = new Cadena("McDonalds");
        Cadena bk = new Cadena("Burger King");
        Cadena mx = new Cadena("Tomatillo");

        // load mcd
        ArrayList<Restaurante> mcdRestaurantes = new ArrayList<>();
        for (int i = 2; i < 10; i++) {
            mcdRestaurantes.add(new Restaurante(i));
        }
        mcd.setRestaurantes(mcdRestaurantes);

        // load bk
        ArrayList<Restaurante> bkRestaurantes = new ArrayList<>();
        for (int i = 2; i < 10; i++) {
            bkRestaurantes.add(new Restaurante(i));
        }
        bk.setRestaurantes(bkRestaurantes);

        mx.restaurantes.get(0).addPlato(new Plato("Tacos", 12.50));

        Persona p1 = new Persona("Miguel");
        Resenia r1 = new Resenia(5, mx.restaurantes.get(0).getPlatos().get(0));
        ArrayList<Resenia> rs = new ArrayList<>();
        rs.add(r1);
        p1.setResenias(rs);
    }
}
