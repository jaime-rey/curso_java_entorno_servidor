package ejercicios.ejerciciosPOO;

public class Reloj {
    private int horas;
    private int minutos;
    private int segundos;

    public void ponerEnHora(int horas, int minutos, int segundos) {
        if (horas >= 0 && horas <= 23
                && minutos >= 0 && minutos <= 59
                && segundos >= 0 && segundos <= 59) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            System.out.printf("Aviso: hora no válida (%02d:%02d:%02d)%n", horas, minutos, segundos);
        }
    }

    public void avanzarSegundo() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }
    }

    // Formato hh:mm:ss con dos cifras en cada parte
    public String getHora() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}
