import java.util.Arrays; 

public class ejercicio14 {

    public static void main(String[] args) {
        
        int[] arregloA = {4, 6, 8, 2, 6, 9, 5, 1};

        
        int[] arregloB = new int[arregloA.length - 1];

        for (int i = 0; i < arregloA.length - 1; i++) {
            arregloB[i] = arregloA[i + 1] - arregloA[i];
        }

        
        System.out.println("Arreglo A: " + Arrays.toString(arregloA));
        System.out.println("Arreglo B: " + Arrays.toString(arregloB));
    }
}