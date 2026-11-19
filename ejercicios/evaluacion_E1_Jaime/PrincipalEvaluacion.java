package ejercicios.evaluacion_E1_Jaime;

public class PrincipalEvaluacion {
    public static void main(String[] args) {
        ProductoServidor p1 = new ProductoServidor("Servidor Torre Pro", 1200.0, 5);
        ProductoServidor p2 = new ProductoServidor("Router WiFi 6", 60.0);

        p1.mostrarFicha();
        p2.mostrarFicha();

        p1.vender(2);
        p2.vender(25);

        p1.mostrarFicha();
        p2.mostrarFicha();

        p1.reponerStock(4);

        p1.mostrarFicha();
        p2.mostrarFicha();

    }
}
