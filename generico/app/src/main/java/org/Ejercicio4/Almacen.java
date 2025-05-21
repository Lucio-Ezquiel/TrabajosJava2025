package org.Ejercicio4;

import java.util.List;

/**
 * Almacen
 * Implementa el método imprimirElementos de la clase Almacen utilizando un
 * comodín <? super T> para permitir imprimir una lista de elementos sin
 * importar el tipo específico.
 */
public class Almacen<T> {

    private List<T> almacen;

    public void addProducto(T producto) {
        almacen.add(producto);
    }

    public void imprimirElementos(List<? extends T> listaProductos) {
        for (T producto : listaProductos) {
            System.out.println(producto.toString());
        }
    }

    public List<T> getAlmacen() {
        return almacen;
    }

}
