package Ejercicio2;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class PilaArray<E> {
    private E[] listita;
    private int contador;

    public PilaArray (int tamano){
        contador = 0;
        listita = (E[]) new Object[tamano];
    }

    public boolean estaVacia(){
        return contador == 0;
    }

    public boolean añadir(E valor){
        if (contador < listita.length){
            listita[contador] = valor;
            contador++;
            return true;
        }
        return false;
    }

    public E primero(){
        if (estaVacia()) {
            throw new NoSuchElementException("La pila esta vacia.");
        }
        return listita[contador - 1];
    }

    public E extraer(){
        if (estaVacia()){
            throw new NoSuchElementException("La pila esta vacia.");
        }
        contador--;
        E lista = listita[contador];
        listita[contador] = null;
        return lista;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(listita, contador));
    }
}
