package org.example;

public class Usuario {
    private String nombre;
    private int edad;

    public String obtenerNombre(String nombre){
        return nombre;
    }

    public void establecerNombre(String nombre){
        this.nombre = nombre;
    }

    public int obtenerEdad(int edad){
        return edad;
    }

    public void establecerEdad(int edad){
        if(edad<0){
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        this.edad = edad;
    }

    @Override
    public String toString(){
        return "Usuario{" +
               "nombre='" + nombre + '\'' +
               ", edad=" + edad +
               '}';
    }
}
