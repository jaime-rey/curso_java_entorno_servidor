package ejercicios.ejerciciosAbstractoPoli;

public class Ejercicio5Alquiler {
    public static void main(String[] args) {
        VehiculoAlquiler[] flota = {
                new CocheAlquiler("1234-ABC", 60.0),
                new MotoAlquiler("5678-DEF", 30.0)
        };
        for (VehiculoAlquiler v : flota) {
            v.mostrar();
        }
    }
}
