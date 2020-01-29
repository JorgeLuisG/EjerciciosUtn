package app;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuJugadores {
    private static int cantidadDeJugadores;
    private static Scanner scan;
    private static Jugador[] jugadores=new Jugador[0];
    
    
    public void mostrarMenuJugadores() {
        int categoria=0;

        do {
            System.out.println("Ingrese 1 para nuevo jugador.\nIngrese 2 para mostrar jugadores.\nIngrese 3 para salir.");
            categoria=obtenerCategoria();
            if (categoria==1) {
                System.out.println("Ingrese nombre del jugador "+(cantidadDeJugadores+1));
                cargarEquipo();
            }else if (categoria==2) {
                System.out.println("Los jugadores son: ");
                for (int i = 0; i < jugadores.length; i++) {
                    System.out.println(jugadores[i].getNombre()+" "+jugadores[i].getScore());
                }
            }
        } while (categoria!=3);
          
    }
    
    public int obtenerCategoria(){
        int desicion=0;
        do {
            try {
                scan= new Scanner(System.in);
                desicion=scan.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("ingrese un número");
            }
            
        } while (desicion!=1&&desicion!=2&&desicion!=3);
        return desicion;
    }
    public Jugador[] cargarEquipo(){
        Jugador jugador;
        if (jugadores.length<5) {
            jugador=cargarJugador();
            jugadores=Arrays.copyOf(jugadores, cantidadDeJugadores);
            jugadores[cantidadDeJugadores-1]=jugador;
        } else {
            System.out.println("No se admiten mas jugadores");
        }
        
        return jugadores;
    }
    

    public Jugador cargarJugador(){
        Jugador jugador=new Jugador(cargarNombre());
        cantidadDeJugadores++;
        return jugador;
    }
    public String cargarNombre(){
        String nombre;
        do {
            scan=new Scanner(System.in);
            nombre=scan.nextLine();
        } while (nombre.length()==0);
        
        return nombre;
    }

    public static int getCantidadDeJugadores() {
        return cantidadDeJugadores;
    }

    public static Jugador[] getJugadores() {
        return jugadores;
    }

    

    
}