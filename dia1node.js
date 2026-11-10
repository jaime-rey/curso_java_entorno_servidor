// Tipos primitivos de JavaScript, una variable de cada tipo

let numero = 42;                  // number (enteros y decimales)
const decimal = 3.14;               // number
const grande = 9007199254740993n;   // bigint (enteros de tamaño arbitrario)
const texto = "Hola mundo";         // string
const verdadero = true;             // boolean
let sinValor;                       // undefined (declarada sin asignar)
const nulo = null;                  // null (ausencia intencionada de valor)
const simbolo = Symbol("id");   // symbol (identificador único)

console.log(typeof numero);
let nombre = "Carlos"
numero = "un 69";

console.log(typeof numero);     // number
console.log(typeof decimal);    // number
console.log(typeof grande);     // bigint
console.log(typeof texto);      // string
console.log(typeof verdadero);  // boolean
console.log(typeof sinValor);   // undefined
console.log(typeof nulo);       // object (error histórico del lenguaje)
console.log(typeof simbolo);    // symbol
console.log(nombre + ` Cuerpo, de nombre ${nombre}.`);
console.log(decimal.toFixed(5));

// Guarda el número 10 en la variable a
let a = 10;
// Guarda el número 3 en la variable b
let b = 3;
// La suma funciona igual que en Java: 13
console.log(a + b);
// En Node.js NO existe la división entera: muestra 3.3333333333333335
console.log(a / b);
// Si queremos solo la parte entera, usamos Math.trunc(): 3
console.log(Math.trunc(a / b));
// El resto funciona igual que en Java: 1
console.log(a % b);
// Guarda la edad para hacer comparaciones
let edad = 17;
// Los operadores relacionales son iguales: false
console.log(edad >= 18);
// En JavaScript se recomienda comparar con === (tres iguales): true
console.log(edad === 17);
// Los operadores lógicos && || ! son iguales: true
console.log((edad >= 16) && (edad < 18));
// Inicializa un contador a cero
let contador = 0;
// El incremento ++ funciona igual: ahora vale 1
contador++;
// Muestra: Contador: 1
console.log("Contador: " + contador);
// Los caracteres de escape \t y \n también son iguales
console.log("Nombre\tEdad\nCarlos\t25");