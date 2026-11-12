package ejercicios.paquete3;

import java.util.Scanner;

// Actividad 2: calculadora con menú usando switch
public class CalculadoraSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // En cada lectura: mientras lo escrito no sea un número, lo descartamos y volvemos a pedirlo
        // Aceptamos 12,5 y 12.5: cambiamos la coma por punto, que es lo que entiende Double.parseDouble
        System.out.print("Introduce el primer número: ");
        double num1;
        while (true) {
            String texto = sc.next().replace(',', '.');
            try {
                num1 = Double.parseDouble(texto);
                break; // Es un número: salimos del bucle
            } catch (NumberFormatException e) {
                System.out.print("Eso no es un número. Inténtalo de nuevo: ");
            }
        }

        System.out.print("Introduce el segundo número: ");
        double num2;
        while (true) {
            String texto = sc.next().replace(',', '.');
            try {
                num2 = Double.parseDouble(texto);
                break; // Es un número: salimos del bucle
            } catch (NumberFormatException e) {
                System.out.print("Eso no es un número. Inténtalo de nuevo: ");
            }
        }

        System.out.println("Elige una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Opción: ");
        while (!sc.hasNextInt()) {
            System.out.print("Eso no es un número entero. Elige 1, 2, 3 o 4: ");
            sc.next();
        }
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                // Evitamos dividir entre cero
                if (num2 == 0) {
                    System.out.println("Aviso: no se puede dividir entre 0.");
                } else {
                    System.out.println("Resultado: " + num1 + " / " + num2 + " = " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }

        sc.close();
    }
}
