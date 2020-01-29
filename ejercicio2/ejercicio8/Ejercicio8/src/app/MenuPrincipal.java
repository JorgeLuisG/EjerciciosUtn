package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPrincipal {
    private static Scanner scan;
    
    public static void mostrarMenu() {
        int categoria=0;

        do {
            System.out.println("Ingrese 1 para cargar jugadores.\nIngrese 2 para jugar.\nIngrese 3 para salir.");
            categoria=obtenerCategoria();
            if (categoria==1) {
                MenuJugadores menuJugadores=new MenuJugadores();
                menuJugadores.mostrarMenuJugadores();
            }else if (categoria==2) {
                if (MenuJugadores.getCantidadDeJugadores()<2) {
                    System.out.println("Deve ingresar de 2 a 5 jugadores");
                }else{
                    MenuTurnos menuTurnos= new MenuTurnos();
                    menuTurnos.administrarJugadores();
                }
                
            }
        } while (categoria!=3);
          
    }
    public static int obtenerCategoria(){
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

}