# Lección 1 de 7 — ¿Qué es programar y por qué Java?

| Dato | Detalle |
|------|---------|
| **Duración objetivo** | ~6 minutos |
| **Editor en línea** | **OnlineGDB** — https://www.onlinegdb.com (Language: **Java**) |
| **Responsable** | _[pendiente]_ |
| **Hilo conductor del curso** | Pixel, una mascota virtual que construimos lección a lección |
| **Presentación** | `leccion-01.pptx` |

**Objetivo:** que el estudiante entienda qué es programar, por qué empezar con Java y ejecute su primer programa en el navegador, sin instalar nada.

> **Convenciones del guion**
> - 🎙️ **Narración** = voz en off (lo que se dice).
> - 🖥️ **En pantalla** = lo que se ve (diapositiva, editor, texto sobreimpreso).
> - Tono: cercano, frases cortas, sin jerga. Si se usa un término técnico, se explica en la misma frase.
> - No mencionar nombres de los autores ni del equipo, ni en voz ni en pantalla.

---

## Escena 1 — Gancho (0:00 – 0:30)

🖥️ **En pantalla:** Diapositiva 1 (portada). Luego diapositiva 2: íconos de videojuego, celular y banco.

🎙️ **Narración:**
> ¿Sabías que Minecraft, en su versión original, está hecho en Java? Y que muchas aplicaciones de Android, sistemas de bancos y hasta programas que usa la NASA también usan este lenguaje. En este curso vas a aprender a programar en Java desde cero... y lo mejor: sin instalar nada, solo con tu navegador.

---

## Escena 2 — ¿Qué es programar? (0:30 – 1:30)

🖥️ **En pantalla:** Diapositiva 3 — analogía de la receta (pasos numerados de "hacer un sándwich").

🎙️ **Narración:**
> Programar es darle instrucciones a una computadora. Es como escribir una receta: paso 1, saca el pan; paso 2, ponle queso; paso 3, cierra el sándwich.
> La diferencia es que la computadora es muy obediente, pero también muy literal: hace exactamente lo que le dices, ni más ni menos. Si te olvidas un paso, no lo adivina.
> A ese conjunto de instrucciones se le llama **programa**, y el idioma en que las escribimos es un **lenguaje de programación**.

🖥️ **Texto sobreimpreso:** "Programa = lista de instrucciones para la computadora"

---

## Escena 3 — ¿Qué es Java y por qué usarlo? (1:30 – 2:30)

🖥️ **En pantalla:** Diapositiva 4 — tres tarjetas: "Muy usado", "Funciona en muchos dispositivos", "Ordenado y claro".

🎙️ **Narración:**
> Java es uno de los lenguajes de programación más usados del mundo. Nació en 1995 y hoy lo mantiene la empresa Oracle.
> ¿Por qué empezar con Java? Primero, porque se usa en todas partes: apps, juegos, servidores. Segundo, porque un programa en Java funciona en muchos tipos de computadoras sin cambiarlo. Y tercero, porque Java te obliga a ser ordenado, y eso te va a ayudar con cualquier otro lenguaje que aprendas después.

---

## Escena 4 — Conociendo el editor en línea (2:30 – 3:20)

🖥️ **En pantalla:** Grabación del navegador.
1. Escribir `onlinegdb.com` en la barra de direcciones.
2. Señalar (con un círculo o flecha) el menú **Language** arriba a la derecha y elegir **Java**.
3. Señalar las tres zonas: el editor (arriba), el botón verde **Run** y la consola (abajo).

🎙️ **Narración:**
> Para programar vamos a usar OnlineGDB, un editor que funciona en el navegador. No necesitas crear una cuenta ni descargar nada.
> Entra a onlinegdb.com y, arriba a la derecha, en "Language", elige **Java**.
> Arriba está el editor, donde escribimos el código. El botón verde **Run** ejecuta el programa. Y abajo está la consola, donde aparecen los resultados.

🖥️ **Texto sobreimpreso:** "Sin cuenta · Sin descargas · Solo el navegador"

---

## Escena 5 — Tu primer programa: "¡Hola, mundo!" (3:20 – 4:50)

🖥️ **En pantalla:** Diapositiva 5 con el código; luego el editor. Escribir el código poco a poco (no pegarlo de golpe). Resaltar cada parte mientras se explica.

🎙️ **Narración:**
> Por tradición, el primer programa que todo el mundo escribe muestra el mensaje "Hola, mundo". Vamos a escribirlo.
> La primera línea, `public class Main`, crea una "caja" llamada Main donde vive nuestro programa. En OnlineGDB esta caja siempre se llama **Main**.
> La segunda línea, `public static void main`, marca el **punto de inicio**: aquí es donde Java empieza a leer. Por ahora no te preocupes por cada palabra; la vas a copiar así en todos tus programas.
> Y esta línea, `System.out.println`, significa "muestra este texto en la consola". El texto va entre comillas.
> Fíjate en dos detalles: cada instrucción termina en **punto y coma**, y las **llaves** abren y cierran bloques, como paréntesis gigantes.
> Le damos a **Run**... ¡y ahí está nuestro mensaje!

### Código de ejemplo

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");
        System.out.println("Estoy aprendiendo Java.");
    }
}
```

**Salida esperada:**

```
¡Hola, mundo!
Estoy aprendiendo Java.
```

### Mini demostración de error (15 segundos)

🖥️ **En pantalla:** Borrar el `;` de la línea 3 y presionar **Run**. Señalar el mensaje de error y el número de línea.

🎙️ **Narración:**
> ¿Qué pasa si olvido el punto y coma? Java me avisa con un error y me dice en qué línea está. Equivocarse es parte de programar: hasta los profesionales lo hacen todos los días. Lo importante es leer el mensaje y corregir.

---

## Escena 6 — ¡Pausa! Tu turno (4:50 – 5:30)

🖥️ **En pantalla:** Diapositiva 6 ("¡Pausa! Tu turno") con el ícono de pausa y el reto.

🎙️ **Narración:**
> Ahora te toca a ti. Pausa el video y abre el enlace del editor que está en la descripción. Cambia el mensaje para que te salude con tu nombre, y agrega una tercera línea que diga cuál es tu comida favorita. Cuando lo logres, vuelve al video.

**Reto:**
1. Cambiar `"¡Hola, mundo!"` por `"¡Hola, soy [tu nombre]!"`.
2. Agregar una tercera línea con tu comida favorita.

### Código de práctica (archivo inicial para el enlace de OnlineGDB)

```java
public class Main {
    public static void main(String[] args) {
        // 1. Cambia este mensaje para que diga tu nombre
        System.out.println("¡Hola, mundo!");

        // 2. Agrega aquí una línea con tu comida favorita

    }
}
```

---

## Escena 7 — Cierre y adelanto (5:30 – 6:00)

🖥️ **En pantalla:** Diapositiva 7 — resumen + presentación de Pixel (la mascota virtual).

🎙️ **Narración:**
> ¡Felicidades, ya escribiste tu primer programa en Java! Hoy aprendiste qué es programar, por qué Java y cómo usar un editor en línea.
> Durante este curso vamos a construir, paso a paso, una **mascota virtual** llamada Pixel. Al final tendrás un pequeño juego donde podrás darle de comer, jugar con ella y ver cómo se siente.
> En la próxima lección vamos a darle a Pixel sus primeros datos usando **variables**. ¡Nos vemos!

---

## Checklist antes de subir el video

- [ ] Grabación en 1080p, zoom del navegador al 125–150 % para que el código se lea bien.
- [ ] El código se escribe en pantalla y se ejecuta en OnlineGDB (no en otro editor).
- [ ] Texto sobreimpreso en los conceptos clave.
- [ ] Enlace de OnlineGDB con el código de práctica en la descripción (botón **Share** → copiar enlace).
- [ ] Sin nombres de autores, logotipos ni referencias al equipo.
- [ ] Subido a YouTube como **No listado**.
