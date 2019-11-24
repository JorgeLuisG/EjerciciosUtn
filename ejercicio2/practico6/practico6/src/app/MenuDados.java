
package app;

import java.util.Scanner;
  

public class MenuDados {
    private static Scanner scan=new Scanner(System.in);
    private static Dados dado1=new Dados(6, 6, 1);
    
    
    private static void imprimirMenu() {
        System.out.println("ingrese t para tirar dados");
        System.out.println("ingrese s para salir");
        System.out.println("ingrese su opción");
    }
    public static void scanearMenu() {
        String eleccion;
        do {
            imprimirMenu();
            eleccion=scan.next();
            switch (eleccion) {
                case "t":
                    dado1.imprimirResultado();
                    break;
                case "s":
                    
                    break;
                default:
                   System.out.println("elija t(tirar) o s(salir)"); 
                    break;
            }
        } while (!eleccion.equalsIgnoreCase("s"));
    } 
}