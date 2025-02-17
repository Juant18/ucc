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
    }
}