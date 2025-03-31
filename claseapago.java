public  class Pago{
    private double monto;
    private String fecha;

    public Pago(double monto, String fecha){
        this.monto = monto;
        this.fecha = fecha;
    }
    public double pagar(){
        return 0.0;
    }
    public String toString(){
        return "Pago { monto: " + monto  + "fecha:" + fecha + "}";
    }
}

public class Efectivo extends Pago{
    private String descripcion;

    public Efectivo(double monto, String fecha, String descripcion){
        super(monto, fecha);
        this.descripcion = descripcion;
        }
    
    public double Pagar () {
        return monto * 1.20;
    }
    public String toString() {
        return "Efectivo{ monto: " + monto + " fecha: " + fecha + "descripcion + "}";
    }


    private in numero;
    public TarjetaCredito (double monto, String fecha, int numero){
        super(monto,fecha);
        this.numero = numero;
    }
    public double pagar(){
        return monto * 1.30;
    }

    public String toString(){
        return "TarjetaCredito monto: " + monto + "fecha: "+ fecha + "numero: " + numero +"}";
    }
}

public class EjecutarHerencia{
public static void main(String[] args) {
    Pago ObjPago1 = new Ejectivo (1200.0, "lunes", "Pago  en efectivo camiseta");
    Pago ObjPago2 = new TarjetaCredito(610.0, "Marzo2025", 5708 6000 94);

    System.out.println(objPago1.pagar());
    System.out.println(objPago2.pagar()); //.pagar() polimorfismo
}