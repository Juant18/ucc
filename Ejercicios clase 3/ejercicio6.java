public class ejercicio6 {
   

        public static void main(String[] args) {
        
            double[] alquileres = {500.0, 800.0, 600.0, 1000.0};
            double[] porcentajesGanancia = {0.10, 0.08, 0.12, 0.05};
            int n = alquileres.length; 
    
       
            double[] ganancias = calcularGanancias(alquileres, porcentajesGanancia, n);
    
            System.out.println("--- Ganancias por vivienda ---");
            for (int i = 0; i < n; i++) {
                System.out.printf("Vivienda %d: $%.2f%n", i + 1, ganancias[i]);
            }
        }
    
      
        public static double[] calcularGanancias(double[] alquileres, double[] porcentajesGanancia, int n) {
            double[] ganancias = new double[n];
            for (int i = 0; i < n; i++) {
                ganancias[i] = alquileres[i] * porcentajesGanancia[i];
            }
            return ganancias;
        }
    }

