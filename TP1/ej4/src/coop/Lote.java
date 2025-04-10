import java.util.ArrayList;

public abstract class Lote {
    private int numero;
    private ArrayList<Mineral> minerales;
    private ArrayList<Cereal> historia;
    private ArrayList<Cereal> posibles;

    public Lote() {
    }

    public Lote(int numero, ArrayList<Mineral> minerales, ArrayList<Cereal> historia) {
        this.numero = numero;
        this.minerales = minerales;
        this.historia = historia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Mineral> getMinerales() {
        return minerales;
    }

    public void setMinerales(ArrayList<Mineral> minerales) {
        this.minerales = minerales;
    }

    public ArrayList<Cereal> getHistoria() {
        return historia;
    }

    public void setHistoria(ArrayList<Cereal> historia) {
        this.historia = historia;
    }

    public ArrayList<Cereal> getPosibles() {
        return posibles;
    }

    public void setPosibles(ArrayList<Cereal> posibles) {
        this.posibles = posibles;
    }

    public void setAutoPosibles(ArrayList<Cereal> cereales) {
        ArrayList<Cereal> posibles = new ArrayList<>();
        for (Cereal cereal : cereales) {
            if (minerales.containsAll(cereal.getMineralesNecesarios())) {
                posibles.add(cereal);
            }
        }
    }

    public void displayPosibles() {
        System.out.println(numero);
        System.out.println("-".repeat(String.valueOf(numero).length()));

        // maldito lambda function
        // arraylist.forEach( (var) -> function que realizar)
        posibles.forEach(cer -> System.out.println(cer.getNombre()));
    }
}
