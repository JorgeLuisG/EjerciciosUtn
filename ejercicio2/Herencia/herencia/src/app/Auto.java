package app;
/**
 * Auto
 */
public class Auto extends Vehiculo{

    private int cantidadDePuertas;
    //private enum tipoDeTansmicion;

    public int getCantidadDePuertas() {
        return cantidadDePuertas;
    }

    public void setCantidadDePuertas(int cantidadDePuertas) {
        this.cantidadDePuertas = cantidadDePuertas;
    }
    public void desplazar() {
        System.out.println("desplazar auto");
    }
    public int getCantidadDeRuedas() {
        return super.getCantidadDeRuedas()+2;
    }

}

    