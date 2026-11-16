package ejercicios.ejerciciosVarios;

public class ClaveTresIntentos {
    public static void main() {

        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {

            final String claveCorrecta = "Java123";
            int intentos = 0;

            while (intentos < 3) {

                System.out.print("Ingrese la clave: ");
                String clave = sc.nextLine();

                if (clave.equals(claveCorrecta)) {
                    System.out.printf("[OK] Acceso concedido en el intento %d%n", intentos + 1);
                    return;
                } else {
                    intentos++;
                    System.out.printf("Clave incorrecta. Intento %d de 3.%n", intentos);
                }
            }

            System.out.println("[KO] Cuenta bloqueada: has agotado los 3 intentos");

        }
    }
}
