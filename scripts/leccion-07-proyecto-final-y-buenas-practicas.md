# Lección 7 de 7 — Proyecto final: Mi Mascota Virtual + buenas prácticas

| Dato | Detalle |
|------|---------|
| **Duración objetivo** | ~10 minutos |
| **Editor en línea** | **OnlineGDB** — https://www.onlinegdb.com (Language: **Java**) |
| **Responsable** | _[pendiente]_ |
| **Hilo conductor del curso** | Pixel, una mascota virtual que construimos lección a lección |
| **Presentación** | `leccion-07.pptx` |

**Objetivo:** que el estudiante integre todo lo aprendido (variables, decisiones, bucles, métodos, `Scanner`, clases, encapsulación) en un programa interactivo, y conozca buenas prácticas y errores comunes.

> **Convenciones del guion**
> - 🎙️ **Narración** = voz en off. 🖥️ **En pantalla** = lo que se ve.
> - Tono cercano, frases cortas, sin jerga. No mencionar nombres de autores ni del equipo.

---

## Escena 1 — Gancho: el resultado final (0:00 – 0:50)

🖥️ **En pantalla:** Diapositiva 1 (portada). Luego, directamente, OnlineGDB ejecutando el programa terminado: poner nombre, jugar, ver estado, dormir, salir.

🎙️ **Narración:**
> ¡Llegamos a la última lección! Mira lo que vamos a construir hoy: una mascota virtual a la que le pones nombre, le das de comer, juegas con ella, la mandas a dormir y ves cómo se siente.
> Y lo mejor: ya conoces **todas** las piezas que necesitamos. Solo hay que juntarlas.

---

## Escena 2 — El plan: ¿qué piezas usamos? (0:50 – 1:40)

🖥️ **En pantalla:** Diapositiva 2 (mapa de piezas: cada concepto con el número de lección donde se aprendió).

🎙️ **Narración:**
> Antes de programar, un buen programador **planifica**. Necesitamos:
> - Una **clase** `Mascota`, con atributos privados: nombre, energía y felicidad. Eso es de las lecciones 5 y 6.
> - **Métodos** para comer, jugar, dormir y mostrar el estado. Lección 4.
> - **Decisiones** con `if` para que la mascota reaccione. Lección 3.
> - Un **menú** que se repita con `while` hasta que el usuario elija salir. También lección 3.
> - Y `Scanner` para leer lo que elige el usuario. Lección 4.

| Pieza | Dónde la aprendimos |
|-------|---------------------|
| Variables y operadores | Lección 2 |
| `if` / `else`, `while` | Lección 3 |
| Métodos y `Scanner` | Lección 4 |
| Clases, objetos, constructor | Lección 5 |
| `private`, getters | Lección 6 |

---

## Escena 3 — Construir la clase Mascota (1:40 – 3:40)

🖥️ **En pantalla:** Editor. Escribir la clase, explicando cada método. Resaltar `limitar`.

🎙️ **Narración:**
> Empezamos por la clase. Tres atributos privados: nombre, energía y felicidad. El constructor pone energía y felicidad en 50.
> Ahora un truco nuevo: el método `limitar`. Recibe cualquier número y lo deja entre 0 y 100. Así no repetimos esa regla en cada método. Fíjate que es `private`: es una herramienta **interna** de la clase, nadie de afuera necesita usarla.
> `comer` suma 20 de energía. `jugar` tiene una condición: si la mascota tiene menos de 15 de energía, está muy cansada y no juega. Si no, pierde energía pero gana felicidad. Y `dormir` recarga toda la energía, aunque se aburre un poquito.
> `mostrarEstado` muestra los números y, con `if`, decide si la mascota está muy feliz, tranquila o aburrida.

---

## Escena 4 — El menú interactivo (3:40 – 5:20)

🖥️ **En pantalla:** Editor, escribir el `main`. Diapositiva 3 (diagrama de flujo del menú: mostrar opciones → leer → ejecutar → ¿opción 5? → no → repetir).

🎙️ **Narración:**
> Ahora el `main`. Primero preguntamos el nombre y creamos la mascota con `new`.
> Luego, el corazón del juego: un `while` que se repite **mientras la opción sea distinta de 5**. En cada vuelta mostramos el menú, leemos la opción con `nextInt` y, con `if` y `else if`, llamamos al método que corresponde.
> Si el usuario escribe un número que no está en el menú, le avisamos que la opción no es válida. Pensar en lo que puede salir mal también es parte de programar bien.
> Y cuando elige 5, se despide... y el `while` termina.

### Código del proyecto final

```java
import java.util.Scanner;

class Mascota {
    private String nombre;
    private int energia;
    private int felicidad;

    public Mascota(String nombre) {
        this.nombre = nombre;
        this.energia = 50;
        this.felicidad = 50;
    }

    public String getNombre() {
        return nombre;
    }

    // Mantiene cualquier valor entre 0 y 100
    private int limitar(int valor) {
        if (valor < 0) {
            return 0;
        }
        if (valor > 100) {
            return 100;
        }
        return valor;
    }

    public void comer() {
        energia = limitar(energia + 20);
        System.out.println(nombre + " comió. ¡Ñam!");
    }

    public void jugar() {
        if (energia < 15) {
            System.out.println(nombre + " está muy cansado para jugar.");
        } else {
            energia = limitar(energia - 15);
            felicidad = limitar(felicidad + 20);
            System.out.println(nombre + " jugó contigo. ¡Qué divertido!");
        }
    }

    public void dormir() {
        energia = 100;
        felicidad = limitar(felicidad - 5);
        System.out.println(nombre + " durmió una siesta. Zzz...");
    }

    public void mostrarEstado() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Energía:   " + energia + "/100");
        System.out.println("Felicidad: " + felicidad + "/100");
        if (felicidad >= 80) {
            System.out.println("Estado: ¡Muy feliz! :D");
        } else if (felicidad >= 40) {
            System.out.println("Estado: Tranquilo :)");
        } else {
            System.out.println("Estado: Aburrido :(");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ponle nombre a tu mascota: ");
        String nombre = teclado.nextLine();
        Mascota mascota = new Mascota(nombre);

        int opcion = 0;
        while (opcion != 5) {
            System.out.println();
            System.out.println("1. Dar de comer");
            System.out.println("2. Jugar");
            System.out.println("3. Dormir");
            System.out.println("4. Ver estado");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            if (opcion == 1) {
                mascota.comer();
            } else if (opcion == 2) {
                mascota.jugar();
            } else if (opcion == 3) {
                mascota.dormir();
            } else if (opcion == 4) {
                mascota.mostrarEstado();
            } else if (opcion == 5) {
                System.out.println("¡Adiós! " + mascota.getNombre() + " te extrañará.");
            } else {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
        teclado.close();
    }
}
```

**Ejemplo de partida** (entradas: `Pixel`, `2`, `2`, `4`, `5`):

```
Ponle nombre a tu mascota: Pixel

1. Dar de comer
...
Elige una opción: 2
Pixel jugó contigo. ¡Qué divertido!
...
Elige una opción: 2
Pixel jugó contigo. ¡Qué divertido!
...
Elige una opción: 4
=== Pixel ===
Energía:   20/100
Felicidad: 90/100
Estado: ¡Muy feliz! :D
...
Elige una opción: 5
¡Adiós! Pixel te extrañará.
```

---

## Escena 5 — Probar el juego (5:20 – 6:00)

🖥️ **En pantalla:** Ejecutar en OnlineGDB y jugar una partida corta: jugar tres veces seguidas hasta que aparezca "está muy cansado para jugar", luego dormir, luego ver estado, luego escribir 9 (opción no válida) y salir con 5.

🎙️ **Narración:**
> Probemos todos los caminos: si jugamos muchas veces, la mascota se cansa. Si la mandamos a dormir, recupera la energía. Si escribimos un 9, nos avisa que no es válido. ¡Todo funciona!
> Probar **todos los casos**, no solo el que esperas, es un hábito de buen programador.

---

## Escena 6 — Buenas prácticas (6:00 – 7:20)

🖥️ **En pantalla:** Diapositiva 4 (cinco buenas prácticas con íconos).

🎙️ **Narración:**
> Antes de despedirnos, cinco buenas prácticas que te van a servir siempre:
> 1. **Nombres claros.** `energia` dice mucho más que `e` o `x`. Las variables y métodos empiezan en minúscula, como `mostrarEstado`, y las clases en mayúscula, como `Mascota`.
> 2. **Ordena tu código con sangría.** Lo que está dentro de unas llaves va un poco más a la derecha. Así ves de un vistazo qué está dentro de qué.
> 3. **Comenta lo importante.** Con dos barras puedes dejar notas para ti o para otros. Explica el **por qué**, no lo obvio.
> 4. **Avanza de a poco.** Escribe unas líneas y ejecuta. Si algo falla, sabes que el error está en lo último que escribiste.
> 5. **Lee los mensajes de error.** No te asustes: casi siempre te dicen qué pasó y en qué línea.

---

## Escena 7 — Errores comunes de principiantes (7:20 – 8:40)

🖥️ **En pantalla:** Diapositiva 5 (tabla de errores con ❌ y ✅).

🎙️ **Narración:**
> Y estos son los errores más comunes al empezar. Si te pasan, ¡tranquilo, le pasan a todos!
> - Olvidar el **punto y coma** al final de una instrucción.
> - Confundir **un** igual, que guarda, con **dos** iguales, que comparan.
> - Escribir `string` con minúscula: es `String`, con **S mayúscula**. Java distingue mayúsculas de minúsculas.
> - Abrir una **llave** y olvidar cerrarla.
> - Usar una posición que no existe en un arreglo. Recuerda: se empieza a contar desde **cero**.
> - Y uno muy tramposo: para comparar **textos**, no uses dos iguales. Usa el método `equals`. Por ejemplo: `nombre.equals("Pixel")`.

| ❌ Error | ✅ Correcto |
|---------|-----------|
| `System.out.println("Hola")` | `System.out.println("Hola");` |
| `if (energia = 100)` | `if (energia == 100)` |
| `string nombre = "Pixel";` | `String nombre = "Pixel";` |
| `refugio[3]` en un arreglo de 3 | `refugio[2]` es el último |
| `if (nombre == "Pixel")` | `if (nombre.equals("Pixel"))` |

---

## Escena 8 — ¡Pausa! Tu turno: mejora tu mascota (8:40 – 9:20)

🖥️ **En pantalla:** Diapositiva 6 ("¡Pausa! Tu turno").

🎙️ **Narración:**
> Ahora es tu juego. Pausa el video, abre el enlace de la descripción y elige al menos uno de estos retos:
> - Agrega una opción **"Bañar"** que suba la felicidad en 10.
> - Agrega un atributo **hambre** que suba cada vez que juega y baje cuando come.
> - O el reto más grande: crea un **refugio** con un arreglo de 3 mascotas y pregunta al inicio con cuál quieres jugar.

### Código de práctica

El enlace de OnlineGDB de esta lección contiene el **código del proyecto final completo** (el de arriba), listo para que el estudiante lo modifique.

---

## Escena 9 — Cierre del curso y próximos pasos (9:20 – 10:00)

🖥️ **En pantalla:** Diapositiva 7 (resumen de las 7 lecciones + próximos pasos).

🎙️ **Narración:**
> ¡Felicidades! Completaste el curso. Empezaste sin saber qué era programar, y hoy construiste un juego con clases, objetos, métodos, decisiones y bucles. Eso es programación orientada a objetos de verdad.
> ¿Y ahora qué? Sigue practicando: inventa tus propios programas, como un juego de adivinanzas o una lista de tareas. Y si quieres aprender más, la página oficial **dev.java** tiene tutoriales gratuitos para seguir avanzando.
> Recuerda: todo programador experto alguna vez escribió su primer "Hola, mundo". ¡Gracias por llegar hasta aquí, y a seguir programando!

---

## Checklist antes de subir el video

- [ ] Grabación en 1080p, zoom del navegador al 125–150 %.
- [ ] Mostrar el juego funcionando al inicio (gancho) y probar todos los caminos.
- [ ] Texto sobreimpreso en las buenas prácticas y en la tabla de errores.
- [ ] Enlace de OnlineGDB con el proyecto completo en la descripción.
- [ ] Sin nombres de autores, logotipos ni referencias al equipo.
- [ ] Subido a YouTube como **No listado**.
