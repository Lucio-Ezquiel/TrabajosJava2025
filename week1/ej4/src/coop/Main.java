import java.util.ArrayList;
import java.util.Arrays;

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

        // dar opciones cual es el 'elegido'
        Mineral especial = (Mineral) JOptionPane.showInputDialog(null, "Elige el mineral 'Especial'", "Ingreso",
                JOptionPane.QUESTION_MESSAGE, null, minerals.toArray(), minerals.get(0));

        // no quiero chequear por un respuesta de fin
        int numCereals = Integer.valueOf(JOptionPane.showInputDialog("Cuantos tipos de cereales hay?"));
        for (int i = 0; i < numCereals; i++) {
            String[] opciones = { "Fina", "Gruesa", "Pastura" };
            ArrayList<Mineral> necesarias = new ArrayList<>();
            String tipo = (String) JOptionPane.showInputDialog(null, "Que tipo de cereal es:", "Tipo",
                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
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
                case "Gruesa":
                    cereales.add(new CosechaGruesa(nombre, necesarias));
                    break;
                case "Pastura":
                    cereales.add(new Pastura(nombre, necesarias));
                    break;
                default:
                    System.out.println("404");
                    break;
            }
        }

        // do while this time
        int repetir = JOptionPane.YES_OPTION;
        ArrayList<Lote> lotes = new ArrayList<>();
        do {
            int numero = Integer.valueOf(JOptionPane.showInputDialog("Numero de lote"));
            ArrayList<Mineral> mineralesLote = new ArrayList<>();
            for (Mineral var : minerals) {
                if (JOptionPane.showConfirmDialog(null, "Contiene " + var.getNombre()) == JOptionPane.YES_OPTION) {
                    mineralesLote.add(var);
                }
            }

            ArrayList<Cereal> historia = new ArrayList<>();
            for (Cereal var : cereales) {
                if (JOptionPane.showConfirmDialog(null, "Tuvo " + var.getNombre()) == JOptionPane.YES_OPTION) {
                    historia.add(var);
                }
            }

            if (mineralesLote.contains(especial)) {
                lotes.add(new Especial(numero, mineralesLote, historia));
            } else {
                lotes.add(new Comun(numero, mineralesLote, historia));
            }

            repetir = JOptionPane.showConfirmDialog(null, "Agregar otro lote?", "Mas lotes", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
        } while (repetir == JOptionPane.YES_OPTION);

        for (Lote lote : lotes) {
            // chequear que tenga los minerales
            lote.setAutoPosibles(cereales);
            // imprimir informacion
            lote.displayPosibles();
        }
    }
}
