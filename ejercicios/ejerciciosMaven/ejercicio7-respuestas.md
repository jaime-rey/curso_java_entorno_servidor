# Ejercicio 7 — URL, verbos HTTP y códigos de estado

## 1. Partes de la URL

URL: `http://localhost:8080/api/clientes/C07?activo=true`

| Parte          | Valor                      | Qué es                                                                 |
|----------------|----------------------------|------------------------------------------------------------------------|
| Protocolo      | `http`                     | Protocolo de comunicación (sin cifrar; `https` lo sería con TLS).      |
| Servidor       | `localhost`                | Host que atiende la petición. `localhost` = mi propio ordenador.       |
| Puerto         | `8080`                     | Puerta TCP en la que escucha el servidor.                              |
| Ruta           | `/api/clientes/C07`        | Recurso solicitado: dentro de la API, el cliente con código `C07`.     |
| Parámetros     | `activo=true`              | Query string (tras `?`): filtro adicional. Clave `activo`, valor `true`. |

## 2. Verbo HTTP y código de estado esperado por operación

| Operación                                   | Verbo    | Código si todo va bien |
|---------------------------------------------|----------|------------------------|
| Consultar el catálogo de productos          | `GET`    | `200 OK`               |
| Dar de alta un producto nuevo               | `POST`   | `201 Created`          |
| Cambiar el precio de un producto existente  | `PUT`    | `200 OK` (o `204 No Content` si no se devuelve cuerpo) |
| Eliminar un cliente                         | `DELETE` | `204 No Content` (o `200 OK`) |

Notas:
- `POST` se usa para **crear**: el servidor responde con `201 Created` y, por convenio, incluye la cabecera `Location` con la URL del recurso recién creado.
- `PUT` reemplaza o actualiza un recurso identificado por su URL. Si el servidor no devuelve cuerpo, lo correcto es `204 No Content`.
- `DELETE` normalmente responde `204 No Content` porque, tras borrar, no hay nada que devolver.

## 3. Códigos en casos de error

- **Pedir un cliente que no existe** (`GET /api/clientes/C99` con `C99` inexistente):
  → `404 Not Found`. El cliente formuló bien la petición, pero el recurso solicitado no está.

- **El servidor lanza una excepción no capturada** (por ejemplo, un `NullPointerException` en Java o un `TypeError` en Node.js que nadie controla):
  → `500 Internal Server Error`. El fallo está en el servidor, no en lo que pidió el cliente.

## Familias de códigos (recordatorio)

| Familia | Significado         | Ejemplos típicos                    |
|---------|---------------------|-------------------------------------|
| `1xx`   | Informativa         | `100 Continue`                      |
| `2xx`   | Éxito               | `200 OK`, `201 Created`, `204 No Content` |
| `3xx`   | Redirección         | `301 Moved Permanently`, `304 Not Modified` |
| `4xx`   | Error del cliente   | `400 Bad Request`, `401 Unauthorized`, `403 Forbidden`, `404 Not Found` |
| `5xx`   | Error del servidor  | `500 Internal Server Error`, `502 Bad Gateway`, `503 Service Unavailable` |
