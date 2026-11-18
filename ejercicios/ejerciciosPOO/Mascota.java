package ejercicios.ejerciciosPOO;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private boolean vacunada;

    public Mascota() {
    };

    public Mascota(String nombre, String especie, int edad, boolean vacunada) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.vacunada = vacunada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 40) {
            this.edad = edad;
        } else {
            System.out.println("Aviso: la edad debe estar entre 0 y 40");
        }
    }

    public void setVacunada(boolean vacunada) {
        this.vacunada = vacunada;
    }

    public boolean esCachorro() {
        return edad == 0 || edad == 1;
    }

    public void mostrarFicha() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + (edad == 1 ? " año" : " años"));
        System.out.println(vacunada ? "Vacunas: al día" : "Vacunas: PENDIENTES");
        System.out.println("Etapa: " + (esCachorro() ? "cachorro (revisión cada 3 meses)" : "adulto (revisión anual)"));
    }
}
