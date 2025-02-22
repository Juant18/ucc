public class ejercicio6 {
   

        public static void main(String[] args) {
            // Datos de ejemplo (puedes reemplazarlos con los tuyos)
            double[] alquileres = {500.0, 800.0, 600.0, 1000.0};
            double[] porcentajesGanancia = {0.10, 0.08, 0.12, 0.05};
            int n = alquileres.length; // Número de viviendas
    
            // Crear el arreglo de ganancias
            double[] ganancias = calcularGanancias(alquileres, porcentajesGanancia, n);
    
            // Mostrar los resultados
            System.out.println("--- Ganancias por vivienda ---");
            for (int i = 0; i < n; i++) {
                System.out.printf("Vivienda %d: $%.2f%n", i + 1, ganancias[i]);
            }
        }
    
        // Función para calcular las ganancias por vivienda
        public static double[] calcularGanancias(double[] alquileres, double[] porcentajesGanancia, int n) {
            double[] ganancias = new double[n];
            for (int i = 0; i < n; i++) {
                ganancias[i] = alquileres[i] * porcentajesGanancia[i];
            }
            return ganancias;
        }
    }

