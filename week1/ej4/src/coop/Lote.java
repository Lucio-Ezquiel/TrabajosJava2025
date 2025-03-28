import java.util.ArrayList;

public class Lote {
    private int numero;
    private ArrayList<Mineral> minerales;
    private ArrayList<Cereal> historia;

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

}
