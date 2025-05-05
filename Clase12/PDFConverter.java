public class PDFConverter extends converter {
    private  String ruta3;
    public PDFConverter(String document,String ruta){
        super(document);
        this.ruta3 = ruta3;
       
    }
    
    
    public void makeLine(){
        System.out.println("make line PDF");
    }
    public void makeParagraf(){
        System.out.println("make paragraf PDF");
    
    }
    public void makeTable(){
        System.out.println("make table PDF");
    }
}


