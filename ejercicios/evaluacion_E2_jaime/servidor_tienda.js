// =====================================================
// APARTADO 1: Lógica JavaScript del servidor
// =====================================================

// Clase ProductoTienda
class ProductoTienda {
    constructor(nombre, precio, stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    calcularPrecioConIva() {
        return this.precio * 1.21; // IVA del 21%
    }
}

// Array de catálogo con 4 productos
const productos = [
    new ProductoTienda("Portátil", 899.99, 10),
    new ProductoTienda("Monitor", 149.5, 25),
    new ProductoTienda("Teclado", 45, 40),
    new ProductoTienda("Ratón", 19.99, 60)
];

// Contador de visitas
let visitasTotales = 0;

// =====================================================
// APARTADO 2: Creación del servidor HTTP
// =====================================================
const http = require('http');

const servidor = http.createServer((req, res) => {
    visitasTotales++;
    console.log(`Visita nº ${visitasTotales} -> Método: ${req.method} | Ruta: ${req.url}`);

    // =================================================
    // APARTADO 3: Rutas web HTML (200 OK)
    // =================================================
    if (req.url === "/") {
        res.writeHead(200, { 'Content-Type': 'text/html; charset=utf-8' });
        res.write("<!DOCTYPE html><html><head><title>Informática Sur</title></head><body>");
        res.write("<h1>Bienvenidos al Servidor de Informática Sur</h1>");
        res.write(`<p>Visitas totales del servidor: <strong>${visitasTotales}</strong></p>`);
        res.write("<h2>Rutas disponibles</h2>");
        res.write("<ul>");
        res.write('<li><a href="/catalogo">Catálogo completo</a></li>');
        res.write('<li><a href="/ofertas">Ofertas económicas</a></li>');
        res.write('<li><a href="/contacto">Contacto y horario</a></li>');
        res.write('<li><a href="/api/productos">API: productos (JSON)</a></li>');
        res.write('<li><a href="/api/estado">API: estado del servidor (JSON)</a></li>');
        res.write("</ul>");
        res.write("</body></html>");
        res.end();

    } else if (req.url === "/catalogo") {
        res.writeHead(200, { 'Content-Type': 'text/html; charset=utf-8' });
        res.write("<!DOCTYPE html><html><head><title>Catálogo</title></head><body>");
        res.write("<h1>Catálogo completo</h1>");
        res.write("<ul>");
        for (let i = 0; i < productos.length; i++) {
            const p = productos[i];
            res.write(`<li><strong>${p.nombre}</strong> - Stock: ${p.stock} uds - ` +
                `Precio base: ${p.precio.toFixed(2)} € - ` +
                `Precio con IVA: ${p.calcularPrecioConIva().toFixed(2)} €</li>`);
        }
        res.write("</ul>");
        res.write('<p><a href="/">Volver al inicio</a></p>');
        res.write("</body></html>");
        res.end();

    } else if (req.url === "/ofertas") {
        res.writeHead(200, { 'Content-Type': 'text/html; charset=utf-8' });
        res.write("<!DOCTYPE html><html><head><title>Ofertas</title></head><body>");
        res.write("<h1>Ofertas económicas (menos de 100 €)</h1>");
        res.write("<ul>");
        for (let i = 0; i < productos.length; i++) {
            const p = productos[i];
            if (p.precio < 100) {
                res.write(`<li><strong>${p.nombre}</strong> - Precio base: ${p.precio.toFixed(2)} € - ` +
                    `Con IVA: ${p.calcularPrecioConIva().toFixed(2)} €</li>`);
            }
        }
        res.write("</ul>");
        res.write('<p><a href="/">Volver al inicio</a></p>');
        res.write("</body></html>");
        res.end();

    } else if (req.url === "/contacto") {
        res.writeHead(200, { 'Content-Type': 'text/html; charset=utf-8' });
        res.write("<!DOCTYPE html><html><head><title>Contacto</title></head><body>");
        res.write("<h1>Atención al Cliente y Soporte Técnico</h1>");
        res.write("<p>Correo electrónico: soporte@informaticasur.es</p>");
        res.write("<p>Teléfono: 955 123 456</p>");
        res.write("<p>Horario: Lunes a Viernes de 9:00 a 14:00 y de 17:00 a 20:30. Sábados de 10:00 a 14:00.</p>");
        res.write('<p><a href="/">Volver al inicio</a></p>');
        res.write("</body></html>");
        res.end();

    // =================================================
    // APARTADO 4: Rutas de datos JSON
    // =================================================
    } else if (req.url === "/api/productos") {
        res.writeHead(200, { 'Content-Type': 'application/json; charset=utf-8' });
        res.end(JSON.stringify(productos));

    } else if (req.url === "/api/estado") {
        res.writeHead(200, { 'Content-Type': 'application/json; charset=utf-8' });
        const estadoServidor = {
            tienda: "Informática Sur",
            estado: "Operativo",
            puerto: 3000,
            visitas: visitasTotales
        };
        res.end(JSON.stringify(estadoServidor));

    // =================================================
    // APARTADO 5: Rutas inexistentes (404 Not Found)
    // =================================================
    } else {
        res.writeHead(404, { 'Content-Type': 'text/html; charset=utf-8' });
        res.write("<!DOCTYPE html><html><head><title>Error 404</title></head><body>");
        res.write("<h1>Error 404: Página no encontrada en el servidor</h1>");
        res.write(`<p>La ruta <strong>${req.url}</strong> no existe.</p>`);
        res.write('<p><a href="/">Volver al inicio</a></p>');
        res.write("</body></html>");
        res.end();
    }
});

// Servidor escuchando en el puerto 3000
servidor.listen(3000, () => {
    console.log("Servidor de Informática Sur escuchando en http://localhost:3000");
});
