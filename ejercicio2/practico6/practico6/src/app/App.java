package app;

import java.util.Arrays;
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
//        int[] numeros=new int[8];
//        int[] numeros2=new int[8];
//        System.out.println("ingrese segundo vector");
//        llenarVectorConNumeros(numeros);
//        System.out.println("ingrese segundo vector");
//        llenarVectorConNumeros(numeros2);
//        imprimirMatriz(numeros);
//        imprimirMatriz(numeros2);
//        System.out.println(multiplicarVectoresEscalarmente(numeros, numeros2));
/*        System.out.println("Ejercicio 5");
        int[][] matriz=new int[4][6];
        int[] vector=new int[4];
        llenarNumerosAleatorios_nxn(matriz, 3,1);
        imprimirMatriz_nxn(matriz);
        System.out.println("ingrese un numero entre 1 y 3");
        llenarVectorConNumerosEntre(vector,1,3);
        imprimirMatriz(vector);
        compararVectorConColumna(matriz,vector);
        imprimirMatriz_nxn(TransponerMatriz(matriz));
        System.out.println(compararVectorConColumna(matriz,vector));
        System.out.println("Ejercicio 6");
        String [] palabras=new String[6];
        String palabra="";
        System.out.println("Ingrese palabras de la matriz");
        llenarVector(palabras);
        System.out.println("Ingrese una palabra");
        palabra=cargarPalbra(palabra);
        System.out.println(palabra);
        System.out.println(compararString(palabras, palabra));
        System.out.println("Ejercicio 7");
        int[] vector2= new int[10];
        llenarNumerosAleatorios(vector2, 10);
        imprimirMatriz(vector2);
        invertirVector(vector2);
        imprimirMatriz(vector2);
        System.out.println("Ejercicio 8");
        int[][] matriz2=new int[10][10];
        llenarNumerosAleatorios_nxn(matriz2, 100);
        System.out.println("Matriz 10x10");
        imprimirMatriz_nxn(matriz2);
        System.out.println("Vector números impares");
        imprimirMatriz(devolverNumerosImpares(matriz2));
*/        System.out.println("Ejercicio 9");
        Menu.scanearMenu();


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
                if (array[i]>max||array[i]<min) {
                    System.out.println("ingrese un numero entre "+min+" y "+max);
                }
            } while (array[i]>max||array[i]<min);
            
        }
        
        
        
    }
    public static void llenarMatrizConNumeros(int[][] array) {
    
        for (int i = 0; i < array.length; i++) {
            llenarVectorConNumeros(array[i]);
        }
        
    }
    public static int multiplicarVectoresEscalarmente(int[] array,int[] array2) {
        
        int escalar=0;
        for (int i = 0; i < array.length; i++) {
            escalar +=array[i]*array2[i];
        }
        return escalar;
        
    }
    public static int[][] TransponerMatriz(int[][] matriz) {
        int[][] matriz2=new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j]=matriz[j][i];
            }
            
        }
        return matriz2;
    }
    public static boolean compararVectorConColumna(int[][] matriz1,int vector[]){
        boolean comparador=false;
        int[][] matriz=TransponerMatriz(matriz1);
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]==vector[j]) {
                    
                    comparador=true;
                    
                } else {
                    comparador=false;
                    break;
                }
            }
            if (comparador) {
                break;
            }
        }
        return comparador;
    }
    public static void llenarVector (String[] palabras){
        Scanner scan= new Scanner(System.in);
        for (int i = 0; i < palabras.length; i++) {
            palabras[i]=scan.next();
        }
    }
    public static boolean compararString (String[] palabras,String palabra) {
        boolean comparador=false;
        for (int i = 0; i < palabras.length; i++) {
            if(palabras[i].equalsIgnoreCase(palabra)){
                comparador=true;
                break;
            }
            
        }
        return comparador;
    }
    public static String cargarPalbra(String palabra) {
        Scanner scan= new Scanner(System.in);
        palabra=scan.next();
        return palabra;
    }
    public static void invertirVector(int[] vector) {
        int []vectorAux=Arrays.copyOf(vector, vector.length);
        for (int i = 0; i < vector.length; i++) {
                vector[i]=vectorAux[(vector.length-1-i)];
        }
    }
    public static int[] devolverNumerosImpares(int[][] matriz) {
        int[] matriz2=new int[0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]%2==1) {
                    matriz2=añadirValorArray(matriz2, matriz[i][j]);
                }
            }
        }
        
        return matriz2;
    }
    public static int[] añadirValorArray(int[] mat, int i) {
        mat  = Arrays.copyOf(mat, mat.length + 1);
        mat[mat.length - 1] = i;
        return mat;
    }

}