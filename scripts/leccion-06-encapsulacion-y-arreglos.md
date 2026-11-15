# Lección 6 de 7 — Encapsulación y arreglos de objetos

| Dato | Detalle |
|------|---------|
| **Duración objetivo** | ~9 minutos |
| **Editor en línea** | **OnlineGDB** — https://www.onlinegdb.com (Language: **Java**) |
| **Responsable** | _[pendiente]_ |
| **Hilo conductor del curso** | Pixel, una mascota virtual que construimos lección a lección |
| **Presentación** | `leccion-06.pptx` |

**Objetivo:** que el estudiante proteja los atributos con `private`, use getters y setters con reglas, guarde varios objetos en un arreglo y recorra ese arreglo; además, que use métodos básicos de `String`.

> **Convenciones del guion**
> - 🎙️ **Narración** = voz en off. 🖥️ **En pantalla** = lo que se ve.
> - Tono cercano, frases cortas, sin jerga. No mencionar nombres de autores ni del equipo.

---

## Escena 1 — Repaso y gancho (0:00 – 0:40)

🖥️ **En pantalla:** Diapositiva 1 (portada) → diapositiva 2 (Rocky con "-500" en rojo, cara de susto).

🎙️ **Narración:**
> En la lección anterior creamos la clase `Mascota`... pero quedó un problema: desde afuera, cualquiera podía escribir `rocky.energia = -500`. Hoy vamos a resolverlo con un principio clave de la programación orientada a objetos: la **encapsulación**. Y después, ¡vamos a abrir un refugio con varias mascotas!

---

## Escena 2 — ¿Qué es encapsular? (0:40 – 1:40)

🖥️ **En pantalla:** Diapositiva 3 (analogía: cajero automático. No puedes meter la mano a la caja fuerte; usas botones con reglas).

🎙️ **Narración:**
> Piensa en un cajero automático. El dinero está ahí adentro, pero no puedes meter la mano y sacarlo. Tienes que usar los **botones**, y el cajero aplica **reglas**: no te deja sacar más de lo que tienes.
> Encapsular es lo mismo: **escondemos** los datos dentro del objeto y solo dejamos tocarlos a través de métodos que **ponen reglas**.

---

## Escena 3 — private, getters y setters (1:40 – 4:00)

🖥️ **En pantalla:** Diapositiva 4 (tabla). Editor, escribir la clase poco a poco.

🎙️ **Narración:**
> Paso uno: marcamos los atributos como `private`, que significa "privado". Ahora solo el código **dentro** de la clase `Mascota` puede tocarlos.
> Pero si son privados, ¿cómo los leemos desde afuera? Con un **getter**: un método que solo **devuelve** el valor. Por convención se llama `get` más el nombre del atributo: `getNombre`, `getEnergia`.
> ¿Y para cambiarlos? Con un **setter**: un método que recibe el nuevo valor y, antes de guardarlo, **revisa las reglas**. Se llama `set` más el nombre: `setEnergia`.
> Nuestra regla: si te piden menos de 0, guarda 0. Si te piden más de 100, guarda 100. Si no, guarda el valor tal cual.
> Fíjate que los métodos ahora llevan `public`: son los "botones" que dejamos usar desde afuera.
> Y el método `jugar` también usa el setter. Así, aunque Pixel juegue muchísimo, su energía nunca baja de 0.

| Pieza | ¿Qué hace? | Ejemplo |
|-------|-----------|---------|
| `private` | Esconde el atributo | `private int energia;` |
| Getter | **Lee** el valor | `public int getEnergia()` |
| Setter | **Cambia** el valor con reglas | `public void setEnergia(int energia)` |

---

## Escena 4 — Probar la protección (4:00 – 4:50)

🖥️ **En pantalla:** Editor. Quitar las barras `//` de la línea `pixel.energia = -500;` y ejecutar para mostrar el error. Volver a comentarla y ejecutar.

🎙️ **Narración:**
> Probemos. Si intento escribir `pixel.energia = -500` directamente... ¡Java no me deja! Me dice que `energia` es privada.
> En cambio, si uso `setEnergia(-500)`, el setter aplica la regla y guarda 0. Pixel está a salvo.

---

## Escena 5 — Un arreglo de objetos: el refugio (4:50 – 6:40)

🖥️ **En pantalla:** Diapositiva 5 (una fila de 3 casilleros numerados 0, 1, 2 con Pixel, Rocky y Luna). Editor, escribir y ejecutar.

🎙️ **Narración:**
> Ahora, ¿cómo guardamos **muchas** mascotas sin crear una variable para cada una? Con un **arreglo**: una fila de casilleros, todos del mismo tipo.
> `Mascota[] refugio = new Mascota[3];` crea un refugio con **3 casilleros** para mascotas. Los corchetes indican que es un arreglo.
> ¡Ojo con esto! Los casilleros se numeran desde **cero**. El primero es `refugio[0]`, el segundo `refugio[1]` y el tercero `refugio[2]`.
> En cada casillero ponemos una mascota nueva. Y podemos pedirle cosas a cada una: Rocky juega, y a Luna le ponemos 90 de energía.
> Para mostrar a todas usamos el `for` de la lección 3. Empezamos en 0 y seguimos mientras `i` sea menor que `refugio.length`, que es el **tamaño** del arreglo. Así, si mañana el refugio tiene 50 mascotas, el `for` funciona igual.

🖥️ **Texto sobreimpreso:** "Los arreglos empiezan en la posición 0"

---

## Escena 6 — Trabajando con texto (String) (6:40 – 7:20)

🖥️ **En pantalla:** Diapositiva 6 (tabla de métodos de String). Resaltar las últimas líneas del código.

🎙️ **Narración:**
> Por último, un regalo: los textos, o `String`, también son objetos, ¡y traen métodos listos para usar!
> `toUpperCase()` convierte a mayúsculas. `length()` te dice cuántas letras tiene. Y `charAt(0)` te da la letra en la posición 0, o sea, la primera. Sí, ¡los textos también empiezan a contar desde cero!

| Método | Qué hace | `"Luna"` da... |
|--------|----------|----------------|
| `toUpperCase()` | Pasa a mayúsculas | `"LUNA"` |
| `length()` | Cuenta las letras | `4` |
| `charAt(0)` | Letra en la posición 0 | `'L'` |
| `equals("Luna")` | Compara textos | `true` |

### Código de ejemplo completo

```java
class Mascota {
    // private: nadie de afuera puede tocar estos datos directamente
    private String nombre;
    private int energia;

    public Mascota(String nombre) {
        this.nombre = nombre;
        this.energia = 50;
    }

    // Getters: permiten LEER los datos
    public String getNombre() {
        return nombre;
    }

    public int getEnergia() {
        return energia;
    }

    // Setter: permite CAMBIAR un dato, pero con reglas
    public void setEnergia(int energia) {
        if (energia < 0) {
            this.energia = 0;
        } else if (energia > 100) {
            this.energia = 100;
        } else {
            this.energia = energia;
        }
    }

    public void jugar() {
        setEnergia(energia - 15);
    }
}

public class Main {
    public static void main(String[] args) {
        Mascota pixel = new Mascota("Pixel");
        // pixel.energia = -500;   // ERROR: energia es private
        pixel.setEnergia(-500);
        System.out.println(pixel.getNombre() + ": " + pixel.getEnergia());

        // Un arreglo de objetos: el refugio de mascotas
        Mascota[] refugio = new Mascota[3];
        refugio[0] = new Mascota("Pixel");
        refugio[1] = new Mascota("Rocky");
        refugio[2] = new Mascota("Luna");

        refugio[1].jugar();
        refugio[2].setEnergia(90);

        System.out.println("--- Mascotas del refugio ---");
        for (int i = 0; i < refugio.length; i++) {
            Mascota m = refugio[i];
            System.out.println((i + 1) + ". " + m.getNombre() + " - energía: " + m.getEnergia());
        }

        // Trabajando con cadenas de texto (String)
        String nombre = refugio[2].getNombre();
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.length() + " letras");
        System.out.println("Empieza con: " + nombre.charAt(0));
    }
}
```

**Salida esperada:**

```
Pixel: 0
--- Mascotas del refugio ---
1. Pixel - energía: 50
2. Rocky - energía: 35
3. Luna - energía: 90
LUNA
4 letras
Empieza con: L
```

---

## Escena 7 — Error común: salirse del arreglo (7:20 – 7:40)

🖥️ **En pantalla:** Escribir `refugio[3] = new Mascota("Toby");`, ejecutar y señalar el error `ArrayIndexOutOfBoundsException`. Luego borrar la línea.

🎙️ **Narración:**
> ¿Y si intento usar `refugio[3]`? ¡Error! El refugio tiene 3 casilleros, numerados 0, 1 y 2. La posición 3 no existe. Este error es tan común que tiene nombre propio: "índice fuera de los límites".

---

## Escena 8 — ¡Pausa! Tu turno (7:40 – 8:30)

🖥️ **En pantalla:** Diapositiva 7 ("¡Pausa! Tu turno").

🎙️ **Narración:**
> Pausa el video y abre el enlace de la descripción.
> Primero: agrega a la clase el atributo privado `especie`, con su getter.
> Segundo: crea un refugio con **4** mascotas y, con un `for`, muestra solo las que tienen **más de 40** de energía. Pista: usa un `if` dentro del `for`.

### Código de práctica (archivo inicial para el enlace de OnlineGDB)

```java
class Mascota {
    private String nombre;
    private int energia;
    // Reto 1: agrega el atributo privado especie (y recíbelo en el constructor)

    public Mascota(String nombre) {
        this.nombre = nombre;
        this.energia = 50;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia < 0) {
            this.energia = 0;
        } else if (energia > 100) {
            this.energia = 100;
        } else {
            this.energia = energia;
        }
    }

    // Reto 1: crea getEspecie()

}

public class Main {
    public static void main(String[] args) {
        // Reto 2: crea un refugio con 4 mascotas
        Mascota[] refugio = new Mascota[4];


        // Cambia la energía de algunas con setEnergia(...)


        // Muestra solo las que tienen más de 40 de energía (for + if)

    }
}
```

---

## Escena 9 — Cierre y adelanto (8:30 – 9:00)

🖥️ **En pantalla:** Diapositiva 8 (resumen y "Próxima lección").

🎙️ **Narración:**
> Hoy aprendiste a **encapsular**: atributos `private`, getters para leer y setters con reglas para cambiar. También guardaste objetos en un **arreglo**, lo recorriste con `for`, y usaste métodos de `String`.
> Ya tienes todas las piezas. En la última lección vamos a juntarlas para construir **tu propia mascota virtual interactiva**, ¡un juego completo! ¡Nos vemos!

---

## Checklist antes de subir el video

- [ ] Grabación en 1080p, zoom del navegador al 125–150 %.
- [ ] Mostrar en vivo el error de acceso a un atributo `private`.
- [ ] Texto sobreimpreso: "Los arreglos empiezan en la posición 0".
- [ ] Enlace de OnlineGDB con el código de práctica en la descripción.
- [ ] Sin nombres de autores, logotipos ni referencias al equipo.
- [ ] Subido a YouTube como **No listado**.
