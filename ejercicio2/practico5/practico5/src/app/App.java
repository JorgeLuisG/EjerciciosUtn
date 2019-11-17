package app;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        
        Zapatilla  zapatilla1= new Zapatilla();
        Zapatilla zapatilla2= new Zapatilla();
        System.out.println(Zapatilla.compararMarca(zapatilla1, zapatilla2)); 
        Zapatilla zapatilla3=new Zapatilla();
        System.out.println(zapatilla3.getMarca()); 
        System.out.println(Math.PI+" "+Math.E);
        System.out.println(Math.pow(20, 2));
        LocalDate local= LocalDate.of(2019, 12, 30);
        System.out.println(local);
        Auto auto1=new Auto("ford", "ka","AA 000 AA" );
        Auto auto2=new Auto("Chevrolet", "Classic", 2012, "OOB 456", 40001, 35000);
        System.out.println(auto1.cambiarAceite());
        System.out.println(auto2.cambiarAceite());
        Rectangulo rectangulo;
        for (int i = 1; i < 6; i++) {
            System.out.println("ingrese la base del rectangulo "+i);
            rectangulo = new Rectangulo (ingresarUnFloat(),ingresarUnFloat());
            System.out.println("El area del rectangulo es "+rectangulo.getArea());
            System.out.println("El perimetro del rectangulo es "+rectangulo.getPerimetro());

        }
        Zapateria zapateria=new Zapateria();
        System.out.println("ingrese seis zapattillas");
        for (int i = 1; i < 6; i++) {
            Zapatilla zapatilla=new Zapatilla();
            Zapateria.ingresarDatosDeUnaZapatilla(zapatilla);
            Zapateria.ingresarZapatilla(zapatilla);
        }
        System.out.println(Zapateria.compararIndustrias("Taiwanesa","Canadiense")); 


    }
    public static int ingresarUnEntero(){
        int x;
        Scanner scan = new Scanner(System.in);
        x=scan.nextInt();
        return x;
    }
    public static float ingresarUnFloat(){
        float x;
        Scanner scan = new Scanner(System.in);
        x=scan.nextFloat();
        return x;
    }
    public static String ingresarUnaCadena(){
        String x;
        Scanner scan = new Scanner(System.in);
        
        x=scan.nextLine();
        return x;
    }
    
    public static void borrarAuto(int posicion,Auto[] autos) {
        autos[posicion]=autos[autos.length-1];
        autos=Arrays.copyOf(autos, autos.length-1);


    }
}