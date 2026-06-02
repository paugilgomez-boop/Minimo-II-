# Mínimo II - Backend

Repositorio backend del Mínimo II de DSA.

Alumno: Pau Gil Gómez  
Grupo: G3  
Ejercicio: EJ4

## Funcionalidad implementada

Se ha implementado la funcionalidad de eventos del juego.

La API permite:

- Obtener el listado de eventos disponibles.
- Registrar un usuario en un evento.
- Guardar los eventos en base de datos.
- Guardar las inscripciones de los usuarios en base de datos.
- Controlar que un usuario no pueda inscribirse dos veces en el mismo evento.

## Endpoints añadidos

### Obtener eventos

```http
GET /dsaApp/game/events
Devuelve una lista de eventos con la siguiente información:

id
name
description
image
startDate
endDate
#### Inscribirse en un evento

POST /dsaApp/game/events/{eventId}/register
Body de ejemplo:

{
  "userId": 106,
  "username": "paugilgomez"
}
Respuesta correcta:

200 OK
Si el usuario ya está inscrito en ese evento, el backend devuelve conflicto y Android muestra el mensaje:

Ya estás inscrito en este evento
Base de datos
Aunque el enunciado permitía usar datos dummy, al sobrar tiempo se ha implementado la funcionalidad usando base de datos real.

Se han añadido las tablas:

gameevent
eventregistration
La tabla gameevent almacena los eventos disponibles.

La tabla eventregistration almacena las inscripciones de los usuarios a los eventos.

También se dejó planteada/comentada la forma de hacerlo con datos dummy, pero la versión final funciona con MariaDB.

Trabajo en local
El backend se ha ejecutado en local:

http://localhost:8080/dsaApp/
Para probarlo desde un móvil físico Android, el ordenador y el móvil se conectaron mediante datos móviles / hotspot. Por eso en Android se usó la IP local del ordenador dentro de esa red:

http://172.20.10.2:8080/dsaApp/
Esta IP puede cambiar si se cambia de red, por lo que habría que actualizar la BASE_URL en Android.

Pruebas realizadas
Se ha comprobado:

GET /game/events desde navegador.
POST /game/events/{eventId}/register desde Swagger.
Inserción real en la tabla eventregistration.
Lectura de eventos desde Android.
Registro de eventos desde Android.
Control de inscripción duplicada.
Evidencias
Se incluyen capturas de:

Swagger con los endpoints añadidos.
Respuesta del endpoint GET /game/events.
Respuesta del endpoint POST /game/events/{eventId}/register.
Tablas de MariaDB con eventos e inscripciones.
Aplicación Android mostrando eventos.
Aplicación Android realizando inscripción.
