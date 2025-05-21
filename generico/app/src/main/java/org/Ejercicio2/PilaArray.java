package org.Ejercicio2;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * PilaArray
 * Esta clase tiene como atributos un array del mismo tipo genérico E que la
 * clase y un entero que sirve de contador de objetos. El constructor recibe por
 * parámetro el tamaño máximo de la pila.
 */
public class PilaArray<E> {
    E[] array;
    int counter;

    PilaArray(int max) {
        this.array = (E[]) new Object[max];
        this.counter = 0;
    }

    /**
     * @return
     *
     *         El método estaVacia() comprueba si el contador es 0.
     * 
     */
    public boolean estaVacia() {
        if (counter == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param e
     *          El método añadir() recibe por parámetro un objeto de tipo E,
     *          comprueba que hay espacio libre y, si es así, lo añade en la celda
     *          que indica el contador.
     *          Posteriormente incrementa el valor del contador. Si se ha añadido,
     *          devuelve true. Si no se ha podido añadir, devuelve false.
     */
    public boolean anadir(E e) {
        if (counter < array.length) {
            array[counter] = e;
            counter++;
            return true;
        }
        return false;
    }

    /**
     * primero(): si está vacía, lanza NoSuchElementException. Si no está vacía,
     * devuelve el elemento que está en el contador. El método se declara de tipo E,
     * ya que los objetos que va a devolver son del tipo parámetro.
     */
    public E primero() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila esta vacia.");
        }
        return array[counter - 1];
    }

    /**
     * extraer(): si está vacía, lanza NoSuchElementException. Si no está vacía,
     * decrementa el contador y devuelve el elemento que está en la celda indicada
     * por el contador después de decrementarse. Extraer se declara también de tipo
     * E. Recuerda que NoSuchElementException hereda de RunTimeException, por lo que
     * no se declara en la cláusula throws.
     */
    public E extraer() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila esta vacia");
        }
        counter--;
        return array[counter];
    }

    @Override
    public String toString() {
        return "PilaArray [array=" + Arrays.toString(array) + ", counter=" + counter + "]";
    }

}
