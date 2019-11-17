package app;

import java.util.Scanner;

public class Practico3 {
    public static void main(String[] args) throws Exception {
        
        Scanner scan=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
    /*    int x=scan.nextInt();
        int y=scan.nextInt();
        int aux=x;
        x=y;
        y=aux;
        System.out.println("x= "+x+" y= "+y);
        int key=scan.nextInt();
        switch (key) {
            case 1:
                System.out.println("uno");    
                break;
            case 2:
                System.out.println("dos");     
                break;
            case 3:
                System.out.println("tres");     
                break;
            case 4:
                System.out.println("cuatro");     
                break;
            case 5:
                System.out.println("cinco");     
                break;
            case 6:
                System.out.println("seis");     
                break;
            case 7:
                System.out.println("siete");     
                break;
            case 8:
                System.out.println("ocho");     
                break;
            case 9:
                System.out.println("nueve");     
                break;
            case 10:
                System.out.println("dies");     
                break;
            default:
                System.out.println("otro"); 
                break;
        }
        for(int n=10;n>0;n=n-2){
            System.out.println("Hola");
            System.out.println(n);
        }
        double n=2;
        for(;n>0;n=n-0.5){
            System.out.println(n);
        }
        System.out.println("Ejercicio4");
        String palabra= scan2.nextLine();
        for(int i=0;i<palabra.length();i++){
            System.out.println(palabra.substring(i,i+1));
        }
        System.out.println("Ejercicio5");
        for(int i=palabra.length();i>0;i--){
            System.out.println(palabra.substring(i-1,i));
        }
        String abecedario="bcdfghjklmnñpqrstvwxyz";
        System.out.println("Ejercicio6");
        for(int i=0;i<palabra.length();i++){
            
           for(int j=0;j<abecedario.length();j++){
                if(palabra.substring(i,i+1).equalsIgnoreCase(abecedario.substring(j,j+1))){
                 System.out.println(palabra.substring(i,i+1));
                }
                
           }
            
        }
        int acum=0;
        String vocales="aeiou";
        System.out.println("Ejercicio7");
        for(int i=0;i<palabra.length();i++){
            
           for(int j=0;j<vocales.length();j++){
                if(palabra.substring(i,i+1).equalsIgnoreCase(vocales.substring(j,j+1))){
                    acum++;
                    
                }
           }
            
        }
        System.out.println("la cantida de vocales de la frase es "+acum);
        System.out.println("Ejercicio8");
        int acum2=0;
        for(int i=0;i<palabra.length();i++){  
            if(palabra.substring(i,i+1).equalsIgnoreCase(" ")){
                acum2++;       
            }   
        }
        System.out.println("la cantida de espacios de la frase es "+acum2);
        System.out.println("Ejercicio10");
        System.out.println("ingrese un número");
        int num =scan.nextInt();
        boolean noEsPrimo=false;
        for(int i=2;i<num-1;i++){
            if(num%i==0){
                noEsPrimo=true;
            }
        }
        if (noEsPrimo){
            System.out.println("El valor ingresado no es primo");
        }else{
            System.out.println("es primo");
           }*/ 
       /* System.out.println("Ejercicio11");
        int num2;
        int suma[]=new int[10];
        int resultado=0;
        int mayor;
        int menor;
        for(int i=0;i<10;i++){
            num2=scan.nextInt();
            suma[i]=num2;
            resultado+=suma[i];
        } 
        System.out.println("la suma de los valores ingresados es "+resultado);
        System.out.println("Ejercicio12");
        int num3;
        int suma2[]=new int[30];
        int resultado2=0;
        float resultado3=0;
        
        for(int i=0;i<30;i++){
            num3=scan.nextInt();
            suma2[i]=num3;
            resultado2+=suma2[i];
        } 
        resultado3=resultado2/30;
        System.out.println("el promedio de los valores ingresados es "+resultado3);
      System.out.println("Ejercicio13");
        int contador=2;
        int contador2=0;
        boolean noEsPrimo;
        do {
            noEsPrimo=false;
            for (int i = 2; i <contador-1; i++) {
                if (contador%i==0) {
                    noEsPrimo=true;
                }
                
            }
            if (!noEsPrimo) {
                System.out.println(contador);
                contador2++;
            }
            contador++;
        } while (contador2<20);
        scan.close();
        scan2.close();
        mayor=suma[1];
        menor=suma[1];
        for(int i=1;i<suma.length;i++) {
        
            if (suma[i]>mayor) {
                mayor=suma[i];
            } 
            
        }
        System.out.println("el mayor numero ingresado es "+mayor);
        for(int i=1;i<suma.length;i++) {
        
            if (suma[i]<menor) {
                menor=suma[i];
            } 
            
        }
        System.out.println("el menor numero ingresado es "+menor);
        int ran;
        int[] mat=new int[20];
        for (int i = 0; i < mat.length; i++) {
            ran=(int)Math.round(Math.random());

            mat[i]=ran;
            System.out.print(mat[i]+";");
        }
        
        System.out.println("");
        for(int i = 0; i < mat.length - 1; i++)
        {
            for(int j = 0; j < mat.length - 1; j++)
            {
                if (mat[j] > mat[j + 1])
                {
                    int aux = mat[j+1];
                    mat[j+1] = mat[j];
                    mat[j] = aux;
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            
            System.out.print(mat[i]+";");
        }*/
        int suma=0;
        int[][] mat2={{4,7,-5,4},{0,3,-2,6},{1,2,4,1},{6,1,0,3}};
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                if (i!=j) {
                    suma+=mat2[i][j];
                    
                }
            }
        }
        System.out.println(suma);
        double x=ingresarValorX();
        System.out.println(x*Math.log(x));
    }
    public static void quicksort(int A[], int izq, int der) {

        int pivote=A[izq]; 
        int i=izq; 
        int j=der; 
        int aux;
       
        while(i<j){            
           while(A[i]<=pivote && i<j) i++; 
           while(A[j]>pivote) j--;         
           if (i<j) {                              
               aux= A[i];                 
               A[i]=A[j];
               A[j]=aux;
           }
         }
         A[izq]=A[j]; 
         A[j]=pivote; 
         if(izq<j-1)
            quicksort(A,izq,j-1); 
         if(j+1 <der)
            quicksort(A,j+1,der);
    }
   
    
}