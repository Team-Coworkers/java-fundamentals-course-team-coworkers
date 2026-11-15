import java.util.Scanner;

class Estudiante {
    // 1. Haz privados los atributos nombre y nota.
    String nombre;
    double nota;

    Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // 2. Agrega getNombre() y getNota().
    // 3. Agrega setNota(double nota) que solo acepte notas entre 0 y 20.
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 4. Crea un arreglo para 3 estudiantes: Estudiante[] registro = new Estudiante[3];
        // 5. Con un for, pide el nombre y la nota de cada uno y guárdalos en el arreglo.
        // 6. Muestra el registro completo y el nombre del estudiante con la mejor nota.

        teclado.close();
    }
}
