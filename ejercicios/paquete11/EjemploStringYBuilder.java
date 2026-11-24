package ejercicios.paquete11;

public abstract class EjemploStringYBuilder {
    public static void main(String[] args) {
        String texto = "Hola";
        StringBuilder builder = new StringBuilder(texto);
        builder.append(" Mundo").append("!");
        builder.insert(0, "Mensaje: ");
        System.out.println(builder);
        System.out.println(builder.toString());
    }
}
