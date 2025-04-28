package Banco;
public class Cuenta{
private int numerocuenta;
private double saldo;

public Cuenta(int numerocuenta, double saldo){
    this.numerocuenta=numerocuenta;
    this.saldo=saldo;
}
public String toString(){
    return "Cuenta {numerocuenta:" + numerocuenta + ", Saldo:" + saldo + "}";
}



}

