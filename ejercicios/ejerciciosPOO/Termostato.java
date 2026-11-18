package ejercicios.ejerciciosPOO;

public class Termostato {
    private static final double MINIMA = 15;
    private static final double MAXIMA = 28;

    private double temperatura = 20.0;

    public void subir(double grados) {
        if (grados <= 0) {
            System.out.println("Aviso: los grados deben ser positivos");
            return;
        }
        temperatura += grados;
        if (temperatura > MAXIMA) {
            temperatura = MAXIMA;
            System.out.println("Aviso: se ha alcanzado la temperatura máxima (" + MAXIMA + ")");
        }
    }

    public void bajar(double grados) {
        if (grados <= 0) {
            System.out.println("Aviso: los grados deben ser positivos");
            return;
        }
        temperatura -= grados;
        if (temperatura < MINIMA) {
            temperatura = MINIMA;
            System.out.println("Aviso: se ha alcanzado la temperatura mínima (" + MINIMA + ")");
        }
    }

    public double getTemperatura() {
        return temperatura;
    }

    public String getModo() {
        if (temperatura < 19) {
            return "Calefacción";
        } else if (temperatura <= 23) {
            return "Confort";
        } else {
            return "Refrigeración";
        }
    }
}
