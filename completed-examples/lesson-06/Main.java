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
