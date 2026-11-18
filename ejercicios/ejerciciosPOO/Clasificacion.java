package ejercicios.ejerciciosPOO;

public enum Clasificacion {
    TODOS_PUBLICOS("Todos los públicos", 0),
    MAS_12("+12", 12),
    MAS_16("+16", 16),
    MAS_18("+18", 18);

    private final String texto;
    private final int edadMinima;

    Clasificacion(String texto, int edadMinima) {
        this.texto = texto;
        this.edadMinima = edadMinima;
    }

    // Convierte una edad mínima en la clasificación que le corresponde
    public static Clasificacion desdeEdad(int edad) {
        if (edad >= MAS_18.edadMinima) {
            return MAS_18;
        } else if (edad >= MAS_16.edadMinima) {
            return MAS_16;
        } else if (edad >= MAS_12.edadMinima) {
            return MAS_12;
        } else {
            return TODOS_PUBLICOS;
        }
    }

    public String getTexto() {
        return texto;
    }

    public int getEdadMinima() {
        return edadMinima;
    }
}
