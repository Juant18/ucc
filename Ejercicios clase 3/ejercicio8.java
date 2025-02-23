import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[30];

    
        for (int i = 0; i < 30; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];
        for (int num : numeros) {
            if (num > mayor) mayor = num;
            if (num < menor) menor = num;
        }

        int repMayor = 0, repMenor = 0;
        for (int num : numeros) {
            if (num == mayor) repMayor++;
            if (num == menor) repMenor++;
        }

     
        System.out.println("Mayor: " + mayor + " (x" + repMayor + ")");
        System.out.println("Menor: " + menor + " (x" + repMenor + ")");

        scanner.close();
    }
}