package app;

import java.util.Scanner;

public class Practico4 {
    public static void main(String[] args) throws Exception {
      //  int a=0;
     //   int[]mat = new int[8];
        Scanner scan= new Scanner(System.in);
        Scanner scan2= new Scanner(System.in);
     /*   while (a<mat.length ) {
            mat[a]=scan.nextInt();
            a++;
                

            
        }
        for (int i = 0; i < mat.length; i++) {
            if (i==mat.length-1) {
                System.out.println(mat[i]);
            }else{
                System.out.print(mat[i]+",");
            }
            }*/
        System.out.println("Ejercicio 2. Ingrese la longitud del cuadrado");
        crearMarco(scan.nextInt());
        System.out.println("Ejercicio 3. Por favor ingrese una frase");
        crearStringDiagonal(scan2.nextLine());
        System.out.println("Ejercicio 4. Por favor ingrese la longitud de la base de la piramide");
        int x=scan.nextInt();
        crearSemiPiramide(x);
        System.out.println("Ejercicio 5");
        crearPiramide(x);
        System.out.println("Ejercicio 6");
        System.out.println("Ingrese un valor mayor a cero para obtener su logaritmo");
        double argumento=ingresarValorX();
        System.out.println(argumento * Math.log(argumento));
        scan2.close();
        scan.close();
        System.out.println("Ejercicio 7");
        System.out.println("El problema con este codigo es que cada ves que se ejecute el bucle for aumentara en 1 la cantidad de veces que se repita por tanto el bucle se volvera infinito.");
        System.out.println("Ejercicio 7");
        int i=96;
        char c;
        while (i<122) {
            i++;
            c=(char)i;
            System.out.println(c);

        }
    }
    public static void crearMarco(int n) {
        for (int i = 1; i <= n; i++) {
            
            if (i>1&&i<n) {
                for (int j = 1; j <= n; j++) {
                    if (j>1&&j<n) {
                        System.out.print(" ");
                    } else {
                        System.out.print("X");
                    }
                    System.out.print("");
                } 
                System.out.println(""); 
            } else{
                for (int j = 1; j <= n; j++) {
                    System.out.print("X");
                } 
                System.out.println(); 
            }
                

        }
        
    }
    public static void crearStringDiagonal(String frase) {
        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(frase.substring(i,i+1)); 
            
        }

    }
    public static void crearSemiPiramide(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("X");
            }
            System.out.println("");
        }
    }
    public static void crearPiramide(int n) {
        if (n%2==0) {
            for (int i =1; i <= n/2; i+=1) {
                for (int j = (n/2)-i; j > 0; j-=1) {
                    System.out.print(" ");
                }
                
                for (int j = 1; j <= i*2; j+=1) {
                    System.out.print("X");
                }
                System.out.println("");
            }
        } else {
            for (int i =1; i <= ((n+1)/2); i+=1) {
                for (int j = ((n+1)/2)-i; j > 0; j-=1) {
                    System.out.print(" ");
                }
                
                for (int j = 1; j <= i*2-1; j+=1) {
                    System.out.print("X");
                }
                System.out.println("");
            }
        }
       

    }
    private static Scanner scan3= new Scanner(System.in);
    public static double ingresarValorX() {
        
        double x=0;
        do {
            try {
                x=Double.parseDouble(scan3.nextLine());                
                
            } catch (Exception e) {
                System.out.print("ingrese un valor numerico e ");
                x=0;
            }    
            System.out.println("ingrese un valor mayor a 0");
        } while (x<=0);
        return x;
    }

}