import java.util.Scanner;

public class Ejecutarjuego {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del Guerrero: ");
        String nombre1 = scanner.nextLine();
        Guerrero guerrero = new Guerrero(nombre1);

        System.out.print("Introduce el nombre del Mago: ");
        String nombre2 = scanner.nextLine();
        Mago mago = new Mago(nombre2);

        JuegoLucha juego = new JuegoLucha(guerrero, mago);
        juego.iniciarPelea();
    }

}

 