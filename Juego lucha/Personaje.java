import java.util.Random;  
// Clase base Personaje
class Personaje {
    // Atributos privados de la clase
    private String nombre;            
    private int puntosDeVida;         
    private int MAX_DAÑO = 30;      
    private int MIN_DAÑO = 10;        

    // Constructor de la clase Personaje
    // Inicializa el nombre del personaje y asigna 100 puntos de vida por defecto
    public Personaje(String nombre) {
        this.nombre = nombre;         
        this.puntosDeVida = 100;      
    }

    // Método para realizar un ataque a otro personaje
    // Este método genera un daño aleatorio entre los valores mínimo y máximo y lo aplica al oponente
    public void atacar(Personaje oponente) {
        Random rand = new Random();  // Crea un objeto Random para generar números aleatorios
        // Genera un daño aleatorio entre MIN_DAÑO y MAX_DAÑO 
        int daño = rand.nextInt((MAX_DAÑO - MIN_DAÑO) + 1) + MIN_DAÑO;
        // Aplica el daño al oponente
        oponente.recibirDaño(daño);
        // Imprime un mensaje con el resultado del ataque
        System.out.println(this.nombre + " ataca a " + oponente.getNombre() + " causando " + daño + " puntos de daño.");
    }

    // Método para aplicar daño a este personaje
    // El daño es restado a los puntos de vida del personaje
    public void recibirDaño(int daño) {
        this.puntosDeVida -= daño;  // Resta el daño a los puntos de vida
        // Si los puntos de vida quedan por debajo de 0, se establece en 0
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0;
        }
    }

    // Método para verificar si el personaje sigue con vida
    // Retorna true si los puntos de vida son mayores que 0, false en caso contrario
    public boolean estaVivo() {
        return this.puntosDeVida > 0;  
    }

    // Método para obtener el nombre del personaje
    // Retorna el nombre del personaje
    public String getNombre() {
        return this.nombre;  
    }

    // Método para obtener los puntos de vida del personaje
    // Retorna los puntos de vida actuales del personaje
    public int getPuntosDeVida() {
        return this.puntosDeVida; 
    }
}

