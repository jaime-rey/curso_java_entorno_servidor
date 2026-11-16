// En Node.js creamos el array usando corchetes [ ] y la palabra 'const' (no vamos
// a sustituir el array por otro)
const notas = [6.5, 7.0, 8.2, 5.5, 9.0];
// Inicializamos nuestro acumulador en 0 igual que en Java ('let' porque su valor
// va a cambiar)
let suma = 0;
// El recorrido con .length e índices desde 0 es idéntico al de Java
for (const element of notas) {
// Sumamos el valor de cada casilla al acumulador
suma += element;
// Cierra el bucle for
}
// Calculamos la media dividiendo entre la longitud del array
const media = suma / notas.length;
// Imprimimos el promedio en la terminal
console.log("La media calculada en Node.js es: " + media);
// El objeto Math tiene exactamente los mismos métodos en ambos lenguajes
console.log("Raíz cuadrada de 25 en Node.js: " + Math.sqrt(25));