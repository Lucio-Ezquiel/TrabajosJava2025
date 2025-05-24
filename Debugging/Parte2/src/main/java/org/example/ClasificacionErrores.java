package org.example;

public class ClasificacionErrores {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("El tercer elemento es: " + numeros[3]); // Error lógico porque le estas dando el cuarto elemento
        String mensaje = null;
        System.out.println(mensaje.length()); // Error de ejecución (nullpointerexception)

        for(int i = 0; i <= numeros.length; i++) { // Error de ejecución (ArrayIndexOutOfBoundsException)
            System.out.println("Número: " + numeros[i]);
        }
        int resultado = dividir(10, 0);
        System.out.println("Resultado de la división: " + resultado); // Error de ejecución (ArithmeticException) por dividir por 0

        System.out.println(saludo("Juan"));
    }

    public static int dividir(int a, int b) {
        return a / b; // Error de ejecución (ArithmeticException) por dividir por 0
    }

    public static String saludo(String nombre) {
        return "Hola, " + nombre;
    }
}

