public class Main {
    public static void main(String[] args) {
        Equipaje[] equipajes = new Equipaje[5];
        equipajes[0] = new Bodega(100.0, 10.0);
        equipajes[1] = new Bodega(200);
        equipajes[2] = new Cabina(150, 20.0);
        equipajes[3] = new Cabina();
        equipajes[4] = new Bodega();

        PrecioTotal solucion = new PrecioTotal(equipajes);
        solucion.mostrarTotales();
    }
}
