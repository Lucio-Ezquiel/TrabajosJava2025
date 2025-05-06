class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico.");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("¡Guau!");
    }

    public void ladrar() {
        System.out.println("El perro está ladrando.");
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("¡Miau!");
    }

    public void maullar() {
        System.out.println("El gato está maullando.");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        miPerro.hacerSonido(); 
        miGato.hacerSonido();

        if (miPerro instanceof Perro) {
            Perro perroReal = (Perro) miPerro; 
            perroReal.ladrar();
        }

        if (miGato instanceof Gato) {
            Gato gatoReal = (Gato) miGato; 
            gatoReal.maullar();
        }
    }
}