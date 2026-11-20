// 1. Importamos el módulo nativo 'http' de Node.js para poder crear un servidor
// web
const http = require('http');
// También podemos usar nuestras clases orientadas a objetos con herencia (extends
// y super) dentro del servidor:
// Superclase Padre en Node.js
class Empleado {
    // Guarda el nombre del empleado
    constructor(nombre) {
        this.nombre = nombre;
    }
    // Cierra Empleado
}
// Subclase Hija con 'extends' igual que en Java
class Comercial extends Empleado {
    constructor(nombre, comision) {
        // Llama al constructor del padre con 'super' igual que en Java
        super(nombre);
        // Guarda la comisión propia
        this.comision = comision;
        // Cierra constructor
    }
    // Cierra Comercial
}
// 2. Creamos el Servidor HTTP pasándole una función que recibe siempre 2 objetos:
// 'req' (la petición) y 'res' (la respuesta):
// Se ejecuta cada vez que alguien entra desde el navegador web
const servidor = http.createServer((req, res) => {
    // Creamos un objeto Comercial para mostrarlo en la web
    let comercialDelMes = new Comercial("Carlos Ruiz", 350.50);
    // Paso A de la Respuesta: Escribimos la cabecera HTTP con código 200 (Todo
    // OK) e indicamos que enviamos HTML con tildes (utf-8):
    // Prepara al navegador para recibir una página web
    res.writeHead(200, {
        'Content-Type': 'text/html; charset=utf-8'
    });
    // Paso B de la Respuesta: Enviamos el contenido HTML al navegador con
    // res.write():
    // Título grande en el navegador
    res.write("<h1>¡Mi Primer Servidor Web en Node.js está funcionando!</h1>");
    // Párrafo explicativo
    res.write("<p>Bienvenido al servidor local escuchando en el puerto " +
        "3000.</p>");
    // Muestra los datos del objeto
    res.write("<p><b>Comercial del mes (POO):</b> " + comercialDelMes.nombre +
        " (Comisión: " + comercialDelMes.comision + " €)</p>");
    // Paso C de la Respuesta (¡Obligatorio!): Cerramos y enviamos la respuesta
    // definitiva con res.end():
    // Indica al navegador que ya hemos terminado de enviar la página
    res.end();
    // Cierra http.createServer
});
// 3. Ponemos el servidor a escuchar llamadas de forma continua en el puerto 3000
// de nuestro ordenador (localhost):
// Arranca el servidor en el puerto 3000
servidor.listen(3000, () => {
    // Aviso en la terminal de VS Code
    console.log("Servidor HTTP arrancado. Abre tu navegador en: " +
        "http://localhost:3000");
    // Recordatorio de cómo detenerlo
    console.log("(Para apagar el servidor en la terminal, pulsa Ctrl + C)");
    // Cierra servidor.listen
});