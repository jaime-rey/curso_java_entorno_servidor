class Producto {
    constructor(nombre, precio, stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    getNombre() {
        return this.nombre;
    }

    setNombre(nombre) {
        this.nombre = nombre;
    }

    getPrecio() {
        return this.precio;
    }

    setPrecio(precio) {
        if (precio < 0) {
            throw new Error("El precio no puede ser negativo");
        }
        this.precio = precio;
    }

    getStock() {
        return this.stock;
    }

    setStock(stock) {
        this.stock = stock;
    }
}

const producto1 = new Producto("Laptop", 1200.0, 10);
console.log(producto1);
const producto2 = producto1;
console.log(producto2);
const producto3 = new Producto("Laptop", 1200.0, 10);
console.log(producto3);