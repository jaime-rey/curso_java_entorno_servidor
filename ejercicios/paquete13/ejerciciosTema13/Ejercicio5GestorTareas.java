package ejercicios.paquete13.ejerciciosTema13;


import java.util.ArrayList;
import java.util.Collections;

// 1. ENUM: lista cerrada con los dos únicos estados posibles de una tarea
enum EstadoTarea {
    PENDIENTE, // aún está por realizar
    HECHA      // ya se ha completado
}

// 2. INTERFAZ: contrato que obliga a saber mostrarse por pantalla
interface Mostrable {
    void mostrar();
}

// 3. CLASE POO: implementa Mostrable y encapsula sus datos
class Tarea implements Mostrable {
    private String descripcion;
    private EstadoTarea estado;
    // Wrapper Integer (1 = muy urgente, 2 = media, 3 = baja)
    private Integer prioridad;

    public Tarea(String descripcion, EstadoTarea estado, Integer prioridad) {
        this.descripcion = descripcion;
        this.estado = estado;
        this.prioridad = prioridad;
    }

    // Para consultar si la tarea está PENDIENTE o HECHA
    public EstadoTarea getEstado() {
        return this.estado;
    }

    // Para consultar la prioridad al ordenar la lista
    public Integer getPrioridad() {
        return this.prioridad;
    }

    // Cumple el contrato de Mostrable: los tres datos en una línea
    @Override
    public void mostrar() {
        System.out.println("Tarea: " + this.descripcion + " | Estado: "
                + this.estado + " | Prioridad: " + this.prioridad);
    }
}

public class Ejercicio5GestorTareas {


    public static void main(String[] args) {
        // 4. COLECCIÓN DINÁMICA: ArrayList de objetos de nuestra clase Tarea
        ArrayList<Tarea> tareas = new ArrayList<Tarea>();
        tareas.add(new Tarea("Preparar clase", EstadoTarea.PENDIENTE, 3));
        tareas.add(new Tarea("Corregir ejercicios", EstadoTarea.HECHA, 2));
        tareas.add(new Tarea("Subir materiales al servidor", EstadoTarea.PENDIENTE, 1));

        // 5. LAMBDA DE ORDENACIÓN: por prioridad de menor a mayor (1, 2, 3)
        Collections.sort(tareas, (a, b) -> a.getPrioridad() - b.getPrioridad());

        System.out.println("=== PANEL DE TAREAS DEL SERVIDOR (ORDENADAS POR PRIORIDAD) ===");

        // 6. BUCLE FOR Y CONDICIONAL IF: recorremos la lista ya ordenada
        for (int i = 0; i < tareas.size(); i++) {
            tareas.get(i).mostrar();

            if (tareas.get(i).getEstado() == EstadoTarea.PENDIENTE) {
                System.out.println("[!] Estado: Aún queda por hacer.");
            } else {
                System.out.println("[OK] Estado: Ya está terminada.");
            }
            System.out.println("--------------------------------------------------------------");
        }
    }
}
