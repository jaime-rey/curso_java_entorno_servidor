package ejercicios.paquete3;

import java.util.logging.Logger;

public class Condicionales {
    private static final Logger LOGGER = Logger.getLogger(Condicionales.class.getName());

    public static void main(String[] args) {
        int nota = 6;
        String resultado; // Puedes cambiar el valor de la nota para probar diferentes casos
        if (nota < 5) {
            resultado = "Suspenso";
        } else if (nota < 7) {
            resultado = "Aprobado";
        } else {
            resultado = "Sobresaliente";
        }
        LOGGER.info(resultado);
        escribe(new String[] { resultado });
    }

    public static void escribe(String[] args) {
        LOGGER.info(args[0]);
    }

}
