# Lección 4 de 7 — Métodos y entrada/salida

| Dato | Detalle |
|------|---------|
| **Duración objetivo** | ~9 minutos |
| **Editor en línea** | **OnlineGDB** — https://www.onlinegdb.com (Language: **Java**) |
| **Responsable** | _[pendiente]_ |
| **Hilo conductor del curso** | Pixel, una mascota virtual que construimos lección a lección |
| **Presentación** | `leccion-04.pptx` |

**Objetivo:** que el estudiante cree métodos con y sin parámetros, use `return` para devolver resultados y lea datos del teclado con `Scanner`.

> **Convenciones del guion**
> - 🎙️ **Narración** = voz en off. 🖥️ **En pantalla** = lo que se ve.
> - Tono cercano, frases cortas, sin jerga. No mencionar nombres de autores ni del equipo.

---

## Escena 1 — Repaso y gancho (0:00 – 0:40)

🖥️ **En pantalla:** Diapositiva 1 (portada) → diapositiva 2 (un control remoto con botones "Saludar", "Alimentar").

🎙️ **Narración:**
> Hasta ahora nuestro programa hace todo de arriba hacia abajo, y siempre con los mismos datos. Hoy vamos a cambiar dos cosas.
> Primero, vamos a crear **métodos**: como botones de un control remoto que puedes presionar las veces que quieras.
> Y segundo, el programa va a **preguntarte cosas** y usar lo que escribas con el teclado.

---

## Escena 2 — ¿Qué es un método? (0:40 – 2:00)

🖥️ **En pantalla:** Diapositiva 3 (anatomía de un método con flechas: nombre, paréntesis, llaves). Luego el editor, escribir `saludar()`.

🎙️ **Narración:**
> Un método es un **bloque de código con nombre**. Lo escribes una vez y lo **llamas** cuando lo necesites.
> Aquí creamos el método `saludar`. Va **fuera** del `main`, pero dentro de la clase `Main`.
> Las palabras `public static void` por ahora las escribimos así; `void` significa que este método **no devuelve** ningún resultado, solo hace algo.
> Para usarlo, dentro del `main` escribimos su nombre con paréntesis: `saludar();`. Eso se llama **llamar** al método.

🖥️ **Acción:** Llamar `saludar();` dos veces y ejecutar para mostrar que se repite el mensaje.

🖥️ **Texto sobreimpreso:** "Los métodos se nombran con verbos: `saludar`, `alimentar`, `presentar`"

---

## Escena 3 — Métodos con parámetros (2:00 – 3:00)

🖥️ **En pantalla:** Diapositiva 4. Editor, escribir `presentar(String nombre)`.

🎙️ **Narración:**
> A veces queremos que el método trabaje con un dato distinto cada vez. Para eso usamos **parámetros**: datos que le pasamos al método entre los paréntesis.
> El método `presentar` recibe un `String` llamado `nombre`. Si lo llamo con "Pixel", dice "Te presento a Pixel". Si lo llamo con "Rocky", dice "Te presento a Rocky". El mismo botón, con distinta información.

---

## Escena 4 — Métodos que devuelven un resultado (3:00 – 4:30)

🖥️ **En pantalla:** Diapositiva 5 (una "máquina" que recibe energía y comida, y devuelve nueva energía). Editor, escribir `alimentar`.

🎙️ **Narración:**
> Hay métodos que, además de recibir datos, **devuelven un resultado**. Son como una máquina: entra algo, sale algo.
> El método `alimentar` recibe la energía actual y la cantidad de comida, calcula la nueva energía y la **devuelve** con la palabra `return`.
> Fíjate que en vez de `void` escribimos `int`: eso indica que el método devuelve un número entero.
> Y le pusimos una regla: si la energía pasa de 100, se queda en 100. Así Pixel nunca tiene más energía de la permitida.
> Al llamarlo, guardamos lo que devuelve en una variable: `energia = alimentar(energia, comida);`.

---

## Escena 5 — Leer del teclado con Scanner (4:30 – 6:30)

🖥️ **En pantalla:** Diapositiva 6 (tres pasos: importar, crear, leer). Editor, completar el `main` y ejecutar. Hacer clic en la consola y escribir las respuestas.

🎙️ **Narración:**
> Ahora, la parte divertida: que el programa **te pregunte** cosas. Para eso usamos una herramienta de Java llamada `Scanner`. Son tres pasos:
> 1. Arriba de todo, antes de la clase, escribimos `import java.util.Scanner;`. Esto le dice a Java que vamos a usar esa herramienta.
> 2. Dentro del `main`, creamos el lector: `Scanner teclado = new Scanner(System.in);`. `System.in` significa "lo que entra por el teclado".
> 3. Y leemos: `teclado.nextLine()` lee una línea de **texto**, y `teclado.nextInt()` lee un **número entero**.
> Fíjate que para la pregunta usamos `print`, sin "ln". Así el cursor se queda en la misma línea y la respuesta aparece al lado de la pregunta.
> Ejecutamos... En OnlineGDB hacemos clic en la consola de abajo, escribimos el nombre y presionamos Enter. Luego la cantidad de comida... ¡y el programa usa nuestras respuestas!
> Al final cerramos el lector con `teclado.close()`, como quien apaga la luz al salir.

| Para leer... | Usa | Ejemplo |
|--------------|-----|---------|
| Texto (una línea) | `nextLine()` | `String nombre = teclado.nextLine();` |
| Número entero | `nextInt()` | `int comida = teclado.nextInt();` |
| Número con decimales | `nextDouble()` | `double peso = teclado.nextDouble();` |

### Código de ejemplo completo

```java
import java.util.Scanner;

public class Main {

    // Método sin parámetros: solo realiza una acción
    public static void saludar() {
        System.out.println("¡Bienvenido al mundo de las mascotas virtuales!");
    }

    // Método con un parámetro
    public static void presentar(String nombre) {
        System.out.println("Te presento a " + nombre + ".");
    }

    // Método que recibe datos y devuelve un resultado
    public static int alimentar(int energia, int comida) {
        int nuevaEnergia = energia + comida;
        if (nuevaEnergia > 100) {
            nuevaEnergia = 100;
        }
        return nuevaEnergia;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        saludar();

        System.out.print("¿Cómo se llama tu mascota? ");
        String nombre = teclado.nextLine();
        presentar(nombre);

        System.out.print("¿Cuánta comida le das (1 a 50)? ");
        int comida = teclado.nextInt();

        int energia = 40;
        energia = alimentar(energia, comida);
        System.out.println(nombre + " ahora tiene " + energia + " de energía.");

        teclado.close();
    }
}
```

**Ejemplo de ejecución** (lo que escribe el usuario está después de cada `?`):

```
¡Bienvenido al mundo de las mascotas virtuales!
¿Cómo se llama tu mascota? Pixel
Te presento a Pixel.
¿Cuánta comida le das (1 a 50)? 30
Pixel ahora tiene 70 de energía.
```

---

## Escena 6 — Error común: escribir texto donde se espera un número (6:30 – 7:00)

🖥️ **En pantalla:** Ejecutar y responder "mucha" a la pregunta de la comida. Señalar el error `InputMismatchException`.

🎙️ **Narración:**
> ¿Qué pasa si a la pregunta de la comida respondo con una palabra, como "mucha"? El programa se detiene con un error, porque `nextInt` esperaba un número. Por ahora, recuerda siempre decirle al usuario qué tipo de respuesta esperas, como hicimos con "1 a 50".

---

## Escena 7 — ¡Pausa! Tu turno (7:00 – 8:20)

🖥️ **En pantalla:** Diapositiva 7 ("¡Pausa! Tu turno").

🎙️ **Narración:**
> Pausa el video y abre el enlace de la descripción. Crea un método llamado `jugar` que reciba la energía, le reste 15 y devuelva el resultado. Pero ojo: si el resultado es menor que 0, debe devolver 0.
> Luego, en el `main`, pregunta con `Scanner` cuántas veces quieres jugar con tu mascota, y usa un `for` para llamar a `jugar` esa cantidad de veces. ¡Así repasas también la lección anterior!

### Código de práctica (archivo inicial para el enlace de OnlineGDB)

```java
import java.util.Scanner;

public class Main {

    // Crea aquí el método jugar(int energia):
    // resta 15 y devuelve el resultado (nunca menor que 0)


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int energia = 100;

        System.out.print("¿Cuántas veces quieres jugar? ");
        int veces = teclado.nextInt();

        // Usa un for para llamar a jugar(energia) 'veces' veces


        System.out.println("Energía final: " + energia);
        teclado.close();
    }
}
```

---

## Escena 8 — Cierre y adelanto (8:20 – 9:00)

🖥️ **En pantalla:** Diapositiva 8 (resumen y "Próxima lección").

🎙️ **Narración:**
> Hoy aprendiste a crear métodos, a pasarles parámetros, a devolver resultados con `return` y a leer datos del teclado con `Scanner`.
> Pero fíjate en algo: los datos de Pixel están sueltos por todo el programa. ¿Y si tuviéramos diez mascotas? En la próxima lección vamos a dar el gran salto: la **programación orientada a objetos**, ¡y crearemos el molde de una mascota! ¡Nos vemos!

---

## Checklist antes de subir el video

- [ ] Grabación en 1080p, zoom del navegador al 125–150 %.
- [ ] Mostrar claramente cómo escribir en la consola de OnlineGDB.
- [ ] Texto sobreimpreso en los tres pasos de `Scanner`.
- [ ] Enlace de OnlineGDB con el código de práctica en la descripción.
- [ ] Sin nombres de autores, logotipos ni referencias al equipo.
- [ ] Subido a YouTube como **No listado**.
