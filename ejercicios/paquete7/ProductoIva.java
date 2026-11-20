package ejercicios.paquete7;

public class ProductoIva {
    private final String nombre;
    private double precioBase;
    private TipoIva iva;

    public ProductoIva(String nombre, double precioBase, int porcentajeIva) {
        this.nombre = nombre;
        if (precioBase >= 0) {
            this.precioBase = precioBase;
        }
        TipoIva tipo = TipoIva.desdePorcentaje(porcentajeIva);
        if (tipo == null) {
            System.out.println("Aviso: IVA " + porcentajeIva + "% no válido para " + nombre
                    + ". Se aplica el 21%.");
            this.iva = TipoIva.GENERAL;
        } else {
            this.iva = tipo;
        }
    }

    public ProductoIva(String nombre, double precioBase) {
        this(nombre, precioBase, TipoIva.GENERAL.getPorcentaje());
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public TipoIva getIva() {
        return iva;
    }

    public double getImporteIva() {
        return precioBase * iva.getPorcentaje() / 100.0;
    }

    public double getPrecioFinal() {
        return precioBase + getImporteIva();
    }

    public void mostrarLinea() {
        System.out.printf("%-15s base: %7.2f €  IVA %2d%%: %6.2f €  total: %7.2f €%n",
                nombre, precioBase, iva.getPorcentaje(), getImporteIva(), getPrecioFinal());
    }
}
