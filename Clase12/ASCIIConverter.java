public class ASCIIConverter extends converter{

private String ruta;

public ASCIIConverter(String document,String ruta){
    super(document);
    this.ruta=ruta;
   
}


public void makeLine(){
    System.out.println("make line ASCIIConverter");
}
public void makeParagraf(){
    System.out.println("make paragraf ASCIIConverte");

}
public void makeTable(){
    System.out.println("make table ASCIIConverte");
}
 
   
}