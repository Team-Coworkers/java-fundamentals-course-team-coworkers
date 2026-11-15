public class Main {
    public static void main(String[] args) {
        String nombre = "Pixel";
        int energia = 25;

        // Decisiones con if, else if y else
        if (energia < 30) {
            System.out.println(nombre + " tiene hambre. ¡Dale de comer!");
        } else if (energia < 70) {
            System.out.println(nombre + " está bien.");
        } else {
            System.out.println(nombre + " está lleno de energía.");
        }

        // Condiciones combinadas: && (y)  || (o)
        boolean esDeDia = true;
        if (esDeDia && energia > 20) {
            System.out.println(nombre + " quiere salir a jugar.");
        }

        // for: repetir un número conocido de veces
        System.out.println("--- Pixel hace ejercicio ---");
        for (int vuelta = 1; vuelta <= 3; vuelta++) {
            System.out.println("Vuelta número " + vuelta);
        }

        // while: repetir mientras la condición sea verdadera
        System.out.println("--- Hora de comer ---");
        while (energia < 100) {
            energia = energia + 25;
            System.out.println("Ñam ñam... energía: " + energia);
        }
        System.out.println(nombre + " ya está lleno.");
    }
}
