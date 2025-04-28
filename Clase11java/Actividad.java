
class Cliente {
    String cedula;
    String nombre;

    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String mostrarInfo() {
        return "Cliente: " + nombre + " (Cédula: " + cedula + ")";
    }
}

class Producto {
    int numero;
    String nombre;
    double precio;

    public Producto(int numero, String nombre, double precio) {
        this.numero = numero;
        this.nombre = nombre;
        this.precio = precio;
    }

    public double obtenerPrecio() {
        return precio;
    }

    public String mostrarInfo() {
        return "Producto #" + numero + ": " + nombre + " ($" + precio + ")";
    }
}

class Camara extends Producto {
    String marca;
    String modelo;

    public Camara(int numero, String nombre, double precio, String marca, String modelo) {
        super(numero, nombre, precio);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String mostrarDetalles() {
        return super.mostrarInfo() + ", Marca: " + marca + ", Modelo: " + modelo;
    }
}

class Pedido {
    Cliente cliente;
    Producto[] productos;
    String fecha;
    int numeroTarjeta;

    public Pedido(Cliente cliente, String fecha, int numeroTarjeta, int cantidadProductos) {
        this.cliente = cliente;
        this.productos = new Producto[cantidadProductos];
        this.fecha = fecha;
        this.numeroTarjeta = numeroTarjeta;
    }

    public void agregarProducto(Producto producto, int lugar) {
        if (lugar < productos.length) {
            this.productos[lugar] = producto;
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            if (producto != null) {
                total += producto.obtenerPrecio();
            }
        }
        return total;
    }

    public void mostrarDetalles() {
        System.out.println("--- Detalles del Pedido ---");
        System.out.println("Cliente: " + cliente.nombre);
        System.out.println("Fecha: " + fecha);
        System.out.println("Tarjeta: ****-" + String.valueOf(numeroTarjeta).substring(String.valueOf(numeroTarjeta).length() - 4));
        System.out.println("Productos:");
        for (Producto producto : productos) {
            if (producto != null) {
                System.out.println("- " + producto.nombre + " ($" + producto.precio + ")");
            }
        }
        System.out.println("Total: " + calcularTotal());
        System.out.println("---------------------------");
    }
}
