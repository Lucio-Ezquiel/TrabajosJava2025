package Ejercicio4;
import java.util.ArrayList;
import java.util.List;

public class Almacen<T extends Producto> {
    private List<T> elementos;

    public Almacen(){
        elementos = new ArrayList<>();
    }

    public void agregarElemento(T elemento){
        elementos.add(elemento);
    }

    public void imprimirElementos(List<? super T> lista){
        for(Object obj : lista){
            System.out.println(obj);
        }
    }

    public List<T> getElementos(){
        return elementos;
    }
}
