//Extender el ejercicio anterior, modelando el objeto Item, para modelar los capacitores/leds/botones etc., 
//que tendrán al menos un campo descripcion, preciounit. ¿Cómo generalizaría el programa? Considerar usar arrays, 
//además de objetos.
//Preguntas que se tendrían que poder resolver con el programa
//a. Calcular el ingreso de n meses, donde n lo ingresa el usuario.
//b. Calcular el porcentaje deseado de las ventas señaladas.
//c. Calcular el stock de productos necesarios para cubrir n días de venta, donde n lo ingresa el usuario.
package app;

public class Item {
    private String descripcion;
    private double cantidadDeProductosMensuales;
    private double preciounit;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCantidadDeProductosMensuales() {
        return cantidadDeProductosMensuales;
    }

    public void setCantidadDeProductosMensuales(double cantidadDeProductosMensuales) {
        this.cantidadDeProductosMensuales = cantidadDeProductosMensuales;
    }

    public double getPreciounit() {
        return preciounit;
    }

    public void setPreciounit(double preciounit) {
        this.preciounit = preciounit;
    }

    public Item(String descripcion, double cantidadDeProductosMensuales, double preciounit) {
        this.descripcion = descripcion;
        this.cantidadDeProductosMensuales = cantidadDeProductosMensuales;
        this.preciounit = preciounit;
    }
   
}