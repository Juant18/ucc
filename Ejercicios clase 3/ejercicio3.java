public class ejercicio3 {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int pares = 0;
        int impares = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares += numero;
            } else {
                impares += numero;
            }
        }

        System.out.println("Suma de números pares: " + pares);
        System.out.println("Suma de números impares: " + impares);
    }
}