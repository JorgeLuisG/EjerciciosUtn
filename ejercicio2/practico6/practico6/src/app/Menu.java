
package app;


import java.util.Scanner;

public class Menu {
    private static int posicion;
    private static Scanner scan=new Scanner(System.in);
    private static int[][] matriz=new int[6][6];
    private static int[] vector=new int[6];
    private static boolean matrizCargada=false;
    private static boolean vectorCargado=false;
    

    public static void imprimirVector(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array.length-1==i) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i]+";");
            }
            
        }
    }
    public static void imprimirMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            
            imprimirVector(matriz[i]);

        }
    }
    public static void imprimirMenu() {
        System.out.println("ingrese 1 para cargar matriz de 6x6");
        System.out.println("ingrese 2 para sumar una fila");
        System.out.println("ingrese 3 para sumar una columna");
        System.out.println("ingrese 4 para sumar la diagonal principal");
        System.out.println("ingrese 5 para sumar la diagonal inversa");
        System.out.println("ingrese 6 para obtener el valor promedio de los elementos de la matriz");
        System.out.println("ingrese 0 para Salir del programa");
    }
    public static void scanearMenu() {
        
        do {
            imprimirMenu();
            posicion=scan.nextInt();
            switch (posicion) {
                case 1:
                    System.out.println("Carge matriz");
                    llenarMatrizConNumeros(matriz);
                    matrizCargada=true;
                    imprimirMatriz();    
                break;
                case 2:
                    
                    
                    vectorCargado=true;
                    if (matrizCargada && vectorCargado) {
                        System.out.println("ingrese un vector");
                        llenarVectorConNumeros(vector);
                        sumarVectorConFila();
                        
                    } else {
                        System.out.println("ingresa una matriz para poder sumar");
                            
                    }
                    
                    break;
                case 3:
                    
                    vectorCargado=true;
                    if (matrizCargada && vectorCargado) {
                        System.out.println("ingrese un vector");
                        llenarVectorConNumeros(vector);
                        sumarVectorConColumna();            
                    } else {
                        System.out.println("ingresa una matriz para poder sumar");                        
                    }
                    break;
                case 4:
                    
                    vectorCargado=true;
                    if (matrizCargada && vectorCargado) {
                        System.out.println("ingrese un vector");
                        llenarVectorConNumeros(vector);
                        sumarVectorConDiagonalPrincipal();        
                    } else {
                        System.out.println("ingresa una matriz para poder sumar");                
                    }
                    break;
                case 5:
                    
                    vectorCargado=true;
                    if (matrizCargada && vectorCargado) {
                        System.out.println("ingrese un vector");
                        llenarVectorConNumeros(vector);
                        sumarVectorConDiagonalInvertida();
                    } else {
                        System.out.println("ingresa una matriz para poder sumar");
                    }    
                    break;
                case 6:
                
                    if (matrizCargada) {
                        System.out.println("ingrese un vector");
                        promediarElementosDdMatriz();
                    } else {
                        System.out.println("ingresa una matriz para poder sumar");
                    }    
                        
                    break;
                case 0:
                    
                    break;
                default:
                    
                        break;
                }
        } while (posicion!=0);
        
    }    
    public static void llenarVectorConNumeros(int[] array) {
        
        Scanner scan= new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i]=scan.nextInt();
        }
        
        
    }
    public static void llenarMatrizConNumeros(int[][] array) {
    
        for (int i = 0; i < array.length; i++) {
            llenarVectorConNumeros(array[i]);
        }
        imprimirMatriz();
        
    }
   
    public static void sumarVectorConColumna(){
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][1]=matriz[i][1]+vector[i];
        }
        imprimirMatriz();
    }

    public static void sumarVectorConFila(){
        
        for (int i = 0; i < matriz.length; i++) {
            matriz[1][i]=matriz[1][i]+vector[i];
        }
        imprimirMatriz();
       
    }
    public static void sumarVectorConDiagonalPrincipal(){
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j==i) {
                    matriz[j][i]=matriz[j][i]+vector[i];
                }
            }
        }
        imprimirMatriz();
    }
    public static void sumarVectorConDiagonalInvertida(){
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j==matriz.length-1-i) {
                    matriz[j][i]=matriz[j][i]+vector[i];
                }
            }
        }
        imprimirMatriz();
    }
    public static void promediarElementosDdMatriz(){
        double k=0;
        double suma=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                k++;
                suma+=matriz[j][i];
            }
        }
        
        System.out.println("El promedio se los elementos de la matriz es "+suma/k);
    }
}