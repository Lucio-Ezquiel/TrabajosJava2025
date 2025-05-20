package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        PilaArray<String> pila = new PilaArray<>(5);

        System.out.println("¿Esta vacia? " + pila.estaVacia());

        pila.añadir("Uno");
        pila.añadir("Dos");
        pila.añadir("Tres");

        System.out.println("Contenido de la pila: " + pila);
        System.out.println("Elemento superior: " + pila.primero());

        System.out.println("Extraido: " + pila.extraer());
        System.out.println("Contenido despues de extraer: " + pila);

        System.out.println("¿Esta vacia? " + pila.estaVacia());
    }
}
