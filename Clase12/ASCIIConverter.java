public class ASCIIConverter extends converter{

private String rutaArchivo;

public ASCIIConverter(String document,String rutaArchivo){
    super(document);
    this.rutaArchivo = rutaArchivo;
   
}


public void makeLine(){
    System.out.println("make line ASCII");
}
public void makeParagraf(){
    System.out.println("make paragraf ASCII");

}
public void makeTable(){
    System.out.println("make table ASCII");
}
 
   
}