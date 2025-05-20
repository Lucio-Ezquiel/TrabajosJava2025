/**
 * AutoF1
 */
public class AutoF1 {

    private String marca;

    public AutoF1(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void arrancar() {
        System.out.println("El " + marca + " arranca!");
    }

    public void pit(Rueda rueda) {
        System.out.println("Cambiando a rueda: " + rueda.getTipo());
    }
}
