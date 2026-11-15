public class Main {
    public static void main(String[] args) {
        int nota = 14;

        // Decisiones con if, else if y else
        if (nota >= 11) {
            System.out.println("Aprobado con " + nota);
        } else {
            System.out.println("Desaprobado con " + nota);
        }

        if (nota >= 18) {
            System.out.println("Excelente");
        } else if (nota >= 14) {
            System.out.println("Muy bien");
        } else if (nota >= 11) {
            System.out.println("Bien, puedes mejorar");
        } else {
            System.out.println("Hay que repasar");
        }

        // Bucle for: repetir un número conocido de veces
        int numero = 7;
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // Bucle while: repetir mientras se cumpla una condición
        int cuenta = 5;
        while (cuenta > 0) {
            System.out.println(cuenta + "...");
            cuenta--;
        }
        System.out.println("¡Despegue!");
    }
}
