public  class Equipaje {
   
    private static  double PESO = 10.0;
    private static  double TAMAÑO = 4.5;
    private static  double PRECIO_BASE = 1000.0;
    
    public double peso;
    public double tamaño;
    public double precioBase;

    public Equipaje(double peso, double tamaño) {
        this.peso = peso;
        this.tamaño = tamaño;
        this.precioBase = PRECIO_BASE;
    }

    public Equipaje(double precioBase) {
        this.peso = PESO;
        this.tamaño = TAMAÑO;
        this.precioBase = precioBase;
    }

   
    public Equipaje() {
        this.peso = PESO;
        this.tamaño = TAMAÑO;
        this.precioBase = PRECIO_BASE;
    }

   
    public  double calcularPrecio();
}


class Bodega extends Equipaje {
    private static  double CAPACIDAD = 8.0;

    public Bodega(double peso, double tamaño) {
        super(peso, tamaño);
    }

    public Bodega(double precioBase) {
        super(precioBase);
    }

    public Bodega() {
        super();
    }

 
    public double calcularPrecio() {
        return precioBase + (peso * tamaño * CAPACIDAD);
    }
}


class Cabina extends Equipaje {
    private static  double TIEMPO = 2.0;

    public Cabina(double peso, double tamaño) {
        super(peso, tamaño);
    }

    public Cabina(double precioBase) {
        super(precioBase);
    }

    public Cabina() {
        super();
    }

 
    public double calcularPrecio() {
        return precioBase + (peso * tamaño * TIEMPO);
    }
}


class PrecioTotal {
    private double totalPrecios = 0.0;
    private double totalBodega = 0.0;
    private double totalCabina = 0.0;
    private Equipaje[] equipajes;

    public PrecioTotal(Equipaje[] equipajes) {
        this.equipajes = equipajes;
    }

    public void calcularTotales() {
        for (Equipaje equipaje : equipajes) {
            double precio = equipaje.calcularPrecio();
            totalPrecios += precio;

            if (equipaje instanceof Bodega) {
                totalBodega += precio;
            } else if (equipaje instanceof Cabina) {
                totalCabina += precio;
            }
        }
    }

    public void mostrarTotales() {
        
        calcularTotales();
        System.out.println("Total Equipaje: " + totalPrecios);
        System.out.println("Total Bodega: " + totalBodega);
        System.out.println("Total Cabina: " + totalCabina);
    }
}