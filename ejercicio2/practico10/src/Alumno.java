public class Alumno {
    private int legajo;
    private String dni;
    private String nombre;
    private String apellido;
    private String curso;
    private double nota;
    private int edad;

    public Alumno(int legajo, String dni, String nombre, String apellido, String curso, double nota, int edad) {
        this.legajo = legajo;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.nota = nota;
        this.edad = edad;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno: "+getNombre()+" "+getApellido()+" con "+getEdad()+" años de edad con D.N.I.: "+getDni()+" cursa "+getCurso()+" año, tiene por legajo el numero "+getLegajo()+" y su promedio es "+getNota();
    }
}

