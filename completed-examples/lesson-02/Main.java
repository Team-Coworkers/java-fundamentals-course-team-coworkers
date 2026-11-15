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
