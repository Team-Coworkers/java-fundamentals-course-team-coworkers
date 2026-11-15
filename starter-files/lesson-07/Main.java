// Este programa tiene 5 errores. Encuéntralos y corrígelos para que funcione.
// Pista: lee con calma el mensaje de error y la línea que indica.

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
        Mascota miMascota = new Mascota("Rocky")
        int edad = "3";
        system.out.println("Mi mascota se llama " + miMascota.getnombre());
        System.out.println("Tiene " + edad + " años.");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Guau número " + i);
        }
    }
