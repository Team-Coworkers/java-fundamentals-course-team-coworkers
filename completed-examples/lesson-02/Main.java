public class Main {
    public static void main(String[] args) {
        // Variables: cajas con nombre que guardan un dato
        String nombre = "Ana";
        int edad = 14;
        double estatura = 1.58;
        boolean leGustaProgramar = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura + " m");
        System.out.println("Le gusta programar: " + leGustaProgramar);

        // Operadores aritméticos
        int edadDentroDeCinco = edad + 5;
        System.out.println("Dentro de 5 años tendrá " + edadDentroDeCinco + " años.");

        int nota1 = 15;
        int nota2 = 17;
        int nota3 = 18;
        double promedio = (nota1 + nota2 + nota3) / 3.0;
        System.out.println("Promedio de notas: " + promedio);

        // El operador % devuelve el resto de una división
        int caramelos = 17;
        int amigos = 5;
        System.out.println("A cada amigo le tocan " + (caramelos / amigos) + " caramelos.");
        System.out.println("Sobran " + (caramelos % amigos) + " caramelos.");
    }
}
