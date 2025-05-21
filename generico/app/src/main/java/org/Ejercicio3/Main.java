package org.Ejercicio3;

/**
 * Main
 * Crea una clase Main que pruebe el funcionamiento de la clase Almacen. En esta
 * clase, crea una instancia de Almacen, agrega varios productos de diferentes
 * tipos (por ejemplo, alimentos, electrónicos, etc.) y luego imprime los
 * productos almacenados.
 */
public class Main {

    public static void main(String[] args) {
        Almacen super_chino = new Almacen();
        super_chino.addProducto(new Producto("Tita", 985.12f));
        super_chino.addProducto(new Producto("Cofler Block 1Kg", 2900.03f));
        super_chino.addProducto(new Producto("Takis Fuego", 4390.40f));

        super_chino.imprimirProductos(super_chino.getAlmacen());
    }
}
