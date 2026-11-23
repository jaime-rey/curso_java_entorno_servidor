package ejercicios.ejerciciosAbstractoPoli;

public class Linterna implements Recargable {
    private int nivelBateria;

    public Linterna() {
        this.nivelBateria = 0;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    @Override
    public void cargar() {
        nivelBateria = Math.min(100, nivelBateria + 20);
        System.out.println("Linterna cargada. Batería: " + nivelBateria + "%");
    }

    @Override
    public void usar() {
        if (nivelBateria <= 0) {
            System.out.println("Sin batería. No se puede usar la linterna.");
            return;
        }
        nivelBateria -= 10;
        System.out.println("Linterna encendida. Batería restante: " + nivelBateria + "%");
    }
}
