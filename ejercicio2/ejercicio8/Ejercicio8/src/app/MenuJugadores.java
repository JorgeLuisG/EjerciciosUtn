package app;

import java.util.Scanner;

public class MenuJugadores {
    private static int cantidadDeJugadores;
    private static Scanner scan= new Scanner(System.in);
    public void mostrarMenuJugadores() {
        
    }
    public Jugador cargarJugador(){
        Jugador jugador=new Jugador(cargarNombre());
        cantidadDeJugadores++;
        return jugador;
    }
    public String cargarNombre(){
        String nombre;
        nombre=scan.nextLine();
        return nombre;
    }

    public static int getCantidadDeJugadores() {
        return cantidadDeJugadores;
    }
}