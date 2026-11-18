package ejercicios.ejerciciosPOO;

import utils.Teclado;

public class PrincipalMascota {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota();
        System.out.println("--- Ficha sin rellenar (valores por defecto) ---");
        mascota1.mostrarFicha();

        mascota1.setNombre("Luna");
        mascota1.setEspecie("Perro");
        mascota1.setEdad(4);
        mascota1.setVacunada(true);
        System.out.println("\n--- Ficha de Luna ---");
        mascota1.mostrarFicha();

        Mascota mascota2 = new Mascota();
        mascota2.setNombre("Michi");
        mascota2.setEspecie("Gato");
        mascota2.setEdad(-2); // no válida: avisa y no cambia la edad
        mascota2.setEdad(1);
        System.out.println("\n--- Ficha de Michi ---");
        mascota2.mostrarFicha();

        IO.println("========================\n");
        IO.println("Introduce los datos de tu mascota");
        Mascota mascota3 = crearMascota();
        System.out.println("\n--- Ficha de la nueva mascota ---");
        mascota3.mostrarFicha();

    }

    private static Mascota crearMascota() {
        Mascota mascota = new Mascota();
        mascota.setNombre(Teclado.pedirTexto("Nombre: "));
        mascota.setEspecie(Teclado.pedirTexto("Especie: "));
        mascota.setEdad(Teclado.pedirEntero("Edad (0-40): ", 0, 40));
        mascota.setVacunada(Teclado.pedirSiNo("Vacunada (s/n): "));
        return mascota;
    }
}
