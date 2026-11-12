void main() {
    IO.println("Hola mundo");

    int puntos = 10;

    IO.println("Los puntos son " + puntos);

    puntos += 5;

    IO.println("Ahora los puntos son " + puntos);

    IO.println(suma(4, puntos));

    Integer s1 = null;
    Integer s2 = null;
    var flag1 = false;
    var flag2 = false;

    do {

        try {

            s1 = Integer.parseInt(IO.readln("Primer sumando: "));
            flag1 = true;

        } catch (Exception e) {
            IO.println("Error en el primer sumando");
        }

    } while (!flag1);

    do {
        try {

            s2 = Integer.parseInt(IO.readln("Segundo sumando: "));
            flag2 = true;

        } catch (Exception e) {
            IO.println("Error en los sumandos");
        }
    } while (!flag2);

    if (s1 != null && s2 != null) {

        IO.println(suma(s1, s2));

    }

    // Versión más eficiente: mismo resultado reutilizando un método
    double n1 = leerDecimal("Primer sumando (versión corta): ");
    double n2 = leerDecimal("Segundo sumando (versión corta): ");
    IO.println(suma(n1, n2));

}

int suma(int a, int b) {
    return a + b;
}

// Sobrecarga de suma para decimales (la de enteros sigue funcionando igual)
double suma(double a, double b) {
    return a + b;
}

// Pide un número (entero o decimal, con punto o coma) y repite hasta que sea válido
double leerDecimal(String mensaje) {
    while (true) {
        try {
            return Double.parseDouble(IO.readln(mensaje).trim().replace(',', '.'));
        } catch (NumberFormatException e) {
            IO.println("Eso no es un número, inténtalo de nuevo");
        }
    }
}