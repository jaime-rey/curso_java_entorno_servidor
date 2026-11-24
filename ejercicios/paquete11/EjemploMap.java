package ejercicios.paquete11;

import java.util.HashMap;

public class EjemploMap {
    // EjemploMap.java)
    public class EjemploMap {
        // Inicia el método principal
        public static void main(String[] args) {
            // Creamos un mapa donde la Clave es un texto (String) y el Valor asociado
            // es un decimal (Wrapper Double):
            // Inicializa el diccionario vacío en memoria
            HashMap<String, Double> precios = new HashMap<String, Double>();
            // Con .put() guardamos la pareja: Clave "Pan" -> Valor 1.20 euros
            precios.put("Pan", 1.20);
            // Guardamos la segunda pareja: Clave "Leche" -> Valor 0.95 euros
            precios.put("Leche", 0.95);
            // Guardamos la tercera pareja: Clave "Arroz" -> Valor 1.10 euros
            precios.put("Arroz", 1.10);
            // Para saber cuánto cuesta el pan, no necesitamos buscar por números de
            // posición; preguntamos directamente por la palabra "Pan":
            // .get("Pan") busca la clave y devuelve instantáneamente 1.2
            System.out.println("Precio del pan: " + precios.get("Pan") + " €");
            // Muestra todas las parejas, por ejemplo {Arroz=1.1, Leche=0.95,
            // Pan=1.2}: HashMap no garantiza ningún orden
            System.out.println("Todos los precios del mapa: " + precios);
            // Recorremos el mapa con un bucle for-each sobre las claves
            for (String clave : precios.keySet()) {
                System.out.println("Clave: " + clave + ", Valor: " + precios.get(clave));
            }
        }
        // Cierra la clase EjemploMap
    }
}
