import java.util.Scanner;

public class Main {

    // Crea aquí el método jugar(int energia):
    // resta 15 y devuelve el resultado (nunca menor que 0)


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int energia = 100;

        System.out.print("¿Cuántas veces quieres jugar? ");
        int veces = teclado.nextInt();

        // Usa un for para llamar a jugar(energia) 'veces' veces


        System.out.println("Energía final: " + energia);
        teclado.close();
    }
}
