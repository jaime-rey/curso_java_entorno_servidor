// Paso 1: Cargamos el módulo readline (equivale al import de Java)
const readline = require("readline");
// Paso 2: Creamos el lector conectado al teclado (process.stdin) y a la pantalla
// (process.stdout)
const teclado = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
// Paso 3: Mostramos la pregunta; cuando el usuario pulsa Enter, lo que ha escrito
// llega a la variable 'nombre'
teclado.question("Escribe tu nombre: ", (nombre) => {
    // Usamos el dato aquí, dentro de las llaves
    console.log("Hola, " + nombre + ", bienvenido al sistema.");
    // Cerramos el lector, igual que hacíamos con Scanner
    teclado.close();
    // Cierra el bloque que se ejecuta al recibir la respuesta
});