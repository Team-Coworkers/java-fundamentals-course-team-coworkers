# Lección 2: Variables, tipos de datos y operadores

## Información

- **Duración estimada:** 8 minutos
- **Público objetivo:** Estudiantes de 12 a 17 años
- **Nivel:** Principiante
- **Prerrequisitos:** Lección 1
- **Herramientas:** Navegador web y OnlineGDB
- **Archivos:** `starter-files/lesson-02/Main.java` y `completed-examples/lesson-02/Main.java`

## Objetivos de aprendizaje

Al finalizar esta lección, el estudiante podrá:

- Declarar variables con un tipo, un nombre y un valor.
- Diferenciar `int`, `double`, `String` y `boolean`.
- Usar los operadores `+`, `-`, `*`, `/` y `%`.
- Unir texto y valores con `+` al mostrarlos.

---

# Guion

## 1. ¿Qué es una variable?

**Duración aproximada:** 0:00 - 1:20

**En pantalla:** Animación de cajas con etiquetas: nombre, edad, estatura. Luego el código String nombre = "Ana";

### Narración

Imagina una caja con una etiqueta. Dentro guardas algo y, por la etiqueta, sabes qué es.

Eso es una **variable**: un espacio con nombre donde el programa guarda un dato.

En Java le decimos qué tipo de dato guarda, cómo se llama y qué valor tiene.

---

## 2. Tipos de datos

**Duración aproximada:** 1:20 - 3:30

**En pantalla:** Escribir en OnlineGDB las cuatro variables del ejemplo y una tabla en pantalla con int, double, String y boolean.

### Narración

`int` guarda números enteros, como tu edad: `int edad = 14;`.

`double` guarda números con decimales, como tu estatura: `double estatura = 1.58;`.

`String` guarda texto, siempre entre comillas: `String nombre = "Ana";`.

Y `boolean` guarda verdadero o falso: `true` o `false`.

---

## 3. Mostrar variables

**Duración aproximada:** 3:30 - 4:30

**En pantalla:** Escribir System.out.println("Nombre: " + nombre); y ejecutar.

### Narración

Para mostrar una variable la ponemos dentro de `println`.

Con el signo **+** unimos texto y valores. Eso se llama **concatenar**.

---

## 4. Operadores

**Duración aproximada:** 4:30 - 7:00

**En pantalla:** Calcular edad + 5, el promedio de tres notas y el reparto de caramelos con / y %.

### Narración

Java sabe sumar, restar, multiplicar y dividir: `+`, `-`, `*` y `/`.

Para el promedio de 15, 17 y 18 sumamos y dividimos entre **3.0**. Si dividiéramos entre 3, Java quitaría los decimales.

Fíjate que Java muestra muchos decimales. No es un error: es el resultado exacto de la división.

Y el operador `%` nos da el **resto**: si repartes 17 caramelos entre 5 amigos, sobran 2.

---

## 5. Tu turno

**Duración aproximada:** 7:00 - 8:00

**En pantalla:** Texto en pantalla: "⏸ Pausa el video". Archivo inicial de la lección 2.

### Narración

Pausa el video y crea tus propias variables con tus datos.

Después calcula cuántos años tendrás dentro de 5 años.

En la próxima lección haremos que el programa tome decisiones.
