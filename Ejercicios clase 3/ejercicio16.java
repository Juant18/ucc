public class ejercicio16 {

    public static void main(String[] args) {
   
        String[] nombres = {"Ana", "Carlos", "Sofía", "Pedro", "Luisa"};
        int[] edades = {35, 42, 28, 50, 31};
        char[] sexos = {'F', 'M', 'F', 'M', 'F'};
       
        double edadPromedio = calcularPromedio(edades);

     
        String nombreMasJoven = nombres[0];
        String nombreMasViejo = nombres[0];
        int edadMasJoven = edades[0];
        int edadMasViejo = edades[0];

        for (int i = 1; i < nombres.length; i++) {
            if (edades[i] < edadMasJoven) {
                nombreMasJoven = nombres[i];
                edadMasJoven = edades[i];
            }
            if (edades[i] > edadMasViejo) {
                nombreMasViejo = nombres[i];
                edadMasViejo = edades[i];
            }
        }

        int profesoresMenorPromedio = 0;
        int profesorasMayorPromedio = 0;

        for (int i = 0; i < nombres.length; i++) {
            if (edades[i] < edadPromedio) {
                profesoresMenorPromedio++;
            }
            if (sexos[i] == 'F' && edades[i] > edadPromedio) {
                profesorasMayorPromedio++;
            }
        }

        System.out.println("Edad promedio del grupo: " + edadPromedio);
        System.out.println("Profesor más joven: " + nombreMasJoven);
        System.out.println("Profesor con mayor edad: " + nombreMasViejo);
        System.out.println("Número de profesoras con edad mayor al promedio: " + profesorasMayorPromedio);
        System.out.println("Número de profesores con edad menor al promedio: " + profesoresMenorPromedio);
    }

  
    public static double calcularPromedio(int[] numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return (double) suma / numeros.length;
    }
}