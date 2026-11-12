package ejercicios.paquete3;

public class Condicionales {
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
        IO.println(resultado);
    }
}
