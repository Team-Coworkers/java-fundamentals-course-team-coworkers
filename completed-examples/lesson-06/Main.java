import java.util.Scanner;

class Estudiante {
    // private: nadie fuera de la clase puede cambiar estos datos directamente
    private String nombre;
    private double nota;

    Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        setNota(nota);
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    // El setter protege el dato: solo acepta notas entre 0 y 20
    public void setNota(double nota) {
        if (nota >= 0 && nota <= 20) {
            this.nota = nota;
        } else {
            System.out.println("Nota no válida: " + nota + ". Se guarda 0.");
            this.nota = 0;
        }
    }

    public boolean estaAprobado() {
        return nota >= 11;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Estudiante[] registro = new Estudiante[3];

        for (int i = 0; i < registro.length; i++) {
            System.out.print("Nombre del estudiante " + (i + 1) + ": ");
            String nombre = teclado.nextLine();
            System.out.print("Nota de " + nombre + ": ");
            double nota = Double.parseDouble(teclado.nextLine());
            registro[i] = new Estudiante(nombre, nota);
        }

        System.out.println();
        System.out.println("=== REGISTRO DE ESTUDIANTES ===");
        Estudiante mejor = registro[0];
        for (Estudiante estudiante : registro) {
            String estado = estudiante.estaAprobado() ? "aprobado" : "desaprobado";
            System.out.println(estudiante.getNombre().toUpperCase() + " - " + estudiante.getNota() + " - " + estado);
            if (estudiante.getNota() > mejor.getNota()) {
                mejor = estudiante;
            }
        }
        System.out.println("Mejor nota: " + mejor.getNombre() + " con " + mejor.getNota());

        teclado.close();
    }
}
