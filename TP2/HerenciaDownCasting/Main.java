import HerenciaDownCasting2.Child;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Madre helen = new Hija();
        helen.anioNacimiento = 1955;

        Hija beatriz = (Hija) helen;
        beatriz.marcaCelular = "Apple";

        System.out.println(beatriz.anioNacimiento);
        System.out.println(beatriz.marcaCelular);
        beatriz.informar();
    }
}
