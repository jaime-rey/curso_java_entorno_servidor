package ejercicios.ejerciciosPOO;

public class Estudiante {
    private String nombre;
    private double[] notas = new double[3];

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Trimestre del 1 al 3, nota del 0 al 10. Devuelve true si se guarda
    public boolean setNota(int trimestre, double nota) {
        if (trimestre < 1 || trimestre > 3) {
            System.out.println("Aviso: el trimestre debe ser 1, 2 o 3");
            return false;
        }
        if (nota < 0 || nota > 10) {
            System.out.println("Aviso: la nota debe estar entre 0 y 10");
            return false;
        }
        notas[trimestre - 1] = nota;
        return true;
    }

    public double getMedia() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return Math.round(suma / notas.length * 100) / 100.0;
    }

    public String getCalificacion() {
        double media = getMedia();
        if (media < 5) {
            return "Suspenso";
        } else if (media < 7) {
            return "Aprobado";
        } else if (media < 9) {
            return "Notable";
        } else {
            return "Sobresaliente";
        }
    }

    public void mostrarBoletin() {
        System.out.println("Boletín de " + nombre);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Trimestre " + (i + 1) + ": " + notas[i]);
        }
        System.out.println("Media: " + getMedia());
        System.out.println("Calificación: " + getCalificacion());
    }
}
