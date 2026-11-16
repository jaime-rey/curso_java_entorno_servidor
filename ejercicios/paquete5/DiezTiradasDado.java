package ejercicios.paquete5;

public class DiezTiradasDado {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int tirada = (int) (Math.random() * 6) + 1;
            System.out.println("Tirada " + i + ": " + tirada);
        }
    }
}
