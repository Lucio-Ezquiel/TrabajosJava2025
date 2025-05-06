/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Madre helen = (Madre) new Hija();
        Madre susana = new Madre();

        helen.informar();
        susana.informar();
    }
}
