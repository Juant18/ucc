package Banco;

public class Cliente {
    private int cedula;
    private String Nombre;

    public Cliente(int cedula, String nombre) {
        this.cedula = cedula;
        this.Nombre = nombre;
    }

    public String toString() {
        return "Cliente {Cedula:" + cedula + ", nombre:" + Nombre + "}";
    }

}
