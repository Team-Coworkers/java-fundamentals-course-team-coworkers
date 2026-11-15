# Fundamentos de Java para Principiantes

Curso introductorio de programación con Java para estudiantes de secundaria de 12 a 17 años
sin experiencia previa. Son 7 lecciones cortas en video, de unos 60 minutos en total, que van
desde el primer programa hasta la programación orientada a objetos.

**¡No necesitas instalar nada!** Todo el curso se hace en el navegador con un editor de Java
en línea y gratuito.

- **Plan del curso:** [`course-plan.md`](course-plan.md)
- **Repositorio:** https://github.com/Team-Coworkers/java-fundamentals-course-team-coworkers

## Tecnologías

- Java

## Herramientas

- [OnlineGDB](https://www.onlinegdb.com/online_java_compiler): editor de Java en línea, gratuito y sin registro.
- GitHub: código fuente del curso.
- YouTube: videos de las lecciones (no listados).

## Cómo usar los archivos de una lección

1. Abre [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) en Chrome, Firefox, Safari o Edge.
2. Revisa que en **Language**, arriba a la derecha, esté seleccionado **Java**.
3. Abre en este repositorio el archivo `starter-files/lesson-XX/Main.java` de la lección y copia todo su contenido.
4. Borra el código de ejemplo del editor y pega el archivo.
5. Completa los pasos indicados en los comentarios y pulsa **Run**. La salida aparece abajo.
6. Si el programa pide datos (lecciones 4 y 6), escríbelos en la consola y pulsa **Enter** después de cada uno.
7. Compara tu resultado con `completed-examples/lesson-XX/Main.java`.

Cada lección cabe en un solo archivo `Main.java`, así que también funciona en JDoodle o Replit.
El archivo inicial de la lección 7 tiene cinco errores a propósito: el reto es encontrarlos.

### Ejecutar en tu computadora (opcional)

Si ya tienes Java 17 o superior instalado:

```bash
cd completed-examples/lesson-01
javac Main.java
java Main
```

## Estructura del repositorio

- `starter-files/`: archivos iniciales de las prácticas, con los pasos en comentarios.
- `completed-examples/`: ejemplos terminados de cada lección.
- `scripts/`: guiones de los videos de cada lección.
- `course-plan.md`: plan general del curso con los videos y las prácticas.

| Lección | Tema | Archivo inicial | Ejemplo terminado | Guion |
| --- | --- | --- | --- | --- |
| 1 | ¿Qué es programar y qué es Java? | `starter-files/lesson-01` | `completed-examples/lesson-01` | `scripts/lesson-01-hello-java.md` |
| 2 | Variables, tipos de datos y operadores | `starter-files/lesson-02` | `completed-examples/lesson-02` | `scripts/lesson-02-variables-operators.md` |
| 3 | Decisiones y bucles | `starter-files/lesson-03` | `completed-examples/lesson-03` | `scripts/lesson-03-decisions-loops.md` |
| 4 | Métodos y entrada de datos | `starter-files/lesson-04` | `completed-examples/lesson-04` | `scripts/lesson-04-methods-input.md` |
| 5 | Clases y objetos | `starter-files/lesson-05` | `completed-examples/lesson-05` | `scripts/lesson-05-classes-objects.md` |
| 6 | Encapsulación y proyecto final: registro de estudiantes | `starter-files/lesson-06` | `completed-examples/lesson-06` | `scripts/lesson-06-encapsulation-project.md` |
| 7 | Consejos, errores comunes y próximos pasos | `starter-files/lesson-07` | `completed-examples/lesson-07` | `scripts/lesson-07-tips-next-steps.md` |
