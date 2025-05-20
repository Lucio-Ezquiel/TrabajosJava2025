/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Rueda ruedasVerdes = new Rueda("Intermediates");
        AutoF1 m1 = new AutoF1("Ferrari");

        m1.arrancar();
        m1.pit(ruedasVerdes);
    }
}
