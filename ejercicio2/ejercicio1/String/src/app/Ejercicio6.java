package app;

import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) throws Exception {
        
        Double y=0.0;
        Double x=0.0;
        double b=0.0,c=0.0,a=0.0,d=0.0;

        x=ingresarValores();
        y=ingresarValores();
        
        a=ingresarValores();
        b=ingresarValores();
        c=ingresarValores();
        d=ingresarValores();
        
        
        System.out.println(x/y+1);
        System.out.println((x+y)/(x-y));
        System.out.println(Math.pow(b, 2)/2);
        System.out.println((a+b)*c/d);
        System.out.println((x*y)/(a*b));

    }
    static Scanner scanner=new Scanner(System.in);
    public static double ingresarValores() {
        double valor2=0.0;
        
        
        String fraseScanner;

        do {
            fraseScanner =scanner.nextLine();
            try {
                
                
               
                valor2=Double.parseDouble(fraseScanner);
                
            
            } catch (NumberFormatException e) {
                System.out.println("ingrese un numero");
            }
        } while (valor2<0);
        
        return valor2;
        
    }

}
