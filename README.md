# API CRUD de Procedures

Este proyecto es un servicio REST hecho con Spring Boot para manejar datos de `Procedure`.  
Permite listar, buscar por ID, crear y eliminar registros.  

---

## Requisitos previos

- Tener instalado Java 17 o superior  
- Maven 3.x  
- Algún cliente para probar la API (Postman, Insomnia o cURL desde consola)

---

## Cómo ejecutar el proyecto

1. Clona este repositorio  
2. Abre la carpeta del proyecto en tu IDE o terminal  
3. Corre el siguiente comando:

mvn spring-boot:run

4. La aplicación quedará corriendo en:

http://localhost:8080

---

## Endpoints disponibles

La ruta base es:

http://localhost:8080/api/v1/procedures

### Obtener todos los registros
GET /api/v1/procedures
Ejemplo:
curl -X GET http://localhost:8080/api/v1/procedures

---

### Obtener un registro por ID
GET /api/v1/procedures/{id}
Ejemplo:
curl -X GET http://localhost:8080/api/v1/procedures/1

---

### Crear un nuevo registro
POST /api/v1/procedures
Ejemplo:
curl -X POST http://localhost:8080/api/v1/procedures \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Nuevo Procedure",
    "description": "Ejemplo de prueba"
  }'

---

### Eliminar un registro por ID
DELETE /api/v1/procedures/{id}
Ejemplo:
curl -X DELETE http://localhost:8080/api/v1/procedures/1

---

## Estructura básica del proyecto

src/main/java/com/example/crudprueba
 ├── CrudpruebaApplication.java   -> clase principal
 ├── Procedure.java               -> entidad del modelo
 ├── ProcedureRepository.java     -> acceso a la base de datos
 ├── ProcedureService.java        -> capa de lógica
 └── ProcedureController.java     -> endpoints REST

---

## Tecnologías usadas

- Spring Boot  
- Spring Data JPA  
- Base de datos H2 en memoria (se puede cambiar por otra)  

---

## Probando con Postman

- Crear colección llamada Procedures CRUD  
- Agregar estos requests:
  - GET → http://localhost:8080/api/v1/procedures
  - GET → http://localhost:8080/api/v1/procedures/{id}
  - POST → http://localhost:8080/api/v1/procedures
  - DELETE → http://localhost:8080/api/v1/procedures/{id}  

Para el POST, usar en Body → raw → JSON:
{
  "name": "Nuevo Procedure",
  "description": "Ejemplo de prueba"
}

---

## Autor

Proyecto creado como ejemplo de CRUD con Spring Boot.
