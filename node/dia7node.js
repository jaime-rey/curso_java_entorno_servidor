// En Node.js la sintaxis de clases es muy parecida a la de Java, pero sin
// escribir tipos
class CuentaBancaria {
    // El método constructor se llama siempre 'constructor' en JavaScript
    constructor(titular, saldo) {
        // Guarda el titular
        this.titular = titular;
        // Guarda el saldo
        this.saldo = saldo;
        // Cierra el constructor
    }

    // Método de instancia
    ingresar(cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        }
    }
    mostrarDatos() {
        console.log("Titular: " + this.titular + " | Saldo: " + this.saldo
            + " €");
    }
}
// Instancia un objeto usando 'new' ('const' porque c1 siempre apunta a esta misma
// cuenta)
const c1 = new CuentaBancaria("Lucía", 100.0);
c1.ingresar(50.0);
// Muestra por la terminal de Node.js el saldo actualizado (150 €)
c1.mostrarDatos();
