package ejercicios.ejerciciosPOO;

import java.util.Scanner;

public class PrincipalTorneo {
    public static void main(String[] args) {
        String[] nombres = { "Ana", "Bruno", "Carla", "David" };
        final int RONDAS = 2;

        Jugador[] jugadores = new Jugador[nombres.length];
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Jugador(); // new Jugador[4] solo crea casillas vacías (null)
            jugadores[i].setNombre(nombres[i]);
        }

        try (Scanner sc = new Scanner(System.in)) {
            for (int ronda = 1; ronda <= RONDAS; ronda++) {
                System.out.println("--- Ronda " + ronda + " ---");
                for (Jugador jugador : jugadores) {
                    int puntos = leerEntero(sc, "Puntos de " + jugador.getNombre() + ": ");
                    jugador.sumarPuntos(puntos);
                }
            }
        }

        System.out.println("\n--- Clasificación ---");
        // Se ordena una copia del array de mayor a menor puntuación
        Jugador[] clasificacion = jugadores.clone();
        for (int i = 0; i < clasificacion.length - 1; i++) {
            for (int j = 0; j < clasificacion.length - 1 - i; j++) {
                if (clasificacion[j].getPuntos() < clasificacion[j + 1].getPuntos()) {
                    Jugador aux = clasificacion[j];
                    clasificacion[j] = clasificacion[j + 1];
                    clasificacion[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < clasificacion.length; i++) {
            System.out.println((i + 1) + ". " + clasificacion[i].getNombre()
                    + " - " + clasificacion[i].getPuntos() + " puntos");
        }

        // Algoritmo del récord
        int maximo = jugadores[0].getPuntos();
        for (Jugador jugador : jugadores) {
            maximo = Math.max(maximo, jugador.getPuntos());
        }
        System.out.print("\nGanador: ");
        boolean primero = true;
        for (Jugador jugador : jugadores) {
            if (jugador.getPuntos() == maximo) {
                System.out.print((primero ? "" : " y ") + jugador.getNombre());
                primero = false;
            }
        }
        System.out.println(" con " + maximo + " puntos");
    }

    private static int leerEntero(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("No es un número entero, inténtalo de nuevo");
            }
        }
    }
}
