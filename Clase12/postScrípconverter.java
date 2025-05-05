public class postScrípconverter extends converter {
    private  String ruta2;
    public postScrípconverter(String document,String ruta){
        super(document);
        this.ruta2 = ruta2;
       
    }
    
    
    public void makeLine(){
        System.out.println("make line PostScrip");
    }
    public void makeParagraf(){
        System.out.println("make paragraf PostScrip");
    
    }
    public void makeTable(){
        System.out.println("make table PostScrip");
    }
}
