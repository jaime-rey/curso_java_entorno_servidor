package ejercicios.paquete11;

import java.util.ArrayList;

public abstract class EjemploWrappers {
    public static void main(String[] args) {
        // Aquí se podrían poner ejemplos de uso de las clases wrapper

        ArrayList<Integer> lista = new ArrayList<>();

        int number = 10;
        Integer numero = 5;

        System.out.println(Integer.valueOf(number));
        System.out.println(numero.toString());

        lista.add(7);
        lista.add(8);
        lista.add(9);
        System.out.println("Lista de enteros: " + lista);
        int suma = 0;
        for (int i : lista) {
            suma += i;
        }
        System.out.println("Suma de los enteros: " + suma);
    }
}
