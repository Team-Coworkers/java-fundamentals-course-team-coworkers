# Fundamentos de Java para Principiantes

Curso introductorio de programación con Java para estudiantes de secundaria de 12 a 17 años
sin experiencia previa. Son 7 lecciones cortas en video, de unos 60 minutos en total. El hilo
conductor es **Pixel**, una mascota virtual que construimos lección a lección: empieza con un
"¡Hola, mundo!" y termina como un juego completo con clases y objetos.

**¡No necesitas instalar nada!** Todo el curso se hace en el navegador con OnlineGDB, un editor
de Java en línea, gratuito y sin registro.

- **Plan del curso:** [`course-plan.md`](course-plan.md)
- **Repositorio:** https://github.com/Team-Coworkers/java-fundamentals-course-team-coworkers

## Lecciones

| # | Lección | Duración | Video |
| --- | --- | :---: | --- |
| 1 | ¿Qué es programar y por qué Java? | 6 min | [Ver](https://youtu.be/7pbnH-DSjmo) |
| 2 | Variables, tipos de datos y operadores | 8 min | [Ver](https://youtu.be/P8Lg9PE7bDM) |
| 3 | Decisiones y repeticiones | 9 min | [Ver](https://youtu.be/vsmA4ss_Gww) |
| 4 | Métodos y entrada/salida | 9 min | [Ver](https://youtu.be/5EPGH9D_-34) |
| 5 | Mi primera clase: clases y objetos | 10 min | [Ver](https://youtu.be/kx1MyhD9aTo) |
| 6 | Encapsulación y arreglos de objetos | 9 min | [Ver](https://youtu.be/ssbrFCMCgRg) |
| 7 | Proyecto final: Mi Mascota Virtual + buenas prácticas | 10 min | [Ver](https://youtu.be/j1xIFB9m4b8) |

## Tecnologías

- Java

## Herramientas

- [OnlineGDB](https://www.onlinegdb.com/online_java_compiler): editor de Java en línea, gratuito y sin registro.
- GitHub: código fuente del curso.
- YouTube: videos de las lecciones (no listados).

## Cómo usar los archivos de una lección

1. Abre [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) en Chrome, Firefox, Safari o Edge.
2. Revisa que en **Language**, arriba a la derecha, esté seleccionado **Java**.
3. Abre el archivo `starter-files/lesson-XX/Main.java` de la lección y copia todo su contenido.
4. Borra el código de ejemplo del editor y pega el archivo.
5. Completa los retos indicados en los comentarios y pulsa **Run**. La salida aparece en la consola.
6. Si el programa pide datos (lecciones 4 y 7), haz clic en la consola, escribe cada dato y pulsa **Enter**.
7. Compara tu resultado con `completed-examples/lesson-XX/Main.java`.

Cada lección cabe en un solo archivo `Main.java`, así que también funciona en JDoodle o Replit.
En la lección 7, el archivo inicial es el proyecto completo de la mascota virtual, listo para
que lo mejores con los retos del video.

### Ejecutar en tu computadora (opcional)

Si ya tienes Java 17 o superior instalado:

```bash
cd completed-examples/lesson-01
javac Main.java
java Main
```

## Estructura del repositorio

- `starter-files/`: archivo inicial de la práctica de cada lección (el código del enlace de OnlineGDB).
- `completed-examples/`: código de ejemplo completo que se muestra en cada video.
- `scripts/`: guiones de los videos, con escenas, narración y lo que se ve en pantalla.
- `course-plan.md`: plan general del curso con los videos y las prácticas.

| Lección | Archivo inicial | Ejemplo terminado | Guion |
| --- | --- | --- | --- |
| 1 | `starter-files/lesson-01/Main.java` | `completed-examples/lesson-01/Main.java` | `scripts/leccion-01-que-es-programar-y-java.md` |
| 2 | `starter-files/lesson-02/Main.java` | `completed-examples/lesson-02/Main.java` | `scripts/leccion-02-variables-tipos-operadores.md` |
| 3 | `starter-files/lesson-03/Main.java` | `completed-examples/lesson-03/Main.java` | `scripts/leccion-03-decisiones-y-bucles.md` |
| 4 | `starter-files/lesson-04/Main.java` | `completed-examples/lesson-04/Main.java` | `scripts/leccion-04-metodos-entrada-salida.md` |
| 5 | `starter-files/lesson-05/Main.java` | `completed-examples/lesson-05/Main.java` | `scripts/leccion-05-clases-y-objetos.md` |
| 6 | `starter-files/lesson-06/Main.java` | `completed-examples/lesson-06/Main.java` | `scripts/leccion-06-encapsulacion-y-arreglos.md` |
| 7 | `starter-files/lesson-07/Main.java` | `completed-examples/lesson-07/Main.java` | `scripts/leccion-07-proyecto-final-y-buenas-practicas.md` |
