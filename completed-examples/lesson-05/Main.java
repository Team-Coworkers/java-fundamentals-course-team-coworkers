// Una clase es el molde; cada objeto es una copia con sus propios datos
class Estudiante {
    String nombre;
    int edad;
    double nota;

    // El constructor se ejecuta al crear el objeto con new
    Estudiante(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    void presentarse() {
        System.out.println("Hola, soy " + nombre + ", tengo " + edad + " años y mi nota es " + nota + ".");
    }

    boolean estaAprobado() {
        return nota >= 11;
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante ana = new Estudiante("Ana", 14, 17.5);
        Estudiante luis = new Estudiante("Luis", 15, 10.0);

        ana.presentarse();
        luis.presentarse();

        System.out.println("¿Ana aprobó? " + ana.estaAprobado());
        System.out.println("¿Luis aprobó? " + luis.estaAprobado());
    }
}
