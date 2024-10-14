# Nurses Association & Event Management App

Esta aplicación permite gestionar capítulos de una Asociación de Enfermeras y administrar eventos como conferencias y exposiciones.

## Requisitos

1. **Java**: Debes tener **Java 17** instalado. Descárgalo [aquí](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).
2. **Maven**: No es necesario instalar Maven manualmente. El proyecto incluye un wrapper (`mvnw`).

## Cómo ejecutar la aplicación

1. **Descargar el proyecto**
    - Clona o descarga este repositorio en tu computadora. Si descargas el archivo ZIP, descomprímelo.

2. **Abrir una terminal**
    - Navega hasta la carpeta del proyecto.

3. **Ejecutar el proyecto**
    - Ejecuta el siguiente comando para iniciar la aplicación:
      ```bash
      ./mvnw spring-boot:run
      ```
    - Esto arrancará el servidor local.

4. **Acceder a la aplicación**
    - Abre tu navegador web y visita `http://localhost:8080`.

## Funcionalidades de la API

### Gestión de Capítulos (Chapters)

1. **Crear un Capítulo (POST)**:
    - URL: `POST http://localhost:8080/api/chapters`
    - Ejemplo de cuerpo JSON:
      ```json
      {
        "name": "Capítulo Norte",
        "district": "Distrito Norte",
        "president": {
          "name": "Ana Pérez",
          "status": "ACTIVE",
          "renewalDate": "2024-10-01"
        },
        "members": [
          {
            "name": "Carlos García",
            "status": "ACTIVE",
            "renewalDate": "2024-12-01"
          },
          {
            "name": "Lucía Gómez",
            "status": "LAPSED",
            "renewalDate": "2023-07-01"
          }
        ]
      }
      ```

2. **Obtener todos los Capítulos (GET)**:
    - URL: `GET http://localhost:8080/api/chapters`

3. **Obtener un Capítulo por ID (GET)**:
    - URL: `GET http://localhost:8080/api/chapters/{id}`

4. **Eliminar un Capítulo (DELETE)**:
    - URL: `DELETE http://localhost:8080/api/chapters/{id}`

### Gestión de Eventos (Events)

1. **Crear un Evento (POST)**:
    - URL: `POST http://localhost:8080/api/events`
    - Ejemplo de cuerpo JSON para **Conferencia**:
      ```json
      {
        "date": "2024-11-10",
        "duration": 120,
        "location": "Auditorio Nacional",
        "title": "Conferencia de Salud Pública",
        "guests": [
          {
            "name": "Dr. Juan López",
            "status": "ATTENDING"
          },
          {
            "name": "Sra. María Ortiz",
            "status": "NO_RESPONSE"
          }
        ],
        "speakers": [
          {
            "name": "Dra. Clara Martínez",
            "presentationDuration": 30
          },
          {
            "name": "Dr. Luis Rodríguez",
            "presentationDuration": 45
          }
        ]
      }
      ```

2. **Obtener todos los Eventos (GET)**:
    - URL: `GET http://localhost:8080/api/events`

3. **Obtener un Evento por ID (GET)**:
    - URL: `GET http://localhost:8080/api/events/{id}`

4. **Eliminar un Evento (DELETE)**:
    - URL: `DELETE http://localhost:8080/api/events/{id}`

## Consola de la base de datos (H2)

La aplicación utiliza una base de datos en memoria (H2). Puedes acceder a la consola de la base de datos en:

http://localhost:8080/h2-console


- **JDBC URL**: `jdbc:h2:mem:testdb`
- **User**: `sa`
- **Password**: (dejar en blanco)
