import java.util.Scanner;  
public class Ejecutarjuego {

   
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer las entradas del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario el nombre del Guerrero
        System.out.print("Introduce el nombre del Guerrero: ");
        String nombre1 = scanner.nextLine();  
        
        Guerrero guerrero = new Guerrero(nombre1);

        // Solicita al usuario el nombre del Mago
        System.out.print("Introduce el nombre del Mago: ");
        String nombre2 = scanner.nextLine();  
        Mago mago = new Mago(nombre2);
       
        JuegoLucha juego = new JuegoLucha(guerrero, mago);

        // Inicia la pelea entre los personajes
        juego.iniciarPelea(); 
    }
}

 