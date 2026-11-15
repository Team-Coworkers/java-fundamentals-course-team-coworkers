# Fundamentos de Java para Principiantes

## Resumen del Curso

Este curso de 1 hora introduce a estudiantes de secundaria a los fundamentos de la
programación con Java, incluida la programación orientada a objetos. Avanza paso a paso:
del primer mensaje en pantalla a un registro de estudiantes hecho con clases y objetos.
Cada lección incluye pausas para practicar en un editor en línea. **¡No requiere descargas!**
Solo abre tu navegador web.

**Duración total:** ~60 minutos
**Público objetivo:** Estudiantes de 12 a 17 años sin experiencia en programación
**Prerrequisitos:** Ninguno
**Herramientas necesarias:** **¡Solo tu navegador web!** (Chrome, Firefox, Safari, Edge)
**Editor en línea:** [OnlineGDB](https://www.onlinegdb.com/online_java_compiler), gratuito y sin registro

**📂 Repositorio de Código Fuente:** [https://github.com/Team-Coworkers/java-fundamentals-course-team-coworkers](https://github.com/Team-Coworkers/java-fundamentals-course-team-coworkers)

## Secuencia de Lecciones

### Lección 1: ¿Qué es programar y qué es Java? (5 minutos)

**Descripción:**
Aprende qué es un programa, para qué sirve Java y escribe tu primer programa en el navegador: un mensaje que aparece en la pantalla.

**Objetivos de aprendizaje:**

- Explicar qué es un programa y qué hace un lenguaje de programación.
- Reconocer dónde se usa Java: aplicaciones, juegos y servidores.
- Ejecutar un programa en OnlineGDB sin instalar nada.
- Mostrar mensajes con `System.out.println`.

**Conceptos clave:**

- Programa.
- Lenguaje de programación.
- Java.
- Editor en línea.
- `main` y `System.out.println`.

**Conclusiones clave:**
Un programa es una lista de instrucciones que la computadora sigue en orden, de arriba hacia abajo.

**Video:**
*Enlace de YouTube pendiente de publicación.*

**Práctica:**
*Enlace precargado pendiente.* Mientras tanto, abre [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) y pega el archivo inicial de la lección. 👈 **¡No necesitas registrarte!**

**Código fuente:**

- [Starter Files](starter-files/lesson-01)
- [Completed Example](completed-examples/lesson-01)

**Consejo clave:**
Java distingue mayúsculas y minúsculas: `System` no es lo mismo que `system`.

### Lección 2: Variables, tipos de datos y operadores (8 minutos)

**Descripción:**
Guarda datos en variables, conoce los tipos más usados y haz cálculos con operadores, como el promedio de tus notas.

**Objetivos de aprendizaje:**

- Declarar variables con un tipo, un nombre y un valor.
- Diferenciar `int`, `double`, `String` y `boolean`.
- Usar los operadores `+`, `-`, `*`, `/` y `%`.
- Unir texto y valores con `+` al mostrarlos.

**Conceptos clave:**

- Variable.
- `int`, `double`, `String` y `boolean`.
- Operadores aritméticos.
- Resto de una división (`%`).
- Concatenación.

**Conclusiones clave:**
Usa `int` para números enteros, `double` para decimales y `String` para texto: `int edad = 15;`.

**Video:**
*Enlace de YouTube pendiente de publicación.*

**Práctica:**
*Enlace precargado pendiente.* Mientras tanto, abre [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) y pega el archivo inicial de la lección. 👈 **¡No necesitas registrarte!**

**Código fuente:**

- [Starter Files](starter-files/lesson-02)
- [Completed Example](completed-examples/lesson-02)

**Consejo clave:**
Para que una división tenga decimales, al menos uno de los números debe ser decimal: `/ 3.0`.

### Lección 3: Decisiones y bucles (10 minutos)

**Descripción:**
Haz que tu programa tome decisiones con `if` y `else` y que repita tareas con los bucles `for` y `while`.

**Objetivos de aprendizaje:**

- Tomar decisiones con `if`, `else if` y `else`.
- Comparar valores con `>`, `>=`, `<`, `<=`, `==` y `!=`.
- Repetir instrucciones un número conocido de veces con `for`.
- Repetir instrucciones mientras se cumpla una condición con `while`.

**Conceptos clave:**

- Condición.
- `if`, `else if` y `else`.
- Operadores de comparación.
- Bucle `for`.
- Bucle `while`.

**Conclusiones clave:**
`if (nota >= 11) { ... }` decide; `for (int i = 1; i <= 10; i++) { ... }` repite.

**Video:**
*Enlace de YouTube pendiente de publicación.*

**Práctica:**
*Enlace precargado pendiente.* Mientras tanto, abre [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) y pega el archivo inicial de la lección. 👈 **¡No necesitas registrarte!**

**Código fuente:**

- [Starter Files](starter-files/lesson-03)
- [Completed Example](completed-examples/lesson-03)

**Consejo clave:**
Un `while` necesita algo que cambie dentro del bucle; si no, nunca termina.

### Lección 4: Métodos y entrada de datos (10 minutos)

**Descripción:**
Agrupa instrucciones en métodos que puedes reutilizar y pide datos al usuario con `Scanner` para que el programa responda.

**Objetivos de aprendizaje:**

- Crear métodos con parámetros.
- Devolver un resultado con `return`.
- Leer texto y números con `Scanner`.
- Combinar métodos y entrada para resolver un problema.

**Conceptos clave:**

- Método.
- Parámetro.
- `return`.
- `Scanner`, `nextLine()` y `nextInt()`.
- Reutilizar código.

**Conclusiones clave:**
`public static double calcularPromedio(int a, int b, int c)` recibe datos y devuelve un resultado.

**Video:**
*Enlace de YouTube pendiente de publicación.*

**Práctica:**
*Enlace precargado pendiente.* Mientras tanto, abre [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) y pega el archivo inicial de la lección. 👈 **¡No necesitas registrarte!**

**Código fuente:**

- [Starter Files](starter-files/lesson-04)
- [Completed Example](completed-examples/lesson-04)

**Consejo clave:**
Escribe la entrada en la consola de OnlineGDB y presiona Enter después de cada dato.

### Lección 5: Clases y objetos (10 minutos)

**Descripción:**
Da tu primer paso en la programación orientada a objetos: crea la clase `Estudiante` con sus atributos, su constructor y sus métodos.

**Objetivos de aprendizaje:**

- Explicar la diferencia entre una clase y un objeto.
- Definir atributos y métodos en una clase.
- Escribir un constructor y usar `this`.
- Crear objetos con `new` y llamar a sus métodos.

**Conceptos clave:**

- Programación orientada a objetos.
- Clase y objeto.
- Atributo.
- Constructor y `this`.
- `new`.

**Conclusiones clave:**
La clase es el molde y cada objeto es una copia con sus propios datos: `new Estudiante("Ana", 14, 17.5)`.

**Video:**
*Enlace de YouTube pendiente de publicación.*

**Práctica:**
*Enlace precargado pendiente.* Mientras tanto, abre [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) y pega el archivo inicial de la lección. 👈 **¡No necesitas registrarte!**

**Código fuente:**

- [Starter Files](starter-files/lesson-05)
- [Completed Example](completed-examples/lesson-05)

**Consejo clave:**
El constructor se llama igual que la clase y no lleva tipo de retorno.

### Lección 6: Encapsulación y proyecto final: registro de estudiantes (12 minutos)

**Descripción:**
Protege los datos de tus objetos con `private`, getters y setters, guárdalos en un arreglo y construye un registro de estudiantes que encuentra la mejor nota.

**Objetivos de aprendizaje:**

- Proteger atributos con `private`.
- Escribir getters y setters con validación.
- Guardar varios objetos en un arreglo y recorrerlo.
- Usar métodos de `String` como `toUpperCase()`.
- Construir un programa completo con clases, arreglos y entrada de datos.

**Conceptos clave:**

- Encapsulación.
- `private`, getters y setters.
- Arreglos (`Estudiante[]`).
- Recorrer un arreglo con `for`.
- Métodos de `String`.

**Conclusiones clave:**
Encapsular es esconder los datos y dejar que cambien solo por métodos que los validan.

**Video:**
*Enlace de YouTube pendiente de publicación.*

**Práctica:**
*Enlace precargado pendiente.* Mientras tanto, abre [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) y pega el archivo inicial de la lección. 👈 **¡No necesitas registrarte!**

**Código fuente:**

- [Starter Files](starter-files/lesson-06)
- [Completed Example](completed-examples/lesson-06)

**Consejo clave:**
Los arreglos empiezan en la posición 0: el primer estudiante es `registro[0]`.

### Lección 7: Consejos, errores comunes y próximos pasos (5 minutos)

**Descripción:**
Conviértete en detective de errores: encuentra y corrige cinco errores en un programa, aprende a leer los mensajes del compilador y descubre dónde seguir aprendiendo.

**Objetivos de aprendizaje:**

- Leer un mensaje de error y encontrar la línea que lo causa.
- Corregir los errores más comunes de principiantes.
- Ordenar el código con indentación, comentarios y buenos nombres.
- Conocer recursos gratuitos para seguir aprendiendo Java.

**Conceptos clave:**

- Mensaje de error.
- Punto y coma.
- Mayúsculas y minúsculas.
- Tipos que no coinciden.
- Llaves sin cerrar.

**Conclusiones clave:**
Si algo falla, lee el mensaje de error: casi siempre dice la línea y qué falta.

**Video:**
*Enlace de YouTube pendiente de publicación.*

**Práctica:**
*Enlace precargado pendiente.* Mientras tanto, abre [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) y pega el archivo inicial de la lección. 👈 **¡No necesitas registrarte!**

**Código fuente:**

- [Starter Files](starter-files/lesson-07)
- [Completed Example](completed-examples/lesson-07)

**Consejo clave:**
Corrige un error a la vez y vuelve a ejecutar: a veces un solo error provoca varios mensajes.

## Recursos adicionales

- **Código fuente completo:** [Repositorio de GitHub](https://github.com/Team-Coworkers/java-fundamentals-course-team-coworkers)
- **Editor en línea:** [OnlineGDB](https://www.onlinegdb.com/online_java_compiler)
- **Todas las actividades prácticas:**

| Lección # | Actividad | Empezar a programar |
| --- | --- | --- |
| 1 | Lección 1: ¿Qué es programar y qué es Java? | *Pendiente* |
| 2 | Lección 2: Variables, tipos de datos y operadores | *Pendiente* |
| 3 | Lección 3: Decisiones y bucles | *Pendiente* |
| 4 | Lección 4: Métodos y entrada de datos | *Pendiente* |
| 5 | Lección 5: Clases y objetos | *Pendiente* |
| 6 | Lección 6: Encapsulación y proyecto final: registro de estudiantes | *Pendiente* |
| 7 | Lección 7: Consejos, errores comunes y próximos pasos | *Pendiente* |

- **Para seguir aprendiendo:**
  - [Documentación oficial de Java (Oracle)](https://docs.oracle.com/en/java/)
  - [Tutoriales de Java de Oracle (Dev.java)](https://dev.java/learn/)
- **Compartir:** #JavaBeginners

**¡Gracias por completar el curso!**

---

## 👥 Elaboración

**Universidad Peruana de Ciencias Aplicadas**
Carrera de Ingeniería de Software · Período 202620
1ASI0729 Desarrollo de Aplicaciones Open Source · NRC 7737

| | |
| --- | --- |
| 🏷️ **Equipo** | Team Coworkers |
| 👑 **Líder** | José Antonio Santana Luna |
| 📅 **Fecha de entrega** | *Pendiente* |

**Integrantes:**

| Integrante | Rol |
| --- | --- |
| Cuba Vega, Darnell Yadir | Integrante |
| Flores Rios, Juan Diego | Integrante |
| Leon Naupari, Jorge Mateo | Integrante |
| Rudas Chavarria, Jose Gabriel | Integrante |
| Santana Luna, José Antonio | Líder de equipo |

---

<div align="center">

¡Gracias por completar el curso! · #JavaBeginners

</div>
