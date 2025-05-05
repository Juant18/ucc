public class Reader {
    private String element;
    private converter converter;

    public Reader(String element, converter converter){
        this.element=element;
        this.converter=converter;
    }

    public String getElement() {
        return element;
    }
public void parseinput(){
    switch (element) {
        case "line": 
     converter.makeLine();
            break;
            case "paragraf": 
            converter.makeParagraf();
                   break;
                   case "PDF": 
                   converter.makeTable();
                          break;
                          default:
                          System.out.println("Opcion no valida");
              

          
    }
}

}
