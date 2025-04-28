public class Automovil {
    private Motor motor;

    public Automovil(Motor motor) {
        this.motor = motor;
    }

    // Métodos para interactuar con el automóvil
}

public class Motor {
    // Atributos y métodos del motor
}

public class EjemploComposicion {
    public static void main(String[] args) {
        Motor motor = new Motor(); // El motor no puede existir sin el Automovil
        Automovil auto = new Automovil(motor);
    }
}