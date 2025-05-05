public class Ejecutarconverter {
    public static void main(String[] args) {
        converter objASCII = new ASCIIConverter("libro","c: libros");
        converter objpostScript = new postScrípconverter("libro","c: libros");
        converter objPdf = new PDFConverter("libro","c: libros");


        Reader objlector = new Reader("line",objPdf);
        System.out.println(objlector.parseinput());
    }
}
