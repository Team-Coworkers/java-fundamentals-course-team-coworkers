# Lección 5 de 7 — Mi primera clase: clases y objetos

| Dato | Detalle |
|------|---------|
| **Duración objetivo** | ~10 minutos |
| **Editor en línea** | **OnlineGDB** — https://www.onlinegdb.com (Language: **Java**) |
| **Responsable** | _[pendiente]_ |
| **Hilo conductor del curso** | Pixel, una mascota virtual que construimos lección a lección |
| **Presentación** | `leccion-05.pptx` |

**Objetivo:** que el estudiante entienda qué es la programación orientada a objetos (POO), cree una clase con atributos, constructor y métodos, y cree varios objetos a partir de ella.

> **Convenciones del guion**
> - 🎙️ **Narración** = voz en off. 🖥️ **En pantalla** = lo que se ve.
> - Tono cercano, frases cortas, sin jerga. No mencionar nombres de autores ni del equipo.

---

## Escena 1 — Repaso y gancho (0:00 – 0:50)

🖥️ **En pantalla:** Diapositiva 1 (portada) → diapositiva 2 (muchas variables sueltas: `nombre1`, `energia1`, `nombre2`, `energia2`... con cara de caos).

🎙️ **Narración:**
> Hasta ahora, los datos de Pixel estaban sueltos: una variable para el nombre, otra para la energía... Pero ¿qué pasa si queremos **diez** mascotas? Tendríamos `nombre1`, `nombre2`, `energia1`, `energia2`... ¡un desorden!
> Hoy vamos a aprender la forma en que los programadores profesionales organizan este tipo de problemas: la **programación orientada a objetos**, o POO.

---

## Escena 2 — La idea: molde y galletas (0:50 – 2:20)

🖥️ **En pantalla:** Diapositiva 3 (un molde de galletas = clase; varias galletas decoradas distinto = objetos). Diapositiva 4 (tabla "TIENE / HACE").

🎙️ **Narración:**
> Imagina un **molde** para hacer galletas. El molde no es una galleta: es el **diseño**. Con un mismo molde puedes hacer muchas galletas, y cada una puede tener una decoración distinta.
> En Java, el molde se llama **clase**, y cada galleta que haces con él se llama **objeto**.
> Para diseñar una clase nos hacemos dos preguntas:
> - ¿Qué **tiene** una mascota? Un nombre, una especie, una cantidad de energía. Eso son los **atributos**.
> - ¿Qué **hace** una mascota? Come, juega, muestra cómo está. Eso son los **métodos**.

| Pregunta | En POO se llama | En nuestra mascota |
|----------|-----------------|--------------------|
| ¿Qué **tiene**? | Atributos | `nombre`, `especie`, `energia` |
| ¿Qué **hace**? | Métodos | `comer()`, `jugar()`, `mostrarEstado()` |

---

## Escena 3 — Escribir la clase Mascota (2:20 – 4:30)

🖥️ **En pantalla:** Editor. Escribir la clase `Mascota` **arriba** de la clase `Main`, parte por parte.

🎙️ **Narración:**
> Escribimos `class Mascota`. Por convención, los nombres de clases empiezan con **mayúscula**.
> Nota: en OnlineGDB trabajamos todo en un solo archivo. Por eso, solo la clase `Main` lleva la palabra `public`; nuestra clase `Mascota` va sin ella.
> Dentro, primero los **atributos**: `String nombre`, `String especie`, `int energia`. Son variables, pero que pertenecen a cada mascota.
> Después, los **métodos**. Fíjate que aquí ya no escribimos `static`: estos métodos pertenecen a **cada mascota**, no al programa en general. Cuando Pixel come, sube la energía **de Pixel**, no la de otra mascota.

---

## Escena 4 — El constructor (4:30 – 5:50)

🖥️ **En pantalla:** Diapositiva 5 (constructor resaltado, flecha de "Pixel" → `this.nombre`). Editor, escribir el constructor.

🎙️ **Narración:**
> Ahora una pieza especial: el **constructor**. Es un método que se ejecuta **automáticamente** cada vez que creamos una mascota nueva. Sirve para darle sus datos iniciales.
> Se reconoce fácil: se llama **igual que la clase** y no lleva tipo de retorno, ni siquiera `void`.
> Nuestro constructor recibe el nombre y la especie, y además pone la energía inicial en 50.
> ¿Y qué es `this`? Significa "**esta** mascota". `this.nombre = nombre` se lee: "el nombre de esta mascota es el nombre que me pasaron". Lo usamos porque el parámetro y el atributo se llaman igual, y así Java sabe cuál es cuál.

---

## Escena 5 — Crear objetos y usarlos (5:50 – 7:30)

🖥️ **En pantalla:** Editor, escribir el `main` y ejecutar. Diapositiva 6 (dos tarjetas: Pixel y Rocky, cada una con su energía).

🎙️ **Narración:**
> Ya tenemos el molde. ¡Ahora hagamos galletas!
> Para crear un objeto usamos la palabra `new`: `Mascota pixel = new Mascota("Pixel", "gato");`. Así nace Pixel, un gato con 50 de energía.
> Y con el mismo molde creamos a Rocky, un perro.
> Para pedirle a un objeto que haga algo, usamos un **punto**: `pixel.comer(20)` significa "Pixel, come 20".
> Ejecutamos... Mira: Pixel comió y jugó, y quedó con 55. Rocky jugó dos veces y quedó con 20. **Cada objeto tiene sus propios datos**: lo que le pasa a Pixel no le pasa a Rocky.

### Código de ejemplo completo

```java
// La clase es el "molde" de una mascota
class Mascota {
    // Atributos: lo que la mascota TIENE
    String nombre;
    String especie;
    int energia;

    // Constructor: se ejecuta al crear una mascota nueva
    Mascota(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
        this.energia = 50;
    }

    // Métodos: lo que la mascota HACE
    void comer(int comida) {
        energia = energia + comida;
        System.out.println(nombre + " comió. Energía: " + energia);
    }

    void jugar() {
        energia = energia - 15;
        System.out.println(nombre + " jugó. Energía: " + energia);
    }

    void mostrarEstado() {
        System.out.println(nombre + " (" + especie + ") tiene " + energia + " de energía.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Objetos: mascotas creadas con el molde
        Mascota pixel = new Mascota("Pixel", "gato");
        Mascota rocky = new Mascota("Rocky", "perro");

        pixel.comer(20);
        pixel.jugar();
        rocky.jugar();
        rocky.jugar();

        pixel.mostrarEstado();
        rocky.mostrarEstado();

        // ¿Un problema? Cualquiera puede cambiar la energía sin reglas:
        rocky.energia = -500;
        rocky.mostrarEstado();
    }
}
```

**Salida esperada:**

```
Pixel comió. Energía: 70
Pixel jugó. Energía: 55
Rocky jugó. Energía: 35
Rocky jugó. Energía: 20
Pixel (gato) tiene 55 de energía.
Rocky (perro) tiene 20 de energía.
Rocky (perro) tiene -500 de energía.
```

---

## Escena 6 — El problema que resolveremos después (7:30 – 8:10)

🖥️ **En pantalla:** Resaltar en rojo las dos últimas líneas del `main` y la salida "-500".

🎙️ **Narración:**
> Pero mira estas últimas líneas. Desde afuera, cualquiera puede escribir `rocky.energia = -500`... y Java lo acepta. ¿Una mascota con energía negativa? ¡Eso no tiene sentido!
> Nuestra clase todavía no **protege** sus datos. Guarda este problema en tu mente, porque en la próxima lección lo vamos a resolver.

---

## Escena 7 — ¡Pausa! Tu turno (8:10 – 9:20)

🖥️ **En pantalla:** Diapositiva 7 ("¡Pausa! Tu turno").

🎙️ **Narración:**
> Pausa el video y abre el enlace de la descripción. Tienes tres retos:
> Primero, agrega a la clase un nuevo atributo, `int edad`, y recíbelo también en el constructor.
> Segundo, crea un método `dormir()` que ponga la energía en 100 y muestre "Zzz...".
> Y tercero, crea una **tercera mascota** con tu propio diseño y haz que coma, juegue y duerma.

### Código de práctica (archivo inicial para el enlace de OnlineGDB)

```java
class Mascota {
    String nombre;
    String especie;
    int energia;
    // Reto 1: agrega el atributo edad

    Mascota(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
        this.energia = 50;
    }

    void comer(int comida) {
        energia = energia + comida;
        System.out.println(nombre + " comió. Energía: " + energia);
    }

    void jugar() {
        energia = energia - 15;
        System.out.println(nombre + " jugó. Energía: " + energia);
    }

    // Reto 2: crea el método dormir()

}

public class Main {
    public static void main(String[] args) {
        Mascota pixel = new Mascota("Pixel", "gato");
        pixel.comer(10);

        // Reto 3: crea tu propia mascota y haz que coma, juegue y duerma

    }
}
```

---

## Escena 8 — Cierre y adelanto (9:20 – 10:00)

🖥️ **En pantalla:** Diapositiva 8 (resumen y "Próxima lección").

🎙️ **Narración:**
> Hoy diste el gran salto a la programación orientada a objetos. Aprendiste que una **clase** es un molde, que los **objetos** se crean con `new`, que los **atributos** son lo que tiene y los **métodos** lo que hace, y que el **constructor** le da sus datos iniciales.
> En la próxima lección vamos a **proteger** los datos de nuestras mascotas para que nadie pueda ponerles energía negativa, y vamos a crear un **refugio** con muchas mascotas a la vez. ¡Nos vemos!

---

## Checklist antes de subir el video

- [ ] Grabación en 1080p, zoom del navegador al 125–150 %.
- [ ] La analogía del molde se muestra con imagen en la diapositiva.
- [ ] Texto sobreimpreso: "Clase = molde · Objeto = galleta".
- [ ] Enlace de OnlineGDB con el código de práctica en la descripción.
- [ ] Sin nombres de autores, logotipos ni referencias al equipo.
- [ ] Subido a YouTube como **No listado**.
