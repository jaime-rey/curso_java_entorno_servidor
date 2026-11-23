// 1. Importamos el módulo nativo 'http' de Node.js
const http = require('http');
// 2. Creamos el servidor web capaz de gestionar distintas rutas (enrutamiento
// HTTP):
// 'req' trae los datos de la petición del cliente; 'res' envía nuestra respuesta
const servidor = http.createServer((req, res) => {
    // Mostramos en la consola de VS Code qué método (GET) y qué ruta (req.url)
    // acaba de pedir el navegador:
    // Registro en terminal
    console.log("Petición recibida -> Método: " + req.method +
        " | Ruta solicitada: " + req.url);
    // Evaluamos con if / else if / else qué ruta exacta está visitando el
    // usuario:
    // CASO 1: El usuario entra a la página principal de inicio
    // (http://localhost:3000/)
    if (req.url === "/") {
        // Código 200 (OK) y formato HTML
        res.writeHead(200, {
            'Content-Type': 'text/html; charset=utf-8'
        });
        // Título principal
        res.write("<h1>Página de Inicio del Servidor</h1>");
        // Enlaces navegables
        res.write("<p>Bienvenido. Prueba a visitar <a " +
            "href='/productos'>/productos</a>, <a " +
            "href='/contacto'>/contacto</a> o <a " +
            "href='/api/info'>/api/info</a></p>");
        // Cerramos el envío de la portada
        res.end();
        // CASO 2: El usuario entra en http://localhost:3000/productos
    } else if (req.url === "/productos") {
        // Código 200 (OK) y formato HTML
        res.writeHead(200, {
            'Content-Type': 'text/html; charset=utf-8'
        });
        // Título de la sección
        res.write("<h1>Catálogo de Productos del Servidor</h1>");
        // Lista HTML de artículos
        res.write("<ul><li>Portátil Java Pro - 850 €</li><li>Monitor 24 " +
            "pulgadas - 140 €</li></ul>");
        // Enlace para regresar
        res.write("<p><a href='/'>Volver al inicio</a></p>");
        // Cerramos el envío del catálogo
        res.end();
        // CASO 3: El usuario entra en http://localhost:3000/contacto
    } else if (req.url === "/contacto") {
        // Código 200 (OK) y formato HTML
        res.writeHead(200, {
            'Content-Type': 'text/html; charset=utf-8'
        });
        // Título de contacto
        res.write("<h1>Página de Contacto y Soporte</h1>");
        // Información de soporte
        res.write("<p>Correo de atención al cliente: " +
            "soporte@servidorcurso.es</p>");
        // Cerramos el envío de contacto
        res.end();
        // CASO 4: El usuario pide datos en formato JSON (application/json)
    } else if (req.url === "/api/info") {
        // Indicamos en la cabecera que enviamos datos JSON
        res.writeHead(200, {
            'Content-Type': 'application/json; charset=utf-8'
        });
        // Creamos un objeto JavaScript (const: no vamos a cambiarlo)
        const datosServidor = {
            curso: "MF0492 Entorno Servidor",
            estado: "Activo",
            puerto: 3000
        };
        // JSON.stringify convierte el objeto a texto JSON y lo envía al navegador
        res.end(JSON.stringify(datosServidor));
        // CASO POR DEFECTO (Error 404): El usuario ha escrito una dirección que no
        // existe en nuestro servidor
    } else {
        // ¡Importante! Enviamos el código oficial 404 (Not Found)
        res.writeHead(404, {
            'Content-Type': 'text/html; charset=utf-8'
        });
        // Mensaje claro de error 404
        res.write("<h1>Error 404: Página no encontrada</h1>");
        // Le indicamos qué ruta falló
        res.write("<p>La ruta <b>" + req.url +
            "</b> no existe en este servidor.</p>");
        // Cerramos la respuesta de error
        res.end();
        // Cierra la estructura condicional de rutas
    }
    // Cierra http.createServer
});
// 3. Arrancamos el servidor en el puerto 3000:
// Escucha peticiones en localhost:3000
servidor.listen(3000, () => {
    // Mensaje de confirmación en consola
    console.log("Servidor de rutas activo en http://localhost:3000");
    // Cierra servidor.listen
});