package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 1");
        int[] numerosAleatorios=new int[50];
        llenarNumerosAleatorios(numerosAleatorios,200);
        imprimirMatriz(numerosAleatorios);
        System.out.println("Ejercicio 2");
        int[][] matrizAleatoria=new int[23][6]; 
        llenarNumerosAleatorios_nxn(matrizAleatoria, 1);
        imprimirMatriz_nxn(matrizAleatoria);
        System.out.println("Ejercicio 3");
        int[][] matrizAleatoria1=new int[6][3]; 
        int[] numerosAleatorios1=new int[6];
        llenarNumerosAleatorios(numerosAleatorios1,10,1);
        llenarNumerosAleatorios_nxn(matrizAleatoria1, 10,1);
        imprimirMatriz(numerosAleatorios1);
        imprimirMatriz_nxn(matrizAleatoria1);
        imprimirMatriz(sumarVectorConcolumna(matrizAleatoria1, numerosAleatorios1));
        System.out.println("Ejercicio 4");
        int[] numeros=new int[8];
        int[] numeros2=new int[8];
        System.out.println("ingrese segundo vector");
        llenarVectorConNumeros(numeros);
        System.out.println("ingrese segundo vector");
        llenarVectorConNumeros(numeros2);
        imprimirMatriz(numeros);
        imprimirMatriz(numeros2);
        System.out.println(multiplicarVectoresEscalarmente(numeros, numeros2));
        int[][] matriz=new int[4][6];
        int[] vector=new int[4];
        llenarNumerosAleatorios_nxn(matriz, 3, 1);
        llenarVectorConNumerosEntre(vector,1,3);
        imprimirMatriz_nxn(matriz);
        imprimirMatriz(vector);
        compararVectorConColumna(matriz,vector);
    }
    public static void imprimirMatriz(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array.length-1==i) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i]+";");
            }
            
        }
    }
    public static void imprimirMatriz_nxn(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            
            imprimirMatriz(array[i]);

        }
    }
    public static void llenarNumerosAleatorios(int[] array,int max) {
        
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*(max+1));
        }
        
    }
    public static void llenarNumerosAleatorios_nxn(int[][] array,int max){
        for (int i = 0; i < array.length; i++) {
            llenarNumerosAleatorios(array[i], max);
        }
        
    }
    public static void llenarNumerosAleatorios(int[] array,int max,int min) {
        
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*(max+1-min)+min);
        }
        
    }
    public static void llenarNumerosAleatorios_nxn(int[][] array,int max,int min){
        for (int i = 0; i < array.length; i++) {
            llenarNumerosAleatorios(array[i], max,min);
        }
        
    }
    public static int[] sumarVectorConcolumna(int[][] array,int[] array2){
        int[] array3=new int[6];
        for (int i = 0; i < array2.length; i++) {
            
            array3[i]=array[i][1]+array2[i];
            
        }
        return array3;
    }
    public static void llenarVectorConNumeros(int[] array) {
        
        Scanner scan= new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i]=scan.nextInt();
        }
        
        
    }
    public static void llenarVectorConNumerosEntre(int[] array,int min,int max) {

        Scanner scan= new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            do {
                array[i]=scan.nextInt();
            } while (array[i]>max||array[i]<min);
            
        }
        
        
        
    }
    public static int multiplicarVectoresEscalarmente(int[] array,int[] array2) {
        
        int escalar=0;
        for (int i = 0; i < array.length; i++) {
            escalar +=array[i]*array2[i];
        }
        return escalar;
        
    }
    public static boolean compararVectorConColumna(int[][] matriz,int vector){
        boolean comparador;
        for (int i = 0; i < matriz.length; i++) {
            
        }
        return comparador;
    }

}