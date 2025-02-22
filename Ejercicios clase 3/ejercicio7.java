public class ejercicio7 {

        public static void main(String[] args) {
            int[] arregloA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    
            int numPares = 0;
            int numImpares = 0;
            for (int numero : arregloA) {
                if (numero % 2 == 0) {
                    numPares++;
                } else {
                    numImpares++;
                }
            }
            int[] pares = new int[numPares];
            int[] impares = new int[numImpares];
            int indicePar = 0;
            int indiceImpar = 0;
            for (int numero : arregloA) {
                if (numero % 2 == 0) {
                    pares[indicePar] = numero;
                    indicePar++;
                } else {
                    impares[indiceImpar] = numero;
                    indiceImpar++;
                }
            }
    
            System.out.println("Números pares:");
            for (int par : pares) {
                System.out.print(par + " ");
            }
            System.out.println();
    
            System.out.println("Números impares:");
            for (int impar : impares) {
                System.out.print(impar + " ");
            }
            System.out.println();
        }
    }

