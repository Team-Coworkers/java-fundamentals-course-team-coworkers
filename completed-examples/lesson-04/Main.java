import java.util.Scanner;

public class Main {

    // Un método agrupa instrucciones que podemos usar muchas veces
    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

    // Este método recibe tres parametros y devuelve un resultado
    public static double calcularPromedio(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cómo te llamas? ");
        String nombre = teclado.nextLine();
        saludar(nombre);

        System.out.print("Nota 1: ");
        int nota1 = teclado.nextInt();
        System.out.print("Nota 2: ");
        int nota2 = teclado.nextInt();
        System.out.print("Nota 3: ");
        int nota3 = teclado.nextInt();

        double promedio = calcularPromedio(nota1, nota2, nota3);
        System.out.println(nombre + ", tu promedio es " + promedio);

        teclado.close();
    }
}
