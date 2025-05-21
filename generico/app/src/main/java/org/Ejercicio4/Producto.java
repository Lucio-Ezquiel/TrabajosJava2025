package org.Ejercicio4;

/**
 * Producto
 * Define una clase Producto con los siguientes atributos:
 * nombre (String): representa el nombre del producto.
 * precio (double): representa el precio del producto.
 */
public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
