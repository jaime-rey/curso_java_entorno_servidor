const validator = require("validator");

class Cliente {
    constructor(nombre, email) {
        this.nombre = nombre;
        this.email = email;
    }

    emailValido() {
        return validator.isEmail(this.email);
    }
}

module.exports = Cliente;
