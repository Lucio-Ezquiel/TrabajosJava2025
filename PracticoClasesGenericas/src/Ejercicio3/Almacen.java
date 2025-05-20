package Ejercicio3;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private List<Producto> productos;

    public Almacen(){
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public void imprimirProductos(List<? extends Producto> lista){
        for(Producto p : lista){
            System.out.println(p);
        }
    }

    public List<Producto> getProductos(){
        return productos;
    }
}
