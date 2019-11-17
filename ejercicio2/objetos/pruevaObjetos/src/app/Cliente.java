package app;

public class Cliente {
    private String nombre;
    private String apellido;
    private int id;
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public void setApellido(String apellido) {
        this.apellido=apellido;
    }
    public void setId(int id) {
        this.id=id;
    }
    public int getid() {
		return id;
    }
    public String getNombre() {
		return nombre;
    }
    public String getApellido() {
		return apellido;
	}
    
    
}
