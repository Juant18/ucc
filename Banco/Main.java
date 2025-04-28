package Banco;

public class Main {

    public static void main(String[] args) {
        // creación de objetos

        Cuenta objCuenta = new Cuenta(10000, 29999);

        Cliente objCliente = new Cliente(1107849050, "Triviño");
        System.out.println(objCuenta);
        System.out.println(objCliente);
    }
}