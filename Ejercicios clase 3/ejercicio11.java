
import java.util.Arrays;

public class SepararNumeros {

    public static void main(String[] args) {
        int[] arregloA = {1, -2, 0, 5, -8, 0, 3, -1, 7}; 

        int numNegativos = 0;
        int numCeros = 0;
        int numPositivos = 0;

        for (int num : arregloA) {
            if (num < 0) {
                numNegativos++;
            } else if (num == 0) {
                numCeros++;
            } else {
                numPositivos++;
            }
        }

        
        int[] negativos = new int[numNegativos];
        int[] ceros = new int[numCeros];
        int[] positivos = new int[numPositivos];

        int indiceNegativo = 0;
        int indiceCero = 0;
        int indicePositivo = 0;

        for (int num : arregloA) {
            if (num < 0) {
                negativos[indiceNegativo++] = num;
            } else if (num == 0) {
                ceros[indiceCero++] = num;
            } else {
                positivos[indicePositivo++] = num;
            }
        }

        System.out.println("Arreglo original: " + Arrays.toString(arregloA));
        System.out.println("Negativos: " + Arrays.toString(negativos));
        System.out.println("Ceros: " + Arrays.toString(ceros));
        System.out.println("Positivos: " + Arrays.toString(positivos));
    }
}
