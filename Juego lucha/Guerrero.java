
class Guerrero extends Personaje {
    private Random rand = new Random();

    public Guerrero(String nombre) {
        super(nombre);
    }

    public void ataqueFuerte(Personaje oponente) {
        int daño = rand.nextInt(30) + 15; // Ataque fuerte  de espada entre 15 y 44 de daño
        oponente.recibirDaño(daño);
        System.out.println(this.getNombre() + " usa ¡Ataque de espada! contra " + oponente.getNombre() + " causando " + daño + " puntos de daño.");
    }

    public void tajoRapido(Personaje oponente) {
        int daño = rand.nextInt(15) + 5; // lanza ataque cuchilo entre 5 y 19 de daño
        oponente.recibirDaño(daño);
        System.out.println(this.getNombre() + " lanza un ¡Ataque de cuchillo! a " + oponente.getNombre() + " infligiendo " + daño + " puntos de daño.");
    }


    public void atacar(Personaje oponente) {
        // El Guerrero tiene un 60% de usar ataque fuerte y 40% de usar tajo rápido
        if (rand.nextDouble() < 0.6) {
            ataqueFuerte(oponente);
        } else {
            tajoRapido(oponente);
        }
    }
}
