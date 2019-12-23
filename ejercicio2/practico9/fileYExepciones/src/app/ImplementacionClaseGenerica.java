package app;

import java.util.Scanner;

public class ImplementacionClaseGenerica {
    String[] palabras;
    int[] numeros;
    ClaseGenerica <String> arrayStr =new ClaseGenerica<String>();
    public  void LLenarString() {
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < palabras.length; i++) {
            palabras[i]=scan.nextLine();
        }
    }
    public  void LLenarDeEnteros() {
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=scan.nextInt();
        }
    }
    public void llenarArrays() {
        for (int i = 0; i < numeros.length; i++) {
            arrayStr.add(palabras[i]);
        }
        
    }
    public void mostrarArray() {
        arrayStr.mostrarArray();
    }
    
}