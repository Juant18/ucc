import java.util.ArrayList; 
import java.util.Arrays; 
public class ejercicio15 {

    public static void main(String[] args) {
        
        String[] nombres = {"Ana", "Carlos", "Sofía", "Pedro", "Luisa"};
        double[] sueldos = {2000, 2500, 2000, 1800, 2000};

       
        double promedio = calcularPromedio(sueldos);

        
        ArrayList<String> empleadosPromedio = new ArrayList<>();

        
        int cantidadPromedio = 0;
        for (int i = 0; i < nombres.length; i++) {
            if (sueldos[i] == promedio) {
                cantidadPromedio++;
                empleadosPromedio.add(nombres[i]);
            }
        }

       
        System.out.println("Sueldos: " + Arrays.toString(sueldos));
        System.out.println("Promedio de sueldos: " + promedio);
        System.out.println("Cantidad de empleados con sueldo promedio: " + cantidadPromedio);
        System.out.println("Empleados con sueldo promedio: " + empleadosPromedio);
    }

   
    public static double calcularPromedio(double[] numeros) {
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma / numeros.length;
    }
}