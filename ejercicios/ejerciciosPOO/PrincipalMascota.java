package ejercicios.ejerciciosPOO;

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
    }
}
