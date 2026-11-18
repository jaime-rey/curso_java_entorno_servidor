package ejercicios.ejerciciosPOO;

import utils.Teclado;

public class Pelicula {
    private String titulo;
    private int duracion;
    private Clasificacion clasificacion;

    public Pelicula(String titulo, int duracion, Clasificacion clasificacion) {
        this.titulo = titulo;
        if (duracion > 0) {
            this.duracion = duracion;
        } else {
            IO.println("Duración no válida para \"" + titulo + "\", se usará 90 minutos.");
            this.duracion = 90;
        }
        this.clasificacion = clasificacion;
    }

    // Convierte la edad mínima en su clasificación (0-11 -> todos, 12-15 -> +12, 16
    // o más -> +16)
    public Pelicula(String titulo, int duracion, int edadMinima) {
        this(titulo, duracion, Clasificacion.desdeEdad(edadMinima));
    }

    public Pelicula(String titulo, int duracion) {
        this(titulo, duracion, Clasificacion.TODOS_PUBLICOS);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    public boolean puedeVer(int edad) {
        return edad >= clasificacion.getEdadMinima();
    }

    public String getDuracionTexto() {

        return duracion < 60 ? duracion + " min" : (duracion / 60) + " h " + (duracion % 60) + " min";

    }

    public void mostrarFicha() {
        System.out.println("Título: " + titulo);
        System.out.println("Duración: " + getDuracionTexto());
        System.out.println("Clasificación: " + clasificacion.getTexto());
    }

    public static void main(String[] args) {

        IO.println("======= CARTELERA =======");

        int peliculasDisponibles = 0;
        Pelicula[] peliculas = new Pelicula[5];
        peliculas[0] = new Pelicula("COCO", 121);
        peliculas[1] = new Pelicula("DUNE", 155, +12);
        peliculas[2] = new Pelicula("Alien", 117, +16);
        peliculas[3] = new Pelicula("Corto sin datos", -5);
        peliculas[4] = new Pelicula("XXX", 100, +18);

        int edad = Teclado.pedirEntero("Introduce tu edad: ", 0);

        for (Pelicula pelicula : peliculas) {
            pelicula.mostrarFicha();
            System.out.println();
            if (pelicula.puedeVer(edad)) {
                System.out.println("Puedes ver: " + pelicula.getTitulo());
                peliculasDisponibles++;
            } else {
                System.out.println("No puedes ver: " + pelicula.getTitulo());
            }

            System.out.println();
        }
        System.out.println(
                "Películas disponibles para ver: " + peliculasDisponibles + " películas de " + peliculas.length);
    }
}
