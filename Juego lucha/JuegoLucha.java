// Clase JuegoLucha que gestiona el combate entre dos personajes
class JuegoLucha {
    private Personaje jugador1;  
    private Personaje jugador2;  

    // Constructor que inicializa los dos jugadores en la pelea
    public JuegoLucha(Personaje jugador1, Personaje jugador2) {
        this.jugador1 = jugador1; 
        this.jugador2 = jugador2; 
    }

    // Método para iniciar la pelea entre los dos jugadores
    public void iniciarPelea() {
        System.out.println("La pelea comienza entre " + jugador1.getNombre() + " y " + jugador2.getNombre() + "...");

        // El bucle de la pelea continúa mientras ambos jugadores estén vivos
        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            // Turno del jugador 1
            turno(jugador1, jugador2);
            // Si el jugador 2 sigue vivo, entonces es su turno
            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }

        // Al finalizar la pelea, muestra quién ha ganado
        if (jugador1.estaVivo()) {
            System.out.println(jugador1.getNombre() + " ha ganado la pelea.");
        } else {
            System.out.println(jugador2.getNombre() + " ha ganado la pelea.");
        }
    }

    // Método privado para gestionar el turno de un personaje
    private void turno(Personaje atacante, Personaje defensor) {
        System.out.println("Turno de " + atacante.getNombre() + ". Puntos de vida de " + defensor.getNombre() + ": " + defensor.getPuntosDeVida());
        atacante.atacar(defensor);
        System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getPuntosDeVida() + " puntos de vida.");
    }
}
