// 1. En Node.js simulamos un enum con un objeto constante:
// Object.freeze congela el objeto: nadie puede cambiar ni añadir estados
const EstadoReserva = Object.freeze({ PENDIENTE: "PENDIENTE",
CONFIRMADA: "CONFIRMADA", CANCELADA: "CANCELADA" });
// 2. El Array normal de JS ya es dinámico como el ArrayList de Java:
// Crea la lista vacía (const: la variable no cambia aunque la lista crezca)
const listaAlumnos = [];
// .push() añade elementos igual que .add() en Java
listaAlumnos.push("Ana");
// Añade el segundo elemento
listaAlumnos.push("Luis");
// 3. Node.js tiene también la clase Set (sin repetidos) y Map (Clave -> Valor):
// Crea un conjunto sin duplicados idéntico al HashSet de Java
const categorias = new Set();
// Usa exactamente el mismo método .add() que en Java
categorias.add("Bebidas");
// El duplicado se ignora automáticamente
categorias.add("Bebidas");
// Crea un diccionario Clave-Valor idéntico al HashMap de Java
const precios = new Map();
// En JS se usa .set() para guardar la pareja y .get() para leerla
precios.set("Pan", 1.20);
// Muestra CONFIRMADA
console.log("Estado en Node.js: " + EstadoReserva.CONFIRMADA);
// Muestra 1
console.log("Tamaño del Set sin duplicados: " + categorias.size);
// Muestra 1.2 €
console.log("Precio del Pan en el Map: " + precios.get("Pan") + " €");
// .length dice cuántos elementos tiene el array, como .size() en Java: muestra 2
console.log("Alumnos en la lista: " + listaAlumnos.length);