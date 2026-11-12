// Simulamos que el usuario ha elegido la opción 2 (const: no va a cambiar)
const opcion = 2;
// Igual que en Java: indicamos entre paréntesis la variable que queremos examinar
switch (opcion) {
// En caso de que 'opcion' valga exactamente 1
case 1:
console.log("Has seleccionado: Alta de nuevo usuario.");
// También en JavaScript el break frena la caída en cascada
break;
// En caso de que 'opcion' valga exactamente 2
case 2:
console.log("Has seleccionado: Baja de usuario en el sistema.");
break;
// Si no coincide con ningún case
default:
console.log("Error: La opción seleccionada no es válida.");
// Cierra el bloque switch
}