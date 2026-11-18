package ejercicios.ejerciciosPOO;

public class Libro {
    private String titulo;
    private boolean prestado; // empieza en false
    private int vecesPrestado;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getVecesPrestado() {
        return vecesPrestado;
    }

    public boolean prestar() {
        if (prestado) {
            return false;
        }
        prestado = true;
        vecesPrestado++;
        return true;
    }

    public boolean devolver() {
        if (!prestado) {
            return false;
        }
        prestado = false;
        return true;
    }

    public String getEstado() {
        return prestado ? "Prestado" : "Disponible";
    }
}
