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
