class Mascota {
    private String nombre;
    private int energia;
    // Reto 1: agrega el atributo privado especie (y recíbelo en el constructor)

    public Mascota(String nombre) {
        this.nombre = nombre;
        this.energia = 50;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia < 0) {
            this.energia = 0;
        } else if (energia > 100) {
            this.energia = 100;
        } else {
            this.energia = energia;
        }
    }

    // Reto 1: crea getEspecie()

}

public class Main {
    public static void main(String[] args) {
        // Reto 2: crea un refugio con 4 mascotas
        Mascota[] refugio = new Mascota[4];


        // Cambia la energía de algunas con setEnergia(...)


        // Muestra solo las que tienen más de 40 de energía (for + if)

    }
}
