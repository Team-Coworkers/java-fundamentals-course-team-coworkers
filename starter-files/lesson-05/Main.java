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
