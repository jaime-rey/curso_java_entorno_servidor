package ejercicios.paquete3;

// Abre la clase para comprobar dos requisitos simultáneos (archivo
// AprobarConRequisitos.java)
public class AprobarConRequisitos {

    static {
        System.out.println("Clase AprobarConRequisitos cargada.");
    }

    // Inicia el método principal
    public static void main(String[] args) {
        // Guardamos la nota numérica del alumno
        double nota = 6.5;
        // Guardamos su porcentaje de asistencia al curso
        int asistencia = 90;
        // Usamos && para exigir que se cumplan las dos condiciones a la vez
        // (usamos paréntesis por claridad)
        if ((nota >= 5) && (asistencia >= 80)) {
            // Se muestra porque ambas partes son true
            System.out.println("Módulo superado: cumple tanto la nota como la " +
                    "asistencia.");
            // Si falla la nota, o falla la asistencia, o fallan las dos cosas, entra
            // por aquí
        } else {
            // Mensaje en caso de incumplimiento
            System.out.println("Módulo no superado: debes revisar la nota o el " +
                    "mínimo de asistencia.");
            // Cierra el bloque if-else
        }
        // Cierra el método main
    }
    // Cierra la clase AprobarConRequisitos
}
