// Ejercicio 9 - Servidor web de Academia (Node.js, módulo http nativo).
// Puerto 3000. Rutas: "/", "/cursos", "/horario". Resto -> 404.

const http = require('http');

const servidor = http.createServer((req, res) => {
    console.log(`Petición -> ${req.method} ${req.url}`);

    if (req.url === '/') {
        res.writeHead(200, { 'Content-Type': 'text/html; charset=utf-8' });
        res.end(`
            <h1>Bienvenido a la Academia Avante</h1>
            <p>Visita <a href='/cursos'>/cursos</a> o <a href='/horario'>/horario</a>.</p>
        `);
    } else if (req.url === '/cursos') {
        res.writeHead(200, { 'Content-Type': 'text/html; charset=utf-8' });
        res.end(`
            <h1>Catálogo de cursos</h1>
            <ul>
                <li>MF0491 - Programación Web en el Cliente</li>
                <li>MF0492 - Programación Web en Entorno Servidor</li>
                <li>MF0493 - Despliegue de Aplicaciones Web</li>
            </ul>
            <p><a href='/'>Volver al inicio</a></p>
        `);
    } else if (req.url === '/horario') {
        res.writeHead(200, { 'Content-Type': 'text/html; charset=utf-8' });
        res.end(`
            <h1>Horario semanal</h1>
            <ul>
                <li>Lunes a Viernes: 09:00 - 14:00</li>
                <li>Tutorías: Jueves 16:00 - 18:00</li>
            </ul>
            <p><a href='/'>Volver al inicio</a></p>
        `);
    } else {
        res.writeHead(404, { 'Content-Type': 'text/html; charset=utf-8' });
        res.end(`
            <h1>Error 404: Página no encontrada</h1>
            <p>La ruta <b>${req.url}</b> no existe en el servidor de la academia.</p>
        `);
    }
});

servidor.listen(3000, () => {
    console.log('Servidor Academia activo en http://localhost:3000');
});
