import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {


        Scanner leer = new Scanner(System.in);



        System.out.print("Introduce tu edad: ");
      
        int edad1 = leer.nextInt();
         
        System.out.print("Introduce tu edad: ");
      
        int edad2 = leer.nextInt();

        if(edad1>edad2){
        System.out.println("la edad mayor"+ edad1);
         } else{
        System.out.println("La edad mayor es"+ edad2);
         }

 leer.close();
        }
     }
    