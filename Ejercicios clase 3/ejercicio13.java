import java.util.ArrayList; 
import java.util.Arrays; 

public class ejercicio13 {

    public static void main(String[] args) {
     
        int[] notas = {10, 5, 20, 15, 8, 3, 12};

        double promedio = calcularPromedio(notas);

       
        ArrayList<Integer> mayores = new ArrayList<>();
        ArrayList<Integer> menores = new ArrayList<>();

      
        for (int nota : notas) {
            if (nota > promedio) {
                mayores.add(nota); 
            } else if (nota < promedio) {
                menores.add(nota); 
            }
        }

     
        System.out.println("Notas: " + Arrays.toString(notas));
        System.out.println("Promedio: " + promedio);
        System.out.println("Notas mayores que el promedio: " + mayores);
        System.out.println("Notas menores que el promedio: " + menores);
    }


    public static double calcularPromedio(int[] numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return (double) suma / numeros.length;
    }
}
