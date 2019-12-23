package app;

public class Empleado {
    private String nombre;
    private String apellido;
    private double sueldoActual;
    private int antiguedad;

    public Empleado(String nombre, String apellido, double sueldoActual, int antiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoActual = sueldoActual;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldoActual() {
        return sueldoActual;
    }

    public void setSueldoActual(double sueldoActual) {
        this.sueldoActual = sueldoActual;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Empleado() {
    }

    @Override
    public String toString() {
        
        return getClass().getName() +" el nombre es "+getNombre()+" El apellido es "+getApellido()+" con antiguedad "+getAntiguedad()+" y su sueldo es "+getSueldoActual();
    }
    

}