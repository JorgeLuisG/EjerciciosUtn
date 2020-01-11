package app;


public class Colectivo extends Vehiculo {
    private int cantDePersonasParadas;

    public Colectivo(int cantDeruedas, double velocidadMax, int cantDeAcientos, String marca,
            int cantDePersonasParadas) {
        super(cantDeruedas, velocidadMax, cantDeAcientos, marca);
        this.cantDePersonasParadas = cantDePersonasParadas;
    }

    public int getCantDePersonasParadas() {
        return cantDePersonasParadas;
    }

    public void setCantDePersonasParadas(int cantDePersonasParadas) {
        this.cantDePersonasParadas = cantDePersonasParadas;
    }

}