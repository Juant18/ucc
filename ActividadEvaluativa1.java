import java.util.Scanner;

public class ActividadEvaluativa1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        boolean aceptar = true;
        int capacidadMaxima = 20;
        int TARIFA_30_MIN = 0;
        int TARIFA_60_MIN = 800;
        int TARIFA_DESPUES_60_MIN = 2000;

        String[] placas = new String[capacidadMaxima]; // placas
        int contadorMotos = 0; // contador de las motos
        boolean[] lugaresOcupados = new boolean[capacidadMaxima];

        while (aceptar) {
            System.out.println("¿Desea registrar su moto? Digite 1 para sí, 2 para no");
            int sino = leer.nextInt();

            if (sino == 1) {
                System.out.println("Menú principal de motos");
                System.out.println("Seleccione 1 para parquear su moto");
                System.out.println("Seleccione 2 para pagar su tarifa");
                System.out.println("Seleccione 3 para ver el estado del parqueadero");
                System.out.println("Seleccione 4 para salir");

                opcion = leer.nextInt();
                leer.nextLine();

                if (opcion == 1) {
                    if (contadorMotos < capacidadMaxima) {
                        System.out.println("Dime el número de la placa de tu moto");
                        String placaMoto = leer.nextLine();

                        System.out.println("Dime en el lugar que vas a estacionar del 1 al " + capacidadMaxima);
                        int lugarEstacionamiento = leer.nextInt();

                        if (lugarEstacionamiento >= 1 && lugarEstacionamiento <= capacidadMaxima) {
                            if (lugaresOcupados[lugarEstacionamiento - 1]) {
                                lugaresOcupados[lugarEstacionamiento - 1] = true;
                                placas[contadorMotos] = placaMoto;
                                contadorMotos++;
                                System.out.println("Moto parqueada en el lugar " + lugarEstacionamiento
                                        + ". Total motos: " + contadorMotos);
                            } else {
                                System.out.println("El lugar " + lugarEstacionamiento + " ya está ocupado.");
                            }
                        } else {
                            System.out.println("Lugar no válido.");
                        }
                    } else {
                        System.out.println("El parqueadero está lleno.");
                    }
                } else if (opcion == 2) {
                    System.out.println("Ingrese la placa de la moto a pagar:");
                    String placaPagar = leer.nextLine();
                    System.out.print("Ingrese el tiempo de permanencia en minutos: ");
                    int tiempo = leer.nextInt();
                    int tarifa = calcularTarifa(tiempo, TARIFA_30_MIN, TARIFA_60_MIN, TARIFA_DESPUES_60_MIN);
                    System.out.println("Tarifa pagada para la moto con placa: " + placaPagar + ". Costo: $" + tarifa);
                } else if (opcion == 3) {
                    System.out.println("Estado del parqueadero:");
                    for (int i = 0; i < capacidadMaxima; i++) {
                        if (lugaresOcupados[i]) {
                            System.out.println("Lugar " + (i + 1) + ": Ocupado");
                        } else {
                            System.out.println("Lugar " + (i + 1) + ": Disponible");
                        }
                    }
                } else if (opcion == 4) {
                    System.out.println("Tenga buena tarde");
                    aceptar = false;
                } else {
                    System.out.println("Opción no válida.");
                }
            } else if (sino == 2) {
                System.out.println("Tenga buena tarde");
                aceptar = false;
            } else {
                System.out.println("Opción no válida.");
            }
        }
        leer.close();
    }

    static int calcularTarifa(int tiempo, int TARIFA_30_MIN, int TARIFA_60_MIN, int TARIFA_DESPUES_60_MIN) {
        if (tiempo <= 30) {
            return TARIFA_30_MIN;
        } else if (tiempo <= 60) {
            return TARIFA_60_MIN;
        } else {
            return TARIFA_DESPUES_60_MIN;
        }
    }
}