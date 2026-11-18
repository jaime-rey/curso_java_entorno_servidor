package ejercicios.ejerciciosPOO;

public class PrincipalReloj {
    public static void main(String[] args) {
        Reloj reloj = new Reloj();

        System.out.println("Hora inicial: " + reloj.getHora());

        reloj.ponerEnHora(25, 10, 0); // no válida
        System.out.println("Tras intentar 25:10:00: " + reloj.getHora());

        reloj.ponerEnHora(9, 5, 58);
        System.out.println("Hora: " + reloj.getHora());

        reloj.ponerEnHora(23, 59, 57);
        System.out.println("Hora: " + reloj.getHora());
        for (int i = 1; i <= 5; i++) {
            reloj.avanzarSegundo();
            System.out.println("+" + i + " s -> " + reloj.getHora());
        }
    }
}
