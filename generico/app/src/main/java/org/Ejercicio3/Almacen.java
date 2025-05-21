package org.Ejercicio3;

import java.util.List;

/**
 * Almacen
 * Define una clase Almacen que pueda almacenar productos. Esta clase debe tener
 * un método para añadir un producto al almacén y otro método para imprimir los
 * productos almacenados.
 * Implementa el método imprimirProductos de la clase Almacen utilizando un
 * comodín <? extends Producto> para permitir imprimir una lista de productos
 * sin importar el tipo específico.
 */
public class Almacen {

    private List<Producto> almacen;

    public void addProducto(Producto producto) {
        almacen.add(producto);
    }

    public void imprimirProductos(List<? extends Producto> listaProductos) {
        for (Producto producto : listaProductos) {
            System.out.println(producto.toString());
        }
    }

    public List<Producto> getAlmacen() {
        return almacen;
    }

}
