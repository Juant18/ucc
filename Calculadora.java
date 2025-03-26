import java.util.Scanner;

public class Calculadora {

    private int num1;
    private int num2;
    private String operador;
    private int resultado;

    // Métodos set
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    // Métodos get
    public int getResultado() {
        return resultado;
    }

    public void Texto(String calculadora) {
        System.out.println("Bienvenido a la calculadora");
    }

    public void realizarOperacion(int operacion) {
        if (operacion == 1) {
            resultado = num1 + num2;
        } else {
            if (operacion == 2) {
                resultado = num1 - num2;
            } else {
                if (operacion == 3) {
                    resultado = num1 * num2;
                } else {
                    if (operacion == 4) {
                        resultado = num1 / num2;
                    } else {
                        if (operacion == 5) {
                            double raiz = Math.sqrt(num1);
                            double raiz2 = Math.sqrt(num2);
                            System.out.println("La raiz es " + raiz + " y la segunda es " + raiz2);

                        } else {

                            if (operacion == 6) {
                                resultado = num1 * num1;
                            } else {
                                if (operacion == 7) {
                                    double seno = Math.sin(Math.toRadians(num1));
                                    double seno2 = Math.sin(Math.toRadians(num2));
                                    System.out.println("La raiz es " + seno + " y la segunda es " + seno2);
                                } else {
                                    if (operacion == 8) {
                                        double coseno = Math.cos(Math.toRadians(num1));
                                        double coseno2 = Math.cos(Math.toRadians(num2));
                                        System.out.println("La raiz es " + coseno + " y la segunda es " + coseno2);
                                    } else {
                                        if (operacion == 9) {
                                            double tan = Math.tan(Math.toRadians(num1));
                                            double tan2 = Math.tan(Math.toRadians(num2));
                                            System.out.println("La raiz es " + tan + " y la segunda es " + tan2);
                                        }
                                    }

                                }
                            }
                            if (num2 != 0) {
                                resultado = num1 / num2;
                            } else {
                                System.out.println("Error: División por 0 no permitida.");
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int opcion = 0;
        Scanner leer = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        boolean aceptar = true;

        while (aceptar) {

            System.out.println("Seleccione 1 para suma");
            System.out.println("Seleccione 2 paa resta");
            System.out.println("Seleccione 3 para multiplicacion");
            System.out.println("Seleccione 4 para division");

            System.out.println("Seleccione 5 para raiz");
            System.out.println("Seleccione 6 para elevado");
            System.out.println("Seleccione 7 para seno");
            System.out.println("Seleccione 8 para coseno");
            System.out.println("Seleccione 9 para tangente");
            System.out.println("Seleccione 10 para Salir");

            opcion = leer.nextInt();
            leer.nextLine();

            if (opcion == 10) {
                aceptar = false;
                System.out.println("¡Hasta luego!");
                break;
            }
            System.out.println("Ingrese el primer número: ");
            int num1 = leer.nextInt();
            calculadora.setNum1(num1);

            System.out.println("Ingrese el segundo número: ");
            int num2 = leer.nextInt();
            calculadora.setNum2(num2);

            calculadora.realizarOperacion(opcion);
            System.out.println("Resultado: " + calculadora.getResultado());
        }

        leer.close();
    }

}
