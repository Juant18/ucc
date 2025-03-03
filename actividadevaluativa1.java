import java.util.Scanner;

public class actividadevaluativa1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        boolean aceptar = true;

        while (aceptar) {
            int capacidadmaxima = 20;
            int[] capacidad = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
            String[] placas = new String[20];// placas
            double[] tarifas = new double[20]; // tarifas
            int contadorMotos = 0;// contador de las motos
System.out.println("Desea registrar su carro dijite 1 para si 2 para no");
int sino = leer.nextInt();
if(sino==1){
            System.out.println("Menu principal de motos");
            System.out.println("seleccione 1 para parquear su moto");
            System.out.println("seleccione 2 para pagar su tarifa");
            System.out.println("seleccione 3 para ver el estado del parqueadero");
            System.out.println("Seleccione 4 para salir");

            opcion = leer.nextInt();
            leer.nextLine();
       
    

         if (opcion == 1 && opcion < capacidadmaxima) {
                System.out.println("Dime el horario de entrada ");
                String horarioentrada = leer.next();
                System.out.println("Dime el numero de la placa de tu moto");
                String placamoto = leer.next();
                placas[contadorMotos] = placamoto;
                contadorMotos++;
                System.out.println("Moto parqueada. Total motos: " + contadorMotos);
                System.out.println("dime en el lugar que vas a estacionar del 1 al 20");
                int lugaestacionamiento = leer.nextInt();
            } else if (opcion == 1 && contadorMotos >= capacidadmaxima) {
                System.out.println("El parqueadero está lleno.");

            } else {

                System.out.println("El parqueadero está lleno.");
            }

            if (opcion == 2) {
                System.out.println("Ingrese la placa de la moto a pagar:");
                String placapagar = leer.nextLine();
                System.out.print("Ingrese el horario de salida  ");
                String horariosEntrada = leer.next();

                for (int j = 0; j < contadorMotos; j++) {

                }
            }leer.close();
        }else if (sino == 2) {
                System.out.println("Tenga buena tarde");
                aceptar = false; // Salir del bucle
            }
        }
    } 
}





