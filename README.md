# API de Manejo de Clientes

Este proyecto es una API RESTful para el manejo de clientes, desarrollada con Java y Spring Boot utilizando el IDE NetBeans.

## Requisitos

- Java 17 o superior
- Maven 3.6 o superior
- NetBeans IDE 22
- MySQL (para producción)
- SQLite (para desarrollo/pruebas)
- Postman (para probar los endpoints)

## Configuración

1. Clona el repositorio:

git clone https://github.com/tu-usuario/cliente-api.git

2. Abre el proyecto en NetBeans:

- File > Open Project
- Navega hasta el directorio del proyecto y selecciónalo

3. Configura la base de datos:

- Para desarrollo, la aplicación usa SQLite por defecto. No se requiere configuración adicional.
- Para producción con MySQL, edita `src/main/resources/application.properties` y descomenta las líneas de configuración de MySQL.

## Ejecución

1. En NetBeans, haz clic derecho en el proyecto y selecciona "Clean and Build"
2. Luego, haz clic derecho nuevamente y selecciona "Run"

La API estará disponible en `http://localhost:8080`

## Documentación de la API

Accede a la documentación Swagger UI en `http://localhost:8080/swagger-ui.html`

## Endpoints y Cómo Usarlos con Postman

### 1. Crear un nuevo cliente (POST)

- URL: `http://localhost:8080/api/clientes`
- Método: POST
- Body (raw JSON):
```json
{
 "nombre": "Juan Pérez",
 "email": "juan@example.com",
 "telefono": "+1234567890"
}
```
2. Obtener todos los clientes (GET)

URL: http://localhost:8080/api/clientes
Método: GET

3. Obtener un cliente por ID (GET)

URL: http://localhost:8080/api/clientes/{id}
Método: GET
Reemplaza {id} con el ID del cliente

4. Actualizar un cliente (PUT)

URL: http://localhost:8080/api/clientes/{id}
Método: PUT
Reemplaza {id} con el ID del cliente
Body (raw JSON):
```json
{
  "nombre": "Juan Pérez Actualizado",
  "email": "juan.actualizado@example.com",
  "telefono": "+0987654321"
}
```

5. Eliminar un cliente (DELETE)

URL: http://localhost:8080/api/clientes/{id}
Método: DELETE
Reemplaza {id} con el ID del cliente

Para usar estos endpoints en Postman:

Abre Postman
Crea una nueva solicitud
Selecciona el método HTTP apropiado (GET, POST, PUT, DELETE)
Ingresa la URL del endpoint
Para POST y PUT, ve a la pestaña "Body", selecciona "raw" y "JSON", e ingresa el cuerpo de la solicitud
Haz clic en "Send"

Scripts de Base de Datos
Usa el siguiente script para inicializar la base de datos MySQL:
```sql
-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS clientedb;
USE clientedb;

-- Crear la tabla de clientes
CREATE TABLE IF NOT EXISTS clientes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    telefono VARCHAR(20)
);

-- Insertar algunos datos de prueba
INSERT INTO clientes (nombre, email, telefono) VALUES
('Juan Pérez', 'juan@example.com', '+1234567890'),
('María García', 'maria@example.com', '+0987654321');
```
Pruebas
Para ejecutar las pruebas unitarias en NetBeans:

Haz clic derecho en el proyecto
Selecciona "Test"
