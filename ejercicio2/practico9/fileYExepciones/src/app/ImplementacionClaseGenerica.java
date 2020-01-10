package app;

import java.util.Scanner;

public class ImplementacionClaseGenerica {
    private String[] palabras=new String[10];
    private Integer[] numeros=new Integer[10];
    private ClaseGenerica <String> arrayStr =new ClaseGenerica<String>();
    private ClaseGenerica <Integer> arrayInt =new ClaseGenerica<Integer>();
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
    
    public void mostrarArray() {
        arrayStr.mostrarArray(palabras);
        arrayInt.mostrarArray(numeros);
    }
    
}