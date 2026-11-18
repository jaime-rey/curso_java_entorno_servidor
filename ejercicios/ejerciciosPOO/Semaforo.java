package ejercicios.ejerciciosPOO;

public class Semaforo {
    // 0 = rojo, 1 = verde, 2 = ámbar
    private int estado;

    public void cambiar() {
        estado = (estado + 1) % 3;
    }

    public String getColor() {
        switch (estado) {
            case 0:
                return "Rojo";
            case 1:
                return "Verde";
            case 2:
                return "Ámbar";
            default:
                return "Desconocido";
        }
    }

    public boolean puedePasar() {
        return estado == 1;
    }
}
