package ejercicios.paquete8;

public class ProductoTienda {

    private final String nombre;
    private double precio;
    private static int totalProductos;

    public static final double IVA = 0.21;

    public ProductoTienda(String nombre, double precio) {
        this.nombre = nombre;

        if (precio < 0) {
            this.precio = 0;
        } else {
            this.precio = precio;
        }

        totalProductos++;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            this.precio = 0;
        } else {
            this.precio = precio;
        }
    }

    public static int getTotalProductos() {
        return totalProductos;
    }

    public double getPrecioConIVA() {
        return precio * (1 + IVA);
    }

    @Override
    public String toString() {
        return "ProductoTienda [nombre=" + nombre + ", precio=" + precio + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        long temp;
        temp = Double.doubleToLongBits(precio);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProductoTienda other = (ProductoTienda) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
            return false;
        return true;
    }

    // ---------- Builder ----------

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String nombre;
        private double precio;

        private Builder() {
        }

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder precio(double precio) {
            this.precio = precio;
            return this;
        }

        public ProductoTienda build() {
            if (nombre == null || nombre.isBlank()) {
                throw new IllegalStateException("El nombre es obligatorio");
            }
            return new ProductoTienda(nombre, precio);
        }
    }

    public static void main(String[] args) {
        
        ProductoTienda producto = ProductoTienda.builder()
                .nombre("Laptop")
                .precio(1000)
                .build();
        System.out.println(producto);
        System.out.println("Precio con IVA: " + producto.getPrecioConIVA());
    }

}
