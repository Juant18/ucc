
public class Main {
    public static void main(String[] args) {
        Cliente ana = new Cliente("123", "Ana Pérez");
        System.out.println(ana.mostrarInfo());
        System.out.println();

        Camara camara1 = new Camara(3, "Webcam", 50.00, "Logitech", "C920");
        System.out.println(camara1.mostrarDetalles());
        System.out.println();

        Pedido pedidoDeAna = new Pedido(ana, "2025-04-28", 1234, 1);
        pedidoDeAna.agregarProducto(camara1, 0);
        pedidoDeAna.mostrarDetalles();
    }
}