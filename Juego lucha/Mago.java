import java.util.Random;  
class Mago extends Personaje {
    private Random rand = new Random();

    public Mago(String nombre) {
        super(nombre);
    }

    public void bolaDeFuego(Personaje oponente) {
        int daño = rand.nextInt(40) + 20; // Bola de fuego entre 20 y 59 de daño
        oponente.recibirDaño(daño);
        System.out.println(this.getNombre() + " lanza una ¡Bola de Fuego! a " + oponente.getNombre() + " quemando " + daño + " puntos de vida.");
    }

    public void rayoArcano(Personaje oponente) {
        int daño = rand.nextInt(25) + 10; // Rayo arcano entre 10 y 34 de daño
        oponente.recibirDaño(daño);
        System.out.println(this.getNombre() + " conjura un ¡Rayo Arcano! impactando a " + oponente.getNombre() + " con " + daño + " puntos de daño mágico.");
    }

    public void atacar(Personaje oponente) {
        // El Mago tiene un 50% de usar bola de fuego y 50% de usar rayo arcano
        if (rand.nextDouble() < 0.5) {
            bolaDeFuego(oponente);
        } else {
            rayoArcano(oponente);
        }
    }
}
