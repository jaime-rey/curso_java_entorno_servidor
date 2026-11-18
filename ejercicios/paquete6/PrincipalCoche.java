package ejercicios.paquete6;

public class PrincipalCoche {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Seat", "Ibiza", 12000);
        Coche coche2 = new Coche("Toyota", "Corolla", 50000);

        coche1.recorrerKilometros(150);
        coche1.recorrerKilometros(320);
        coche1.recorrerKilometros(-50); // inválida: no se suma

        coche2.recorrerKilometros(80);
        coche2.recorrerKilometros(0);   // inválida: no se suma
        coche2.recorrerKilometros(500);

        System.out.println("--- Estado final ---");
        coche1.mostrarDatos();
        System.out.println();
        coche2.mostrarDatos();
    }
}
