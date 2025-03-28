import java.util.ArrayList;
import java.util.Arrays;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mineral> minerals = new ArrayList<>();
        minerals.add(new Mineral("Hierro"));
        minerals.add(new Mineral("Potasio"));
        minerals.add(new Mineral("Nitrogeno"));
        minerals.add(new Mineral("Mercurio"));
        minerals.add(new Mineral("Hidrogeno"));

        // Mineral m1 = new Mineral("Hierro");
        // Mineral m2 = new Mineral("Potasio");
        // Mineral m3 = new Mineral("Nitrogeno");
        // Mineral m4 = new Mineral("Mercurio");
        // Mineral m5 = new Mineral("Hidrogeno");
        //
        // ArrayList<Mineral> ma1 = new ArrayList<Mineral>();
        // ma1.add(m1);
        // ma1.add(m2);
        // ma1.add(m3);
        //
        // ArrayList<Mineral> ma2 = new ArrayList<Mineral>();
        // ma2.add(m1);
        // ma2.add(m2);
        //
        // Pastura p1 = new Pastura("Alfalfa", ma1);
        //
        // CosechaGruesa cg1 = new CosechaGruesa("Girasol", ma2);
        //
        // CosechaFina cf1 = new CosechaFina("Trigo", ma2);
        //
        // ArrayList<Cereal> ca1 = new ArrayList<Cereal>();
        //
        // Lote l1 = new Lote(1, ma1, ca1);

        // get mineral especial
        // get cereales posibles (name, type)
        // get required minereals for each cereal
        // get lotes con numero (numero)
        // get minerals for each lote -> create by type
        // checks by type
        // return list for every lote, what cereal can be planted

        // array de cereales para despues
        ArrayList<Cereal> cereales = new ArrayList<>();

        // type casting a array de objetos
        Object[] valoresPossibles = minerals.toArray();

        // dar opciones cual es el 'elegido'
        Object especial = JOptionPane.showInputDialog(null, "Elige el mineral 'Especial'", "Ingreso",
                JOptionPane.INFORMATION_MESSAGE, null, valoresPossibles, valoresPossibles[0]);

        // no quiero chequear por un respuesta de fin
        int numCereals = Integer.valueOf(JOptionPane.showInputDialog("Cuantos tipos de cereales hay?"));
        for (int i = 0; i < numCereals; i++) {
            String[] opciones = { "Fina", "Gruesa", "Pastura" };
            ArrayList<Mineral> necesarias = new ArrayList<>();
            // Object tipo = JOptionPane.showInputDialog(null, "Elige el tipo de cereal",
            // "Ingreso",
            // JOptionPane.INFORMATION_MESSAGE, null, valoresPossibles,
            // valoresPossibles[0]);
            String tipo = JOptionPane.showInputDialog("Tipo (Fina, Gruesa, Pastura): ");
            while (!Arrays.asList(opciones).contains(tipo)) {
                tipo = JOptionPane.showInputDialog("Tipo (Fina, Gruesa, Pastura): ");
            }
            String nombre = JOptionPane.showInputDialog("Nombre: ");
            for (Mineral var : minerals) {
                if (JOptionPane.showConfirmDialog(null, "Requiere " + var.getNombre()) == JOptionPane.YES_OPTION) {
                    necesarias.add(var);
                }
            }
            switch (tipo) {
                case "Fina":
                    cereales.add(new CosechaFina(nombre, necesarias));
                    break;

                default:
                    break;
            }
        }

    }
}
