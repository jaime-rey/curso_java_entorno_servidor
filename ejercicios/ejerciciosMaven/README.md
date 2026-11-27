# Día 14 — Batería de ejercicios (Maven, Node.js y arquitectura web)

Estructura:

```
ejerciciosMaven/
├── tienda-online/           Ejercicios 1-5 consolidados en un único proyecto Maven
├── clientes-node/           Ejercicio 6 (Node.js + librería validator)
└── ejercicio7-respuestas.md Ejercicio 7 (URL, verbos HTTP, códigos de estado)
```

## tienda-online (Ej 1-5)

- `com.cursojava.App` — punto de entrada.
- `com.cursojava.modelo` — `Producto`, `Cliente`, `LineaPedido`, `Pedido`.
- `com.cursojava.servicio` — `Almacen` (con `mostrarInventario()` y `mostrarAgotados()`).
- `com.cursojava.informes` — `InformeVentas` con método `static mostrar(...)`.

`pom.xml`:
- Java 25 (`maven.compiler.release`).
- JUnit 5 (jupiter) en scope test.
- `maven-jar-plugin` con `mainClass = com.cursojava.App` para poder ejecutar con `java -jar`.

### Cómo compilar y ejecutar

```powershell
cd tienda-online
mvn clean package

# Con classpath
java -cp target/tienda-online-1.0-SNAPSHOT.jar com.cursojava.App

# O directamente con -jar (el manifest lleva Main-Class)
java -jar target/tienda-online-1.0-SNAPSHOT.jar
```

Si en la consola salen interrogantes en vez de acentos, añade `-Dstdout.encoding=UTF-8` o usa PowerShell con `chcp 65001`.

### Salida esperada (resumen de importes)

- Pedido nº 1 — Ana García — 8 × Teclado = 200,00 € → **180,00 € con descuento**.
- Pedido nº 2 — Luis Pérez — 1 × Monitor = 175,00 € → **157,50 € con descuento**.
- Pedido nº 3 — Ana García — 2 × Ratón = 90,00 € (sin descuento).
- Inventario con stock actualizado tras los pedidos; Monitor queda a 0.
- Agotados: `[P03] Monitor 24"` y `[P04] Auriculares inalámbricos`.
- Informe: 3 pedidos, total facturado 427,50 €, pedido más alto nº 1 (180,00 €).

## clientes-node (Ej 6)

```powershell
cd clientes-node
npm install
npm start
```

Valida 3 clientes con `validator.isEmail(...)`. Uno válido, dos no.

## ejercicio7-respuestas.md (Ej 7)

Respuestas escritas sobre las partes de una URL, los verbos HTTP y los códigos de estado.
