public class ejercicio9 {

    public static void main(String[] args) {

    
        int[] numeros = {5, 2, 8, 5, 1, 5, 9, 5, 2};

       
        int numeroBuscado = 5;

       
        int contador = 0;

        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                contador++;
            }
        }

        
        System.out.println("El número " + numeroBuscado + " aparece " + contador + " veces en el arreglo.");
    }
}