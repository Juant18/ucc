public class Arreglos{
    public static void main(String[] args) {
        //Como declarar arreglos primera forma
        //int[] a = { 8, 3, 10, 22, 1, 0};
//segunda forma
//int[] a = new int[6] 
//El numero hace referencia al tamaño, se tiene que llenar el arreglo

 

int[] a = { 8, 3, 10, 22, 1, 9};
  for(int i = 0; i < a.length; i++ ){
   System.out.println("a["+ i +"]=" +a[i]);


  }
System.out.println("-------------------------------");
 int tamaño=10;
  int[] b = new int[tamaño];
  //estructura para llenar el arreglo, con numeros aleatorios 
  //entre 10 y 30
for(int i = 0; i< b.length;i++){
b[i]= (int)  (Math.random()  *( 30 + 10)) - 10;



//mostrar los elementos del arreglo
System.out.println("b["+ i +"]=" +b[i]);
}
}
}