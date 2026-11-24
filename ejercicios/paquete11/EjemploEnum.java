package ejercicios.paquete11;

public abstract class EjemploEnum {
    public static void main(String[] args) {
        // En vez de una variable suelta, creamos un objeto Pedido.
        // Al crearlo, su estadoPedido empieza en PENDIENTE
        Pedido pedido = new Pedido(1);
        System.out.println("Pedido recién creado: " + pedido.getEstadoPedido().ordinal());
        System.out.println("Pedido recién creado: " + pedido);
        // Cambiamos su estado usando uno de los valores permitidos del enum:
        // solo podemos elegir una de las 4 palabras definidas en EstadoPedido
        pedido.setEstadoPedido(EstadoPedido.PREPARANDO);

        System.out.println("Pedido en preparación: " + pedido.getEstadoPedido().ordinal());
        // Imprime directamente por consola la palabra: PREPARANDO
        System.out.println("Estado actual del envío: " + pedido.getEstadoPedido());
        // Los enum encajan a la perfección con la estructura switch que
        // aprendimos en el Día 3:
        // Examinamos qué valor del enum tiene el atributo estadoPedido del pedido
        switch (pedido.getEstadoPedido()) {
            // En caso de que valga PENDIENTE:
            case PENDIENTE:
                // Mensaje informativo
                System.out.println("Todavía no se ha empezado a empaquetar en " +
                        "el almacén.");
                // Sale del switch
                break;
            // En caso de que valga PREPARANDO:
            case PREPARANDO:
                // Se ejecuta esta línea
                System.out.println("El pedido se está preparando y empaquetando " +
                        "ahora mismo.");
                // Sale del switch
                break;
            // En caso de que valga ENVIADO:
            case ENVIADO:
                // Mensaje informativo
                System.out.println("El pedido ya salió de la tienda y está en " +
                        "reparto.");
                // Sale del switch
                break;
            // En caso de que valga ENTREGADO:
            case ENTREGADO:
                // Mensaje informativo
                System.out.println("El pedido ya llegó a manos del cliente.");
                // Sale del switch
                break;
            // Cierra el bloque switch
        }
        // Cierra el método main
    }
    // Cierra la clase EjemploEnum

}
