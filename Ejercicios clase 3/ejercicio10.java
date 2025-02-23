public class ejercicio10 {
    public static void main(String[] args) {
        int[] arregloA = {8, 5, 3, 10, 2, 8, 1};
        int[] arregloB = new int[arregloA.length / 2];

        int[] arregloInverso = new int[arregloA.length];
        for (int i = 0; i < arregloA.length; i++) {
            arregloInverso[i] = arregloA[arregloA.length - 1 - i];
        }

        for (int i = 0; i < arregloA.length / 2; i++) {
            arregloB[i] = arregloA[i] + arregloInverso[i];
        }

        System.out.print("Arreglo A: ");
        imprimirArreglo(arregloA);
        System.out.print("Arreglo Inverso: ");
        imprimirArreglo(arregloInverso);
        System.out.print("Arreglo B: ");
        imprimirArreglo(arregloB);
    }

  
    public static void imprimirArreglo(int[] arreglo) {
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
}