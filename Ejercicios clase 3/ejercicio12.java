public class PosicionesElementos {

    public static void main(String[] args) {
      
        int[] arregloA = {4, 6, 8, 2, 6, 9, 6, 1};


        int numeroBuscado = 6;

   
        int cantidadPosiciones = 0;
        for (int i = 0; i < arregloA.length; i++) {
            if (arregloA[i] == numeroBuscado) {
                cantidadPosiciones++;
            }
        }


        int[] arregloB = new int[cantidadPosiciones];

        int posicionEnB = 0;
        for (int i = 0; i < arregloA.length; i++) {
            if (arregloA[i] == numeroBuscado) {
                arregloB[posicionEnB] = i + 1; 
                posicionEnB++;
            }
        }

        System.out.println("Arreglo A: ");
        for (int i = 0; i < arregloA.length; i++) {
            System.out.print(arregloA[i] + " ");
        }
        System.out.println();

        System.out.println("Número buscado: " + numeroBuscado);

        System.out.println("Arreglo B (posiciones): ");
        for (int i = 0; i < arregloB.length; i++) {
            System.out.print(arregloB[i] + " ");
        }
        System.out.println();
    }
}