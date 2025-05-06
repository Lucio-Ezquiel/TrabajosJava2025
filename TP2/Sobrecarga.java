public class Calculadora {

    public int sumar(int a, int b) {
        System.out.println("Sumando dos enteros");
        return a + b;
    }

    public double sumar(double a, double b) {
        System.out.println("Sumando dos doubles");
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        System.out.println("Sumando tres enteros");
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultadoEnteros = calc.sumar(5, 3);        
        double resultadoDoubles = calc.sumar(2.5, 3.7); 
        int resultadoTresEnteros = calc.sumar(1, 2, 3); 

        System.out.println("Resultado enteros: " + resultadoEnteros);
        System.out.println("Resultado doubles: " + resultadoDoubles);
        System.out.println("Resultado tres enteros: " + resultadoTresEnteros);
    }
}