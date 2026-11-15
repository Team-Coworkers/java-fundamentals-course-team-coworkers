# Lección 6: Encapsulación y proyecto final: registro de estudiantes

## Información

- **Duración estimada:** 12 minutos
- **Público objetivo:** Estudiantes de 12 a 17 años
- **Nivel:** Principiante
- **Prerrequisitos:** Lección 5
- **Herramientas:** Navegador web y OnlineGDB
- **Archivos:** `starter-files/lesson-06/Main.java` y `completed-examples/lesson-06/Main.java`

## Objetivos de aprendizaje

Al finalizar esta lección, el estudiante podrá:

- Proteger atributos con `private`.
- Escribir getters y setters con validación.
- Guardar varios objetos en un arreglo y recorrerlo.
- Usar métodos de `String` como `toUpperCase()`.
- Construir un programa completo con clases, arreglos y entrada de datos.

---

# Guion

## 1. ¿Por qué proteger los datos?

**Duración aproximada:** 0:00 - 2:00

**En pantalla:** Mostrar que alguien puede escribir ana.nota = 50; en la clase de la lección 5.

### Narración

En la lección anterior, cualquier parte del programa podía cambiar la nota a 50.

¡Pero las notas van de 0 a 20! Necesitamos proteger los datos.

Eso es la **encapsulación**: esconder los datos y cambiarlos solo de forma segura.

---

## 2. private, getters y setters

**Duración aproximada:** 2:00 - 5:00

**En pantalla:** Cambiar los atributos a private, escribir getNombre, getNota y setNota con su validación.

### Narración

Con `private`, nadie fuera de la clase puede tocar el atributo directamente.

Para leerlo creamos un **getter**: `getNota()` devuelve la nota.

Para cambiarlo creamos un **setter**: `setNota()` revisa que la nota esté entre 0 y 20 antes de guardarla.

---

## 3. Arreglos de objetos

**Duración aproximada:** 5:00 - 7:30

**En pantalla:** Crear el arreglo Estudiante[] registro = new Estudiante[3]; y llenarlo con un for y Scanner.

### Narración

Para guardar varios estudiantes usamos un **arreglo**: una fila de casilleros numerados.

Los casilleros empiezan en **cero**: el primero es `registro[0]`.

Con un `for` pedimos el nombre y la nota de cada estudiante y los guardamos.

---

## 4. Proyecto final: registro de estudiantes

**Duración aproximada:** 7:30 - 10:30

**En pantalla:** Escribir el recorrido del arreglo, el nombre en mayúsculas con toUpperCase y la búsqueda de la mejor nota. Ejecutar con tres estudiantes, uno con nota 25.

### Narración

Ahora recorremos el registro y mostramos a cada estudiante, con su nombre en mayúsculas gracias a `toUpperCase()`.

Mientras recorremos, guardamos al estudiante con la mejor nota.

Probemos una nota de 25... el setter la rechaza. ¡La encapsulación funciona!

Acabas de construir un programa completo con clases, objetos, arreglos y entrada de datos.

---

## 5. Tu turno

**Duración aproximada:** 10:30 - 12:00

**En pantalla:** Texto en pantalla: "⏸ Pausa el video". Archivo inicial de la lección 6.

### Narración

Pausa el video y completa el registro de estudiantes.

Reto extra: muestra también cuántos estudiantes aprobaron.

En la última lección aprenderemos a encontrar y corregir errores como un detective.
