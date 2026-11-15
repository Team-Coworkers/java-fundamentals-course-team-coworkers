# Lección 3 de 7 — Decisiones y repeticiones

| Dato | Detalle |
|------|---------|
| **Duración objetivo** | ~9 minutos |
| **Editor en línea** | **OnlineGDB** — https://www.onlinegdb.com (Language: **Java**) |
| **Responsable** | _[pendiente]_ |
| **Hilo conductor del curso** | Pixel, una mascota virtual que construimos lección a lección |
| **Presentación** | `leccion-03.pptx` |

**Objetivo:** que el estudiante use `if`, `else if` y `else` para tomar decisiones, combine condiciones con `&&` y `||`, y repita acciones con `for` y `while`.

> **Convenciones del guion**
> - 🎙️ **Narración** = voz en off. 🖥️ **En pantalla** = lo que se ve.
> - Tono cercano, frases cortas, sin jerga. No mencionar nombres de autores ni del equipo.

---

## Escena 1 — Repaso y gancho (0:00 – 0:40)

🖥️ **En pantalla:** Diapositiva 1 (portada) → diapositiva 2 (Pixel con cara de hambre y un signo de pregunta).

🎙️ **Narración:**
> Pixel ya tiene datos: nombre, edad y energía. Pero una mascota de verdad **reacciona**: si tiene hambre, te pide comida; si está llena de energía, quiere jugar.
> Hoy vamos a enseñarle a Pixel dos superpoderes: **tomar decisiones** y **repetir acciones**.

---

## Escena 2 — Decisiones con if y else (0:40 – 2:30)

🖥️ **En pantalla:** Diapositiva 3 (diagrama: ¿energía < 30? → Sí / No). Luego el editor, escribir el primer bloque.

🎙️ **Narración:**
> Para tomar decisiones usamos `if`, que en inglés significa "si".
> Se lee así: **si** la energía es menor que 30, muestra "Pixel tiene hambre".
> La condición va entre **paréntesis**, y lo que se hace va entre **llaves**.
> ¿Y si no se cumple? Usamos `else if`, que es "si no, si...", para revisar otra condición: si la energía es menor que 70, Pixel está bien.
> Y al final, `else`, que significa "si no": para todos los demás casos, Pixel está lleno de energía.
> Java revisa las condiciones **de arriba hacia abajo** y entra solo en la **primera** que sea verdadera.

🖥️ **Acción:** Ejecutar con `energia = 25`. Luego cambiar a `50` y ejecutar. Luego a `90` y ejecutar. Mostrar que el mensaje cambia.

🎙️ **Narración:**
> Mira: con 25 dice que tiene hambre. Si cambio a 50, dice que está bien. Y con 90, ¡está lleno de energía! El mismo código reacciona distinto según el dato.

---

## Escena 3 — Combinar condiciones: && y || (2:30 – 3:30)

🖥️ **En pantalla:** Diapositiva 4 (tabla de && y ||). Resaltar el segundo bloque del código.

🎙️ **Narración:**
> A veces necesitamos revisar **dos cosas a la vez**. Pixel quiere salir a jugar solo si es de día **y** tiene más de 20 de energía.
> El símbolo `&&` significa "y": las dos condiciones tienen que ser verdaderas.
> El símbolo `||` significa "o": basta con que **una** sea verdadera.

| Símbolo | Se lee | Es verdadero cuando... |
|---------|--------|------------------------|
| `&&` | "y" | **Ambas** condiciones son verdaderas |
| `\|\|` | "o" | **Al menos una** es verdadera |

---

## Escena 4 — Repetir con for (3:30 – 5:00)

🖥️ **En pantalla:** Diapositiva 5 (las tres partes del `for` con colores distintos). Luego el editor.

🎙️ **Narración:**
> Ahora, repetir. Imagina que Pixel tiene que dar 3 vueltas haciendo ejercicio. Podríamos escribir `println` tres veces... pero ¿y si fueran 100 vueltas?
> Para eso existe el bucle `for`. Se usa cuando **sabemos cuántas veces** queremos repetir algo. Tiene tres partes, separadas por punto y coma:
> - Primero, **dónde empieza**: `int vuelta = 1`.
> - Segundo, **hasta cuándo sigue**: mientras `vuelta <= 3`.
> - Tercero, **cómo avanza**: `vuelta++`, que significa "súmale 1 a vuelta".
> Así, el bloque se repite con vuelta igual a 1, 2 y 3. Cuando vuelta llega a 4, la condición ya es falsa y el bucle termina.

🖥️ **Texto sobreimpreso:** `for (inicio; condición; avance)`

---

## Escena 5 — Repetir con while (5:00 – 6:30)

🖥️ **En pantalla:** Diapositiva 6. Luego el editor, escribir el bloque `while` y ejecutar el programa completo.

🎙️ **Narración:**
> El otro bucle es `while`, que significa "mientras". Se usa cuando **no sabemos cuántas veces** se va a repetir, solo sabemos **hasta cuándo**.
> Mientras la energía de Pixel sea menor que 100, Pixel come y gana 25 de energía. Empieza en 25, luego 50, 75, y al llegar a 100 la condición es falsa y se detiene.
> ¡Muy importante! Dentro del `while` **algo tiene que cambiar**. Si olvidamos sumar la energía, la condición siempre sería verdadera y el programa se quedaría repitiendo para siempre. Eso se llama **bucle infinito**. Si te pasa en OnlineGDB, presiona el botón **Stop**.

### Código de ejemplo completo

```java
public class Main {
    public static void main(String[] args) {
        String nombre = "Pixel";
        int energia = 25;

        // Decisiones con if, else if y else
        if (energia < 30) {
            System.out.println(nombre + " tiene hambre. ¡Dale de comer!");
        } else if (energia < 70) {
            System.out.println(nombre + " está bien.");
        } else {
            System.out.println(nombre + " está lleno de energía.");
        }

        // Condiciones combinadas: && (y)  || (o)
        boolean esDeDia = true;
        if (esDeDia && energia > 20) {
            System.out.println(nombre + " quiere salir a jugar.");
        }

        // for: repetir un número conocido de veces
        System.out.println("--- Pixel hace ejercicio ---");
        for (int vuelta = 1; vuelta <= 3; vuelta++) {
            System.out.println("Vuelta número " + vuelta);
        }

        // while: repetir mientras la condición sea verdadera
        System.out.println("--- Hora de comer ---");
        while (energia < 100) {
            energia = energia + 25;
            System.out.println("Ñam ñam... energía: " + energia);
        }
        System.out.println(nombre + " ya está lleno.");
    }
}
```

**Salida esperada:**

```
Pixel tiene hambre. ¡Dale de comer!
Pixel quiere salir a jugar.
--- Pixel hace ejercicio ---
Vuelta número 1
Vuelta número 2
Vuelta número 3
--- Hora de comer ---
Ñam ñam... energía: 50
Ñam ñam... energía: 75
Ñam ñam... energía: 100
Pixel ya está lleno.
```

---

## Escena 6 — Error común: = contra == (6:30 – 7:10)

🖥️ **En pantalla:** Diapositiva 7 con las dos líneas comparadas.

🎙️ **Narración:**
> Un error que comete casi todo el mundo al empezar: confundir un signo igual con dos.
> **Un** signo igual **guarda** un valor: `energia = 100`.
> **Dos** signos igual **comparan**: `energia == 100` pregunta "¿la energía es 100?".
> Dentro de un `if`, casi siempre quieres comparar, así que usa dos.

---

## Escena 7 — ¡Pausa! Tu turno (7:10 – 8:20)

🖥️ **En pantalla:** Diapositiva 8 ("¡Pausa! Tu turno").

🎙️ **Narración:**
> Pausa el video y abre el enlace de la descripción. Tienes dos retos.
> Primero: haz una **cuenta regresiva** con `for`, del 10 al 1, y al final muestra "¡Despegue!". Pista: empieza en 10 y usa `numero--` para restar.
> Segundo: crea una variable `hora` y, con `if`, muestra "Buenos días" si es menor que 12, "Buenas tardes" si es menor que 19, y "Buenas noches" en los demás casos.

### Código de práctica (archivo inicial para el enlace de OnlineGDB)

```java
public class Main {
    public static void main(String[] args) {
        // Reto 1: cuenta regresiva del 10 al 1 con for
        // Pista: for (int numero = 10; numero >= 1; numero--)


        System.out.println("¡Despegue!");

        // Reto 2: saludo según la hora
        int hora = 15;
        // Escribe aquí tu if / else if / else

    }
}
```

---

## Escena 8 — Cierre y adelanto (8:20 – 9:00)

🖥️ **En pantalla:** Diapositiva 9 (resumen y "Próxima lección").

🎙️ **Narración:**
> Hoy Pixel aprendió a decidir con `if`, `else if` y `else`, a combinar condiciones con "y" y "o", y a repetir con `for` y `while`.
> En la próxima lección vamos a ordenar nuestro código en **métodos** y, por fin, ¡el programa va a **conversar contigo** y leer lo que escribes con el teclado! ¡Nos vemos!

---

## Checklist antes de subir el video

- [ ] Grabación en 1080p, zoom del navegador al 125–150 %.
- [ ] Mostrar el cambio de `energia` (25 → 50 → 90) en vivo en OnlineGDB.
- [ ] Texto sobreimpreso en las partes del `for` y en `&&` / `||`.
- [ ] Enlace de OnlineGDB con el código de práctica en la descripción.
- [ ] Sin nombres de autores, logotipos ni referencias al equipo.
- [ ] Subido a YouTube como **No listado**.
