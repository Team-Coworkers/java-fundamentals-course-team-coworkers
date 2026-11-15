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
