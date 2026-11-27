const Cliente = require("./cliente");

const clientes = [
    new Cliente("Ana García", "ana@correo.com"),
    new Cliente("Luis Pérez", "luis@correo"),
    new Cliente("María López", "maria-correo.com"),
];

let validos = 0;

for (const c of clientes) {
    const ok = c.emailValido();
    const marca = ok ? "[OK]" : "[X] ";
    console.log(`${marca} ${c.nombre.padEnd(14)} <${c.email}>`);
    if (ok) validos++;
}

console.log("---------------------------------------------");
console.log(`Clientes con email válido: ${validos} de ${clientes.length}`);
