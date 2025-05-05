public class Ejecutarconverter {
    public static void main(String[] args) {
        converter objASCII = new ASCIIConverter("libro","c: libros");
        converter objpostScript = new postScrípconverter("libro","c: libros");
        converter objPdf = new PDFConverter("libro","c: libros");


        Reader objlector1 = new Reader("line",objPdf);
        Reader objlector2 = new Reader("paragraf",objASCII);
        Reader objlector3 = new Reader("PDF",objpostScript);
        objlector1.parseinput();
        objlector2.parseinput();
        objlector3.parseinput();
    }
}
