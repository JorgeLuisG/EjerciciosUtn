package app;

public class Jugador {
    private int score=0;
    private String nombre;
    


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

}