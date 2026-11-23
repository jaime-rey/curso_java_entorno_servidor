// Versión alternativa del dia10node.js usando Express.
// Compara con el fichero original: la lógica de rutas se declara de forma
// mucho más corta y legible, y Express gestiona por nosotros los códigos de
// estado, el Content-Type, el 404 y el parseo de query strings / JSON.

// 1. Importamos Express y Helmet.
//    Instálalos antes con: npm install express helmet
const express = require('express');
const helmet = require('helmet');

// 2. Creamos la aplicación. 'app' hace el papel del antiguo 'servidor'.
const app = express();

// Helmet añade de un plumazo varias cabeceras de seguridad recomendadas:
//   - Content-Security-Policy
//   - X-Frame-Options (clickjacking)
//   - X-Content-Type-Options: nosniff
//   - Strict-Transport-Security (HSTS)
//   - Referrer-Policy
//   - ... y desactiva X-Powered-By (cubre SonarQube S5689)
app.use(helmet());

// 3. Middleware global: registra cada petición en la terminal.
//    Se ejecuta ANTES que cualquier ruta.
app.use((req, res, next) => {
    console.log(`Petición recibida -> Método: ${req.method} | Ruta: ${req.url}`);
    next(); // deja pasar la petición al siguiente handler
});

// 4. Rutas. Cada una se declara con app.<método>(ruta, handler).
//    Express pone por defecto Content-Type text/html; charset=utf-8 con res.send.

// Página de inicio
app.get('/', (req, res) => {
    res.send(`
        <h1>Página de Inicio del Servidor (Express)</h1>
        <p>Bienvenido. Prueba a visitar
            <a href='/productos'>/productos</a>,
            <a href='/contacto'>/contacto</a> o
            <a href='/api/info'>/api/info</a>.
        </p>
    `);
});

// Catálogo
app.get('/productos', (req, res) => {
    res.send(`
        <h1>Catálogo de Productos del Servidor</h1>
        <ul>
            <li>Portátil Java Pro - 850 €</li>
            <li>Monitor 24 pulgadas - 140 €</li>
        </ul>
        <p><a href='/'>Volver al inicio</a></p>
    `);
});

// Contacto
app.get('/contacto', (req, res) => {
    res.send(`
        <h1>Página de Contacto y Soporte</h1>
        <p>Correo de atención al cliente: soporte@servidorcurso.es</p>
        <p><a href='/'>Volver al inicio</a></p>
    `);
});

// API JSON. Con res.json() Express ya pone el Content-Type correcto
// y hace el JSON.stringify por nosotros.
app.get('/api/info', (req, res) => {
    res.json({
        curso: 'MF0492 Entorno Servidor',
        estado: 'Activo',
        puerto: 3000
    });
});

// Bonus: ruta con parámetro dinámico. Prueba /productos/5
app.get('/productos/:id', (req, res) => {
    res.send(`<h1>Detalle del producto ${req.params.id}</h1>`);
});

// 5. 404 por defecto. Al estar al final, Express lo usa cuando ninguna
//    ruta anterior ha coincidido.
app.use((req, res) => {
    res.status(404).send(`
        <h1>Error 404: Página no encontrada</h1>
        <p>La ruta <b>${req.url}</b> no existe en este servidor.</p>
    `);
});

// 6. Arrancamos el servidor en el puerto 3000.
app.listen(3000, () => {
    console.log('Servidor Express activo en http://localhost:3000');
});