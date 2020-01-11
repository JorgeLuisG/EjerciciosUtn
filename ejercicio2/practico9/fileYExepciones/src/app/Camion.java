package app;


public class Camion extends Vehiculo{
    public int capacidadDeCarga;
    

   

    public Camion(int cantDeruedas, double velocidadMax, int cantDeAcientos, String marca, int capacidadDeCarga) {
        super(cantDeruedas, velocidadMax, cantDeAcientos, marca);
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public int getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(int capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

}