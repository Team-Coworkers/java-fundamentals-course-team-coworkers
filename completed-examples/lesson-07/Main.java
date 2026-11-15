// Versión corregida: estos fueron los 5 errores
// 1. Faltaba el punto y coma al crear la mascota.
// 2. Un número entero no va entre comillas: int edad = 3;
// 3. System va con S mayúscula.
// 4. El método se llama getNombre, con N mayúscula.
// 5. Faltaba la llave que cierra la clase Main.

class Mascota {
    private String nombre;

    Mascota(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

public class Main {
    public static void main(String[] args) {
        Mascota miMascota = new Mascota("Rocky");
        int edad = 3;
        System.out.println("Mi mascota se llama " + miMascota.getNombre());
        System.out.println("Tiene " + edad + " años.");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Guau número " + i);
        }
    }
}
