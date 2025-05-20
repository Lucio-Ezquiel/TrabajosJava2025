package Ejercicio1;

public class MiNumero implements Operable<MiNumero> {
    private double valor;

    public MiNumero(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public MiNumero sumar(MiNumero otro) {
        return new MiNumero(this.valor + otro.valor);
    }

    @Override
    public MiNumero restar(MiNumero otro) {
        return new MiNumero(this.valor - otro.valor);
    }

    @Override
    public MiNumero multiplicar(MiNumero otro) {
        return new MiNumero(this.valor * otro.valor);
    }

    @Override
    public MiNumero dividir(MiNumero otro) {
        if (otro.valor == 0) {
            throw new ArithmeticException("División por cero");
        }
        return new MiNumero(this.valor / otro.valor);
    }

    public static void main(String[] args) {
        MiNumero num1 = new MiNumero(10);
        MiNumero num2 = new MiNumero(5);

        MiNumero suma = num1.sumar(num2);
        System.out.println("Suma: " + suma.getValor()); // Salida: Suma: 15.0

        MiNumero resta = num1.restar(num2);
        System.out.println("Resta: " + resta.getValor()); // Salida: Resta: 5.0

        MiNumero producto = num1.multiplicar(num2);
        System.out.println("Producto: " + producto.getValor()); // Salida: Producto: 50.0

        MiNumero division = num1.dividir(num2);
        System.out.println("División: " + division.getValor()); // Salida: División: 2.0
    }
}