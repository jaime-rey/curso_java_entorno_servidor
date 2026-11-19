package ejercicios.paquete8;

public class Alumnos {

    private static int totalAlumnos;

    private String nombre;
    private int edad;

    public Alumnos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        totalAlumnos++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getTotalAlumnos() {
        return totalAlumnos;
    }

    public static void main(String[] args) {
        Alumnos a1 = new Alumnos("Juan", 20);
        Alumnos a2 = new Alumnos("Ana", 22);
        System.out.println("Total de alumnos: " + getTotalAlumnos());
        System.out.println(a1.toString());

        Object a2Obj = a2;
        System.out.println(a2Obj.toString());
    }
}
