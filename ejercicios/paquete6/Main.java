package ejercicios.paquete6;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Pepe Mora", 23, 5.2d);
        alumno1.mostrarDatos();
        System.out.println(alumno1.toString());

        Cuenta cuenta1 = new Cuenta();

        cuenta1.setSaldo(45d);

        System.out.println(cuenta1.getSaldo());

        Producto producto1 = new Producto("Laptop", 1200.0, 10);
        System.out.println(producto1.toString());
        Producto producto2 = producto1;
        System.out.println(producto2.toString());
        Producto producto3 = new Producto("Laptop", 1200.0, 10);
        System.out.println(producto3.toString());

        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 863);
        System.out.println(libro1.toString());
        Libro libro2 = new Libro(null, null, 0);
        System.out.println(libro2.toString());
        libro2.setTitulo("Cien Años de Soledad");
        libro2.setAutor("Gabriel García Márquez");
        libro2.setPaginas(417);
        System.out.println(libro2.toString());
        Libro libro3 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863);
        System.out.println(libro3.toString());
    }
}
