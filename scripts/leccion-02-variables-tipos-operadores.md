# Lección 2 de 7 — Variables, tipos de datos y operadores

| Dato | Detalle |
|------|---------|
| **Duración objetivo** | ~8 minutos |
| **Editor en línea** | **OnlineGDB** — https://www.onlinegdb.com (Language: **Java**) |
| **Responsable** | _[pendiente]_ |
| **Hilo conductor del curso** | Pixel, una mascota virtual que construimos lección a lección |
| **Presentación** | `leccion-02.pptx` |

**Objetivo:** que el estudiante guarde datos en variables, distinga los tipos `int`, `double`, `String` y `boolean`, y use operadores para calcular y comparar.

> **Convenciones del guion**
> - 🎙️ **Narración** = voz en off. 🖥️ **En pantalla** = lo que se ve.
> - Tono cercano, frases cortas, sin jerga. No mencionar nombres de autores ni del equipo.

---

## Escena 1 — Repaso y gancho (0:00 – 0:30)

🖥️ **En pantalla:** Diapositiva 1 (portada) → diapositiva 2 (Pixel con una "ficha" vacía: nombre, edad, peso, ¿hambre?).

🎙️ **Narración:**
> En la lección anterior escribimos nuestro primer programa. Hoy vamos a darle vida a Pixel, nuestra mascota virtual. Para eso necesitamos que el programa **recuerde** cosas: su nombre, su edad, cuánta energía tiene. Y para recordar, usamos **variables**.

---

## Escena 2 — ¿Qué es una variable? (0:30 – 1:30)

🖥️ **En pantalla:** Diapositiva 3 — una caja con etiqueta "edad" y dentro el número 2.

🎙️ **Narración:**
> Una variable es como una **caja con etiqueta**. La etiqueta es el nombre, y dentro guardamos un valor. Por ejemplo, una caja llamada `edad` que guarda el número 2.
> En Java, además, tenemos que decir **qué tipo de cosa** va dentro de la caja. No es lo mismo guardar un número que guardar un texto.

🖥️ **Texto sobreimpreso:** `tipo nombre = valor;`

---

## Escena 3 — Los tipos de datos (1:30 – 3:00)

🖥️ **En pantalla:** Diapositiva 4 (tabla de tipos), luego el editor escribiendo la primera parte del código.

🎙️ **Narración:**
> Estos son los cuatro tipos que más vas a usar:
> - `int`, para números enteros, sin decimales. Como la edad: 2.
> - `double`, para números con decimales. Como el peso: 3.5 kilos. Ojo: en Java el decimal se escribe con **punto**, no con coma.
> - `String`, para texto. Siempre va entre comillas, como "Pixel". Fíjate que String empieza con **S mayúscula**.
> - Y `boolean`, que solo puede ser `true` (verdadero) o `false` (falso). Por ejemplo: ¿tiene hambre? Verdadero.
> Para mostrar una variable junto a un texto usamos el signo **más**. Eso se llama **concatenar**: pegar textos.

| Tipo | Para qué sirve | Ejemplo |
|------|----------------|---------|
| `int` | Números enteros | `int edad = 2;` |
| `double` | Números con decimales | `double peso = 3.5;` |
| `String` | Texto | `String nombre = "Pixel";` |
| `boolean` | Verdadero o falso | `boolean tieneHambre = true;` |

🖥️ **Texto sobreimpreso:** "Los nombres de variables empiezan en minúscula: `tieneHambre`, `edadEnMeses`"

---

## Escena 4 — Operadores aritméticos (3:00 – 5:00)

🖥️ **En pantalla:** Diapositiva 5 (tabla de operadores) → editor, escribir la segunda parte del código y ejecutar.

🎙️ **Narración:**
> Con las variables podemos hacer cálculos. Java usa los mismos signos que en matemáticas: más, menos, por (que es el asterisco) y dividido (la barra).
> Pixel tiene 50 de energía. Come algo y gana 20. Escribimos `energia = energia + 20`: "la nueva energía es la energía que tenía más 20". Luego juega y pierde 10. Aquí usamos un atajo: `energia -= 10`, que significa lo mismo que `energia = energia - 10`.
> Ahora, ¡cuidado con la división! Si Pixel tiene 7 galletas para 2 días, `7 / 2` en Java da **3**, no 3.5. Cuando divides dos enteros, Java corta los decimales.
> ¿Y la galleta que sobra? Para eso está el operador **módulo**, el signo de porcentaje: `7 % 2` da 1, que es el **residuo** de la división.
> Si quieres decimales, uno de los números debe tener punto decimal: `7 / 2.0` sí da 3.5.

| Operador | Significado | Ejemplo | Resultado |
|----------|-------------|---------|-----------|
| `+` | Suma | `5 + 2` | `7` |
| `-` | Resta | `5 - 2` | `3` |
| `*` | Multiplicación | `5 * 2` | `10` |
| `/` | División | `7 / 2` | `3` (entero) |
| `%` | Residuo (módulo) | `7 % 2` | `1` |

---

## Escena 5 — Expresiones que dan verdadero o falso (5:00 – 5:50)

🖥️ **En pantalla:** Diapositiva 6 (operadores de comparación). Resaltar la última línea del código.

🎙️ **Narración:**
> También podemos **comparar**. `energia > 50` le pregunta a Java: ¿la energía es mayor que 50? La respuesta es un `boolean`: verdadero o falso. Como Pixel tiene 60, la respuesta es `true`.
> Los comparadores son: mayor que, menor que, mayor o igual, menor o igual, **igual a**, que se escribe con **dos** signos igual, y **diferente de**, que se escribe signo de admiración e igual.
> Esto va a ser clave en la próxima lección, cuando el programa tome decisiones.

| Comparador | Significado |
|-----------|-------------|
| `>` / `<` | Mayor que / menor que |
| `>=` / `<=` | Mayor o igual / menor o igual |
| `==` | Igual a (dos signos) |
| `!=` | Diferente de |

### Código de ejemplo completo

```java
public class Main {
    public static void main(String[] args) {
        // Datos de nuestra mascota virtual
        String nombre = "Pixel";
        int edad = 2;
        double peso = 3.5;
        boolean tieneHambre = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("¿Tiene hambre? " + tieneHambre);

        // Operadores aritméticos
        int energia = 50;
        energia = energia + 20;   // Pixel come algo
        energia -= 10;            // Pixel juega un rato
        System.out.println("Energía: " + energia);

        int edadEnMeses = edad * 12;
        System.out.println("Edad en meses: " + edadEnMeses);

        int galletas = 7;
        int dias = 2;
        System.out.println("Galletas por día: " + (galletas / dias));
        System.out.println("Sobran: " + (galletas % dias));
        System.out.println("Con decimales: " + (galletas / 2.0));

        // Expresión que da verdadero o falso
        boolean estaFuerte = energia > 50;
        System.out.println("¿Está fuerte? " + estaFuerte);
    }
}
```

**Salida esperada:**

```
Nombre: Pixel
Edad: 2 años
Peso: 3.5 kg
¿Tiene hambre? true
Energía: 60
Edad en meses: 24
Galletas por día: 3
Sobran: 1
Con decimales: 3.5
¿Está fuerte? true
```

---

## Escena 6 — Error común: el "+" que pega en vez de sumar (5:50 – 6:30)

🖥️ **En pantalla:** En el editor, escribir y ejecutar las dos líneas siguientes.

```java
System.out.println("Suma: " + 2 + 3);    // Muestra: Suma: 23
System.out.println("Suma: " + (2 + 3));  // Muestra: Suma: 5
```

🎙️ **Narración:**
> Un error muy común: si escribes "Suma: " más 2 más 3, Java muestra "Suma: 23". ¿Por qué? Porque primero pega el texto con el 2, y luego pega el 3. Para que sume primero, usa **paréntesis**. Por eso en nuestro código las divisiones están entre paréntesis.

---

## Escena 7 — ¡Pausa! Tu turno (6:30 – 7:20)

🖥️ **En pantalla:** Diapositiva 7 ("¡Pausa! Tu turno").

🎙️ **Narración:**
> Pausa el video y abre el enlace de la descripción. Crea las variables de **tu propia mascota**: su nombre, su especie, su edad y su peso. Después calcula su edad en **días**, sabiendo que un año tiene 365 días, y muéstralo en la consola.

### Código de práctica (archivo inicial para el enlace de OnlineGDB)

```java
public class Main {
    public static void main(String[] args) {
        // 1. Crea las variables de tu mascota
        String nombre = "";
        String especie = "";
        int edad = 0;
        double peso = 0.0;

        // 2. Muestra sus datos en la consola


        // 3. Calcula su edad en días (1 año = 365 días) y muéstrala

    }
}
```

---

## Escena 8 — Cierre y adelanto (7:20 – 8:00)

🖥️ **En pantalla:** Diapositiva 8 (resumen y "Próxima lección").

🎙️ **Narración:**
> Hoy aprendiste a guardar datos en variables, a usar los tipos `int`, `double`, `String` y `boolean`, y a calcular y comparar con operadores.
> Pixel ya tiene nombre, edad y energía. En la próxima lección le vamos a enseñar a **tomar decisiones** y a **repetir acciones**. ¡Nos vemos!

---

## Checklist antes de subir el video

- [ ] Grabación en 1080p, zoom del navegador al 125–150 %.
- [ ] Todo el código se demuestra en OnlineGDB.
- [ ] Texto sobreimpreso en las tablas de tipos y operadores.
- [ ] Enlace de OnlineGDB con el código de práctica en la descripción.
- [ ] Sin nombres de autores, logotipos ni referencias al equipo.
- [ ] Subido a YouTube como **No listado**.
