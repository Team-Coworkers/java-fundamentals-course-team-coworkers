# Fundamentos de Java para Principiantes

## Resumen del Curso

Este curso de 1 hora introduce a estudiantes de secundaria a los fundamentos de la
programación con Java, incluida la programación orientada a objetos. El hilo conductor es
**Pixel**, una mascota virtual que construimos lección a lección: primero le damos datos,
luego aprende a decidir y a repetir, después la convertimos en una clase con sus propios
métodos y, al final, en un juego interactivo. Cada lección termina con una pausa para
practicar en un editor en línea. **¡No requiere descargas!** Solo abre tu navegador web.

**Duración total:** ~61 minutos
**Público objetivo:** Estudiantes de 12 a 17 años sin experiencia en programación
**Prerrequisitos:** Ninguno
**Herramientas necesarias:** **¡Solo tu navegador web!** (Chrome, Firefox, Safari, Edge)
**Editor en línea:** [OnlineGDB](https://www.onlinegdb.com/online_java_compiler), gratuito y sin registro

**📂 Repositorio de Código Fuente:** [https://github.com/Team-Coworkers/java-fundamentals-course-team-coworkers](https://github.com/Team-Coworkers/java-fundamentals-course-team-coworkers)

## Secuencia de Lecciones

### Lección 1: ¿Qué es programar y por qué Java? (6 minutos)

**Descripción:**
Qué es programar, por qué empezar con Java y cómo ejecutar el primer programa en el navegador, sin instalar nada. Aquí conocemos a Pixel, la mascota virtual que construiremos durante el curso.

**Objetivos de aprendizaje:**

- Explicar qué es un programa y qué es un lenguaje de programación.
- Reconocer por qué Java es un buen lenguaje para empezar.
- Usar OnlineGDB: el editor, el botón Run y la consola.
- Escribir y ejecutar el programa "¡Hola, mundo!".

**Conceptos clave:**

- Programa.
- Lenguaje de programación.
- Java.
- `public class Main` y `main`.
- `System.out.println`.
- Punto y coma y llaves.

**Conclusiones clave:**
Un programa es una lista de instrucciones; `System.out.println("...");` muestra un texto en la consola.

**Video:**
[Ver Lección 1 en YouTube](https://www.youtube.com/watch?v=_Uq5HfIYQLQ)

**Práctica:**
Abre [OnlineGDB](https://www.onlinegdb.com/online_java_compiler), elige **Java** en *Language* y pega el [archivo inicial](starter-files/lesson-01/Main.java) de la lección. 👈 **¡No necesitas registrarte!**

**Reto de la pausa:**
Cambiar el saludo para que diga tu nombre y agregar una línea con tu comida favorita.

**Código fuente:**

- [Starter Files](starter-files/lesson-01)
- [Completed Example](completed-examples/lesson-01)
- [Guion del video](scripts/leccion-01-que-es-programar-y-java.md)

**Consejo clave:**
Si olvidas el punto y coma, Java te avisa con un error y te dice en qué línea está.

### Lección 2: Variables, tipos de datos y operadores (8 minutos)

**Descripción:**
Pixel recibe sus primeros datos: aprendemos a guardarlos en variables, a distinguir los tipos `int`, `double`, `String` y `boolean`, y a calcular y comparar con operadores.

**Objetivos de aprendizaje:**

- Declarar variables con la forma `tipo nombre = valor;`.
- Distinguir `int`, `double`, `String` y `boolean`.
- Calcular con `+`, `-`, `*`, `/` y `%`.
- Comparar valores con `>`, `<`, `>=`, `<=`, `==` y `!=`.

**Conceptos clave:**

- Variable.
- Tipos `int`, `double`, `String` y `boolean`.
- Concatenación con `+`.
- División entera y módulo (`%`).
- Operadores de comparación.

**Conclusiones clave:**
`int` para enteros, `double` para decimales, `String` para texto y `boolean` para verdadero o falso.

**Video:**
[Ver Lección 2 en YouTube](https://youtu.be/P8Lg9PE7bDM)

**Práctica:**
Abre [OnlineGDB](https://www.onlinegdb.com/online_java_compiler), elige **Java** en *Language* y pega el [archivo inicial](starter-files/lesson-02/Main.java) de la lección. 👈 **¡No necesitas registrarte!**

**Reto de la pausa:**
Crear las variables de tu propia mascota y calcular su edad en días.

**Código fuente:**

- [Starter Files](starter-files/lesson-02)
- [Completed Example](completed-examples/lesson-02)
- [Guion del video](scripts/leccion-02-variables-tipos-operadores.md)

**Consejo clave:**
`"Suma: " + 2 + 3` muestra "Suma: 23"; usa paréntesis para sumar primero: `"Suma: " + (2 + 3)`.

### Lección 3: Decisiones y repeticiones (9 minutos)

**Descripción:**
Pixel aprende a reaccionar y a repetir acciones: tomamos decisiones con `if`, `else if` y `else`, combinamos condiciones con `&&` y `||`, y repetimos con `for` y `while`.

**Objetivos de aprendizaje:**

- Tomar decisiones con `if`, `else if` y `else`.
- Combinar condiciones con `&&` (y) y `||` (o).
- Repetir un número conocido de veces con `for`.
- Repetir mientras se cumpla una condición con `while`.

**Conceptos clave:**

- Condición.
- `if`, `else if` y `else`.
- `&&` y `||`.
- Bucle `for` (inicio; condición; avance).
- Bucle `while` y bucle infinito.

**Conclusiones clave:**
Java revisa las condiciones de arriba hacia abajo y entra solo en la primera que es verdadera.

**Video:**
[Ver Lección 3 en YouTube](https://youtu.be/vsmA4ss_Gww)

**Práctica:**
Abre [OnlineGDB](https://www.onlinegdb.com/online_java_compiler), elige **Java** en *Language* y pega el [archivo inicial](starter-files/lesson-03/Main.java) de la lección. 👈 **¡No necesitas registrarte!**

**Reto de la pausa:**
Hacer una cuenta regresiva del 10 al 1 con `for` y un saludo según la hora con `if`.

**Código fuente:**

- [Starter Files](starter-files/lesson-03)
- [Completed Example](completed-examples/lesson-03)
- [Guion del video](scripts/leccion-03-decisiones-y-bucles.md)

**Consejo clave:**
Un signo igual guarda (`energia = 100`) y dos signos igual comparan (`energia == 100`).

### Lección 4: Métodos y entrada/salida (9 minutos)

**Descripción:**
Ordenamos el código en métodos que funcionan como botones de un control remoto, y el programa empieza a conversar: lee lo que escribes con `Scanner`.

**Objetivos de aprendizaje:**

- Crear métodos sin parámetros y con parámetros.
- Devolver un resultado con `return`.
- Leer texto y números del teclado con `Scanner`.
- Diferenciar `print` y `println`.

**Conceptos clave:**

- Método.
- Parámetro.
- `void` y `return`.
- `Scanner`, `nextLine()`, `nextInt()` y `nextDouble()`.
- `import java.util.Scanner;`.

**Conclusiones clave:**
Un método se escribe una vez y se llama las veces que haga falta: `energia = alimentar(energia, comida);`.

**Video:**
[Ver Lección 4 en YouTube](https://youtu.be/5EPGH9D_-34)

**Práctica:**
Abre [OnlineGDB](https://www.onlinegdb.com/online_java_compiler), elige **Java** en *Language* y pega el [archivo inicial](starter-files/lesson-04/Main.java) de la lección. 👈 **¡No necesitas registrarte!**

**Reto de la pausa:**
Crear el método `jugar` que nunca deje la energía bajo 0 y llamarlo con un `for` las veces que pida el usuario.

**Código fuente:**

- [Starter Files](starter-files/lesson-04)
- [Completed Example](completed-examples/lesson-04)
- [Guion del video](scripts/leccion-04-metodos-entrada-salida.md)

**Consejo clave:**
Si `nextInt()` recibe una palabra, el programa se detiene: indica siempre qué tipo de respuesta esperas.

### Lección 5: Mi primera clase: clases y objetos (10 minutos)

**Descripción:**
El gran salto a la programación orientada a objetos: creamos la clase `Mascota` como un molde, con sus atributos, su constructor y sus métodos, y hacemos varias mascotas con `new`.

**Objetivos de aprendizaje:**

- Explicar la diferencia entre clase (molde) y objeto (galleta).
- Definir atributos (lo que tiene) y métodos (lo que hace).
- Escribir un constructor y usar `this`.
- Crear objetos con `new` y llamar a sus métodos con un punto.

**Conceptos clave:**

- Programación orientada a objetos.
- Clase y objeto.
- Atributos y métodos.
- Constructor y `this`.
- `new`.

**Conclusiones clave:**
Cada objeto guarda sus propios datos: lo que le pasa a Pixel no le pasa a Rocky.

**Video:**
[Ver Lección 5 en YouTube](https://youtu.be/kx1MyhD9aTo)

**Práctica:**
Abre [OnlineGDB](https://www.onlinegdb.com/online_java_compiler), elige **Java** en *Language* y pega el [archivo inicial](starter-files/lesson-05/Main.java) de la lección. 👈 **¡No necesitas registrarte!**

**Reto de la pausa:**
Agregar el atributo `edad`, crear el método `dormir()` y una tercera mascota propia.

**Código fuente:**

- [Starter Files](starter-files/lesson-05)
- [Completed Example](completed-examples/lesson-05)
- [Guion del video](scripts/leccion-05-clases-y-objetos.md)

**Consejo clave:**
En OnlineGDB todo va en un archivo: solo la clase `Main` lleva `public`.

### Lección 6: Encapsulación y arreglos de objetos (9 minutos)

**Descripción:**
Protegemos los datos de las mascotas con `private`, getters y setters con reglas, abrimos un refugio con un arreglo de objetos y usamos métodos de `String`.

**Objetivos de aprendizaje:**

- Proteger atributos con `private`.
- Leer con getters y cambiar con setters que aplican reglas.
- Guardar objetos en un arreglo y recorrerlo con `for` y `length`.
- Usar `toUpperCase()`, `length()`, `charAt()` y `equals()`.

**Conceptos clave:**

- Encapsulación.
- `private` y `public`.
- Getters y setters.
- Arreglos de objetos (`Mascota[]`).
- Métodos de `String`.

**Conclusiones clave:**
Encapsular es esconder los datos y dejarlos cambiar solo con métodos que ponen reglas.

**Video:**
[Ver Lección 6 en YouTube](https://youtu.be/ssbrFCMCgRg)

**Práctica:**
Abre [OnlineGDB](https://www.onlinegdb.com/online_java_compiler), elige **Java** en *Language* y pega el [archivo inicial](starter-files/lesson-06/Main.java) de la lección. 👈 **¡No necesitas registrarte!**

**Reto de la pausa:**
Agregar el atributo privado `especie` con su getter y mostrar solo las mascotas del refugio con más de 40 de energía.

**Código fuente:**

- [Starter Files](starter-files/lesson-06)
- [Completed Example](completed-examples/lesson-06)
- [Guion del video](scripts/leccion-06-encapsulacion-y-arreglos.md)

**Consejo clave:**
Los arreglos empiezan en la posición 0: en un arreglo de 3, `refugio[3]` no existe.

### Lección 7: Proyecto final: Mi Mascota Virtual + buenas prácticas (10 minutos)

**Descripción:**
Juntamos todo lo aprendido en un juego interactivo: una mascota virtual a la que das de comer, con la que juegas y a la que mandas a dormir desde un menú. Cerramos con buenas prácticas y los errores más comunes.

**Objetivos de aprendizaje:**

- Planificar un programa identificando las piezas que necesita.
- Integrar clases, encapsulación, métodos, decisiones, bucles y `Scanner`.
- Construir un menú que se repite con `while`.
- Aplicar buenas prácticas y reconocer los errores comunes de principiantes.

**Conceptos clave:**

- Proyecto integrador.
- Método privado de apoyo (`limitar`).
- Menú con `while`.
- Validar opciones no válidas.
- Buenas prácticas y errores comunes.

**Conclusiones clave:**
Probar todos los casos, no solo el que esperas, es un hábito de buen programador.

**Video:**
[Ver Lección 7 en YouTube](https://youtu.be/j1xIFB9m4b8)

**Práctica:**
Abre [OnlineGDB](https://www.onlinegdb.com/online_java_compiler), elige **Java** en *Language* y pega el [archivo inicial](starter-files/lesson-07/Main.java) de la lección. 👈 **¡No necesitas registrarte!**

**Reto de la pausa:**
Agregar la opción "Bañar", un atributo `hambre` o un refugio de 3 mascotas para elegir con cuál jugar.

**Código fuente:**

- [Starter Files](starter-files/lesson-07)
- [Completed Example](completed-examples/lesson-07)
- [Guion del video](scripts/leccion-07-proyecto-final-y-buenas-practicas.md)

**Consejo clave:**
Para comparar textos no uses `==`: usa `equals`, por ejemplo `nombre.equals("Pixel")`.

## Recursos adicionales

- **Código fuente completo:** [Repositorio de GitHub](https://github.com/Team-Coworkers/java-fundamentals-course-team-coworkers)
- **Editor en línea:** [OnlineGDB](https://www.onlinegdb.com/online_java_compiler)
- **Todas las actividades prácticas:**

| Lección # | Actividad | Empezar a programar |
| --- | --- | --- |
| 1 | Lección 1: ¿Qué es programar y por qué Java? | [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) con el [archivo inicial](starter-files/lesson-01/Main.java) |
| 2 | Lección 2: Variables, tipos de datos y operadores | [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) con el [archivo inicial](starter-files/lesson-02/Main.java) |
| 3 | Lección 3: Decisiones y repeticiones | [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) con el [archivo inicial](starter-files/lesson-03/Main.java) |
| 4 | Lección 4: Métodos y entrada/salida | [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) con el [archivo inicial](starter-files/lesson-04/Main.java) |
| 5 | Lección 5: Mi primera clase: clases y objetos | [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) con el [archivo inicial](starter-files/lesson-05/Main.java) |
| 6 | Lección 6: Encapsulación y arreglos de objetos | [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) con el [archivo inicial](starter-files/lesson-06/Main.java) |
| 7 | Lección 7: Proyecto final: Mi Mascota Virtual + buenas prácticas | [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) con el [archivo inicial](starter-files/lesson-07/Main.java) |

- **Para seguir aprendiendo:** [dev.java](https://dev.java/learn/), el sitio oficial de aprendizaje de Java.
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
| 📅 **Fecha de entrega** | 14/11/2026 |

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
