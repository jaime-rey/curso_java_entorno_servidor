package ejercicios.ejerciciosPOO;

public class PrincipalSemaforo {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        int vecesVerde = 0;

        for (int ciclo = 1; ciclo <= 7; ciclo++) {
            System.out.print("Ciclo " + ciclo + ": " + semaforo.getColor() + " -> ");
            if (semaforo.puedePasar()) {
                System.out.println("Puedes pasar");
                vecesVerde++;
            } else {
                System.out.println("No pases");
            }
            semaforo.cambiar();
        }

        System.out.println("El semáforo ha estado en verde " + vecesVerde + " veces");
    }
}
