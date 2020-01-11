package app;


public class Auto extends Vehiculo {
    private double capacidadDelBaul;

    public double getCapacidadDelBaul() {
        return capacidadDelBaul;
    }

    public void setCapacidadDelBaul(double capacidadDelBaul) {
        this.capacidadDelBaul = capacidadDelBaul;
    }

    public Auto(int cantDeruedas, double velocidadMax, int cantDeAcientos, String marca, double capacidadDelBaul) {
        super(cantDeruedas, velocidadMax, cantDeAcientos, marca);
        this.capacidadDelBaul = capacidadDelBaul;
    }
    
}