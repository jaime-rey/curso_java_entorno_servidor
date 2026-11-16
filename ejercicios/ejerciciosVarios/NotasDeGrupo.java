package ejercicios.ejerciciosVarios;

public class NotasDeGrupo {
    public static void main() {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {

            int alumnos;

            IO.println("Ingrese la cantidad de estudiantes (mínimo 1): ");
            while (true) {
                alumnos = Integer.parseInt(sc.nextLine());
                if (alumnos >= 1) {
                    break;
                } else {
                    IO.println("La cantidad de estudiantes debe ser al menos 1. Intente nuevamente: ");
                }
            }

            double[] notas = new double[alumnos];
            for (int i = 0; i < alumnos; i++) {
                IO.println("Ingrese la nota del estudiante " + (i + 1) + ": ");

                while (true) {

                    double nota = Double.parseDouble(sc.nextLine().replace(',', '.'));
                    if (nota >= 0 && nota <= 10) {
                        notas[i] = nota;
                        break;
                    } else {
                        IO.println("La nota debe estar entre 0 y 10. Intente nuevamente: ");
                    }
                }
                IO.println("Nota del estudiante " + (i + 1) + " registrada: " + notas[i]);
            }

        }
    }

}
