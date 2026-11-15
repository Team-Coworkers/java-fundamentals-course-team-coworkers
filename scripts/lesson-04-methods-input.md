# Lección 4: Métodos y entrada de datos

## Información

- **Duración estimada:** 10 minutos
- **Público objetivo:** Estudiantes de 12 a 17 años
- **Nivel:** Principiante
- **Prerrequisitos:** Lección 3
- **Herramientas:** Navegador web y OnlineGDB
- **Archivos:** `starter-files/lesson-04/Main.java` y `completed-examples/lesson-04/Main.java`

## Objetivos de aprendizaje

Al finalizar esta lección, el estudiante podrá:

- Crear métodos con parámetros.
- Devolver un resultado con `return`.
- Leer texto y números con `Scanner`.
- Combinar métodos y entrada para resolver un problema.

---

# Guion

## 1. ¿Qué es un método?

**Duración aproximada:** 0:00 - 2:00

**En pantalla:** Escribir el método saludar y llamarlo dos veces desde main con nombres distintos.

### Narración

Un **método** es un grupo de instrucciones con nombre que podemos usar las veces que queramos.

Ya conoces uno: `main`. Ahora vamos a crear el nuestro, `saludar`.

Lo que va entre paréntesis es un **parámetro**: el dato que el método necesita para trabajar.

---

## 2. Métodos que devuelven un resultado

**Duración aproximada:** 2:00 - 4:00

**En pantalla:** Escribir calcularPromedio y resaltar la palabra double y la palabra return.

### Narración

Algunos métodos calculan algo y nos devuelven el resultado.

Esta palabra, `double`, indica qué tipo de dato devuelve.

Y con `return` entregamos el resultado a quien llamó al método.

---

## 3. Pedir datos con Scanner

**Duración aproximada:** 4:00 - 7:00

**En pantalla:** Escribir el import, crear el Scanner, leer el nombre con nextLine y las notas con nextInt. Escribir los datos en la consola.

### Narración

Hasta ahora los datos estaban escritos en el código. Ahora se los vamos a pedir al usuario.

Para eso usamos `Scanner`. Primero lo importamos en la primera línea del archivo.

Con `nextLine()` leemos un texto y con `nextInt()` un número entero.

Cuando ejecutamos, el programa espera. Escribimos el dato en la consola y presionamos Enter.

---

## 4. Todo junto

**Duración aproximada:** 7:00 - 8:30

**En pantalla:** Ejecutar el programa completo con un nombre y tres notas.

### Narración

Ahora el programa saluda a quien lo usa y calcula su promedio con el método que creamos.

Así funcionan las aplicaciones de verdad: reciben datos, los procesan y responden.

---

## 5. Tu turno

**Duración aproximada:** 8:30 - 10:00

**En pantalla:** Texto en pantalla: "⏸ Pausa el video". Archivo inicial de la lección 4.

### Narración

Pausa el video y completa los métodos `saludar` y `calcularPromedio`.

Luego pide tu nombre y tus notas, y muestra tu promedio.

En la próxima lección daremos el gran paso: crear nuestras propias clases y objetos.
