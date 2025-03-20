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
        public static void main(String[] args) {
             int opcion =0;
        Scanner leer = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        boolean aceptar = true;

 while(aceptar){
    calculadora.Texto(" Bienvenido a la calculadora Calculadora");
    System.out.println("Ingrese un numero");
    calculadora.setNum1(0);
    System.out.println("Ingrese un segundo  numero");
    calculadora.setNum2(0);
 

     
           System.out.println("Seleccione 1 para suma");
           System.out.println("Seleccione 2 paa resta");
           System.out.println("Seleccione 3 para multiplicacion");
           System.out.println("Seleccione 4 para division");
           System.out.println("Seleccione 5 para potencia");
           System.out.println("Seleccione 6 para raiz cuadrada");
           System.out.println("Seleccione 7 para porcentaje");
           opcion = leer.nextInt();
                leer.nextLine();
                
 if("")

           leer.close();
        }    
    }


    }