// Importamos el módulo nativo 'fs' (File System) de Node.js para leer y escribir
// archivos
const fs = require('fs');
// Creamos un array de nombres en Node.js
const nombres = ["Luis", "Ana", "Marta", "Carlos"];
// El método .sort() ordena la lista alfabéticamente igual que Collections.sort()
// en Java
nombres.sort();
// Muestra: ['Ana', 'Carlos', 'Luis', 'Marta']
console.log("Lista ordenada en Node.js:", nombres);
// El bloque try-catch en Node.js tiene exactamente la misma sintaxis y función
// que en Java
try {
// Escribe el fichero en una sola línea
fs.writeFileSync("./resumen_node.txt",
"Informe generado desde Node.js\nTodo correcto.");
// Confirma la escritura
console.log("Fichero 'resumen_node.txt' guardado correctamente.");
// Lee todo el texto del fichero en formato UTF-8
const contenido = fs.readFileSync("resumen_node.txt", "utf-8");
// Muestra por la terminal lo que había dentro del archivo
console.log("Contenido leído:\n" + contenido);
// Si ocurre cualquier fallo de disco, lo atrapa aquí sin detener el servidor
} catch (error) {
// Mensaje de error controlado
console.log("Error al manejar el fichero en Node.js");
// Cierra el bloque try-catch
}