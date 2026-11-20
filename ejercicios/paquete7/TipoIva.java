package ejercicios.paquete7;

public enum TipoIva {
    SUPERREDUCIDO(4),
    REDUCIDO(10),
    GENERAL(21);

    private final int porcentaje;

    TipoIva(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public static TipoIva desdePorcentaje(int porcentaje) {
        for (TipoIva t : values()) {
            if (t.porcentaje == porcentaje) {
                return t;
            }
        }
        return null;
    }
}
