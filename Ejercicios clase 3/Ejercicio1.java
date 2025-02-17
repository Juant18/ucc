import java.util.Scanner;

public class Ejercicio1 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int[] b = new int[n];
        // estructura para llenar el arreglo, con numeros aleatorios
        // entre 10 y 30
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * (30 + 10)) - 10;
            System.out.println("b[" + i + "]=" + b[i]);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "]=" + b[i]);
        }
        int suma = 0;
        for (int i = 0; i < b.length; i++) {
            suma = suma + b[i];
        }
        leer.close();
    }
}
