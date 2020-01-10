package app;

public class Vehiculo {
    private int cantDeruedas;
    private double velocidadMax,velocidad=0;
    private int cantDeAcientos;
    private String marca;
    public void avanzar() {
        velocidad=20;
        System.out.println("Avanzando");
    }
    public void detener() {
        velocidad=0;
        System.out.println("Detenido");
    }

    public Vehiculo(int cantDeruedas, double velocidadMax, int cantDeAcientos, String marca) {
        this.cantDeruedas = cantDeruedas;
        this.velocidadMax = velocidadMax;
        this.cantDeAcientos = cantDeAcientos;
        this.marca = marca;
    }

    public int getCantDeruedas() {
        return cantDeruedas;
    }

    public void setCantDeruedas(int cantDeruedas) {
        this.cantDeruedas = cantDeruedas;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getCantDeAcientos() {
        return cantDeAcientos;
    }

    public void setCantDeAcientos(int cantDeAcientos) {
        this.cantDeAcientos = cantDeAcientos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}