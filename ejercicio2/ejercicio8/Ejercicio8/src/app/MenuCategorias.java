package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuCategorias {
    int pocicionCategoria;
    String[] nombre={"Unos","Dos","Tres","Cuatros","Cincos","Seis","Casa llena","Cuatro de un tipo","Escalera Pequeña","Escalera Grande","Eleccion","Yacht"};
    Scanner scan= new Scanner(System.in);
    int categoria;
    public void mostrarCategorias(){
        System.out.println("Elige la categoria ingresando el numero que lo antecede");
        for (int i = 0; i < nombre.length; i++) {
            System.out.println(i+". "+nombre[i]);
        }
        
        obtenerCategoria();
    }
    public int obtenerCategoria(){
        do {
            try {
                categoria=scan.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("ingrese un número");
            }
            
        } while (!(categoria>0&&categoria<nombre.length));
        return categoria;
    }
}
