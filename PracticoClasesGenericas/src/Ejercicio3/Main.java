package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();

        almacen.agregarProducto(new Producto("Pan", 1.5));
        almacen.agregarProducto(new Producto("Telefono", 300));
        almacen.agregarProducto(new Producto("Queso", 40));

        System.out.println("Lista de productos");
        almacen.imprimirProductos(almacen.getProductos());
    }
}
