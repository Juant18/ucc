public class PDFConverter extends converter {
    private  String rutaArchivo;
    public PDFConverter(String document,String rutaArchivo){
        super(document);
        this.rutaArchivo = rutaArchivo;
       
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


