package ejercicios.paquete13.ejerciciosTema13;

import java.util.ArrayList;

class Cliente {

    private String nombre;
    private String apellidos;
    private String direccion;

    public Cliente(String nombre, String apellidos, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

}

class Factura {
    private final Cliente cliente;

    private ArrayList<Linea> lineasFactura = new ArrayList<>();

    public Factura(Cliente cliente) {
        this.cliente = cliente;
    }

    class Linea {
        private String producto;
        private double precio;
        private int unidades;

        public String getProducto() {
            return producto;
        }

        public void setProducto(String producto) {
            this.producto = producto;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getUnidades() {
            return unidades;
        }

        public void setUnidades(int unidades) {
            this.unidades = unidades;
        }

        public Linea(String producto, double precio, int unidades) {

            this.producto = producto;
            this.precio = precio;
            if (unidades <= 0) {
                this.unidades = 1;
            } else {
                this.unidades = unidades;
            }

        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void agregarLinea(String producto, double precio, int unidades) {
        lineasFactura.add(new Linea(producto, precio, unidades));
    }

    public void mostrarFactura() {
        var total = 0.0;
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellidos());
        System.out.println("Dirección: " + cliente.getDireccion());
        System.out.println("Lineas de la factura:");
        for (Linea linea : lineasFactura) {
            double subtotal = linea.getPrecio() * linea.getUnidades();
            // %s = texto, %d = entero, %.2f = decimal con 2 cifras
            System.out.println(String.format("Producto: %s, Precio: %.2f €, Unidades: %d, Subtotal: %.2f €",
                    linea.getProducto(), linea.getPrecio(), linea.getUnidades(), subtotal));
            total += subtotal;
        }

        System.out.println(String.format("Total factura: %.2f €", total));
        if (total > 100) {
            System.out.println(String.format("Descuento aplicado (10 %%): %.2f €", total * 0.1));
            System.out.println(String.format("Total factura con descuento: %.2f €", total * 0.9));
        }
    }

}

public class Ejercicio1Factura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan", "Pérez", "Calle Falsa 123");

        Factura factura = new Factura(cliente);
        factura.agregarLinea("Producto 1", 10.0, 2);
        factura.agregarLinea("Producto 2", 5.0, 3);
        factura.mostrarFactura(); // 35 €: no llega a 100, sin descuento

        System.out.println();

        // Segunda factura, con otro cliente, que supera los 100 €
        Cliente cliente2 = new Cliente("Ana", "García", "Avenida Real 45");
        Factura factura2 = new Factura(cliente2);
        factura2.agregarLinea("Monitor", 89.99, 1);
        factura2.agregarLinea("Teclado", 24.50, 2);
        factura2.mostrarFactura(); // 138,99 €: se aplica el 10 %
    }

}
