package ejercicios.ejerciciosPOO;

public class Jugador {
    private String nombre;
    private int puntos; // empieza en 0

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void sumarPuntos(int puntos) {
        if (puntos >= 0) {
            this.puntos += puntos;
        } else {
            System.out.println("Aviso: no se pueden sumar puntos negativos (" + puntos + ")");
        }
    }
}
