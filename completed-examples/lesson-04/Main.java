import java.util.Scanner;

public class Main {

    // Método sin parámetros: solo realiza una acción
    public static void saludar() {
        System.out.println("¡Bienvenido al mundo de las mascotas virtuales!");
    }

    // Método con un parámetro
    public static void presentar(String nombre) {
        System.out.println("Te presento a " + nombre + ".");
    }

    // Método que recibe datos y devuelve un resultado
    public static int alimentar(int energia, int comida) {
        int nuevaEnergia = energia + comida;
        if (nuevaEnergia > 100) {
            nuevaEnergia = 100;
        }
        return nuevaEnergia;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        saludar();

        System.out.print("¿Cómo se llama tu mascota? ");
        String nombre = teclado.nextLine();
        presentar(nombre);

        System.out.print("¿Cuánta comida le das (1 a 50)? ");
        int comida = teclado.nextInt();

        int energia = 40;
        energia = alimentar(energia, comida);
        System.out.println(nombre + " ahora tiene " + energia + " de energía.");

        teclado.close();
    }
}
