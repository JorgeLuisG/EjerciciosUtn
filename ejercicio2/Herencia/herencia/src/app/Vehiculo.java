package app;

/**
 * Vehiculo
 */

public class Vehiculo {
    private int cantidadDeRuedas = 2;
    private int cantidadDeAsientos;

    private enum Motorizacion {
        CON_MOTOR, SIN_MOTOR
    }

    private enum Color {
        BLANCO, NEGRO, ROJO, VERDE, AZUL, AMARILLO, NARANJA, VIOLETA
    }

    public int getCantidadDeRuedas() {
        return cantidadDeRuedas;
    }

    public void setCantidadDeRuedas(int cantidadDeRuedas) {
        this.cantidadDeRuedas = cantidadDeRuedas;
    }

    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public void desplazar() {
        System.out.println("desplazar");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.valueOf(cantidadDeRuedas);
    }
    
}