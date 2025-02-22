public class ejercicio5 {  public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);

    System.out.print("Introduce el precio del primer articulo: ");
    int precio1 = leer.nextInt();

    System.out.print("Dime la cantidad del primer articulo: ");
    int cantidad1 = leer.nextInt();

    System.out.print("dame la descripcion del primer articulo: ");
    leer.nextLine(); 
    String descripcion1 = leer.nextLine();

    System.out.print("Introduce el precio del segundo articulo ");
    int precio2 = leer.nextInt();

    System.out.print("Dime la cantidad del segundo articulo: ");
    int cantidad2 = leer.nextInt();

    System.out.print("dame la descripcion del segundo articulo: ");
    leer.nextLine(); 
    String descripcion2 = leer.nextLine();

    System.out.print("Introduce el precio del tercer articulo: ");
    int precio3 = leer.nextInt();

    System.out.print("Dime la cantidad del tercer articulo: ");
    int cantidad3 = leer.nextInt();

    System.out.print("dame la descripcion del tercer articulo: ");
    leer.nextLine(); 
    String descripcion3 = leer.nextLine();

    int resultado = cantidad1 * precio1;
    int resultado2 = cantidad2 * precio2;
    int resultado3 = cantidad3 * precio3;

    int total = resultado + resultado2 + resultado3;

    System.out.println("El total de las compras es: " + total);

    if (resultado > resultado2 && resultado > resultado3) {
        System.out.println("El producto con mayor compra fue la que tiene esta descripcion " + descripcion1 + " y el total es de " + resultado);
    } else if (resultado2 > resultado && resultado2 > resultado3) {
        System.out.println("El producto con mayor compra fue la que tiene esta descripcion " + descripcion2 + " y el total es de " + resultado2);
    } else {
        System.out.println("El producto con mayor compra fue la que tiene esta descripcion " + descripcion3 + " y el total es de " + resultado3);
    }

    leer.close();
}
}
