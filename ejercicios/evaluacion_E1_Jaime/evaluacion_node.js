// Ejercicio 3: componente equivalente a ProductoServidor en Node.js

// 3.1 · Definición de la clase ProductoNode
class ProductoNode {
    constructor(nombre, precio, stock) {
        // Nombre del producto
        this.nombre = nombre;
        // Precio del producto
        this.precio = precio;
        // Cantidad en stock
        this.stock = stock;
    }

    mostrarFicha() {
        const unidades = this.stock === 1 ? "ud." : "uds.";
        console.log(`Producto: ${this.nombre} | Precio: ${this.precio.toFixed(2)}€ | Stock: ${this.stock} ${unidades}`);
    }

    aplicarDescuento(porcentaje) {
        this.precio = this.precio - (this.precio * porcentaje / 100);
    }
}

// 3.2 · Creación y prueba de objetos
const p1 = new ProductoNode("Servidor Torre Pro", 1200.0, 5);
const p2 = new ProductoNode("Router WiFi 6", 60.0, 10);

console.log("--- Fichas iniciales ---");
p1.mostrarFicha();
p2.mostrarFicha();

console.log("--- Aplicando un 10% de descuento al primer producto ---");
p1.aplicarDescuento(10);
p1.mostrarFicha();
