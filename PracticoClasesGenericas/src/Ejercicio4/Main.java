package Ejercicio4;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Almacen<Producto> almacen = new Almacen<>();

        almacen.agregarElemento(new Producto("Leche", 200));
        almacen.agregarElemento(new Producto("Tablet", 1000));

        System.out.println("Elementos en el almacen:");
        List<Producto> lista = almacen.getElementos();
        almacen.imprimirElementos(lista);
    }
}
