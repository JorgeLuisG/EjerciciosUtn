package app;
import java.util.Scanner;
public class Ejercicio8 {
    
    public static void main(String[] args) throws Exception {
        /*int x=3;
        int y;
        int n;
        int a=47;
        int b=0;
        /*
        if(x<3){
            System.out.println("x");
        }else{
            System.out.println("y");
        }
        if(b==0){
            System.out.println("No se puede dividir por cero");
        }else{
            System.out.println("El resultado de dividir a por b es "+a/b);
        }
        x=ingresarValores();
        if(x>0){
            System.out.println("+1");
        }else{
            System.out.println("-1");
        }
        y=ingresarValores();
        if(y>0){
            System.out.println("+1");
        }else{
            System.out.println("0");
        }
        if(x==y){
            System.out.println("+1");
        }else{
            System.out.println("0");
        }
        do {
            System.out.println("Ingrese 2 valores siendo el primero menor que el segundo");
            a=ingresarValores();
            b=ingresarValores();
        } while (a>=b);
        System.out.println("Ingrese un valores entero");
        n=ingresarValores();
        System.out.println(n>a&&n<b);
        if (x<=y){
            System.out.println(y);
        }else{
            System.out.println(x);
        }
        devolverPar(x);
        comparadorDe3n();
        comparadorDeOrden3n();*/
        ejercicio1sb();
        
        
    }
    static Scanner scanner=new Scanner(System.in);
    public static int ingresarValores() {
        int valor2=0;
        
        
        String fraseScanner;

        do {
            fraseScanner =scanner.nextLine();
            try {
                
                
               
                valor2=Integer.parseInt(fraseScanner);
                
            
            } catch (NumberFormatException e) {
                System.out.println("ingrese un numero");
            }
        } while (valor2<0);
        
        return valor2;
        
    }
    public static void devolverPar(int a) {
        
        if(a%2==0){
            System.out.println("es par");
        }else{
            System.out.println("es impar");
        }
        
    }
    public static void comparadorDe3n() {
        int a;
        int b;
        int c;
        do {
            a=ingresarValores();
            b=ingresarValores();
            c=ingresarValores();
        } while (a>550||b>550||c>550);
        
        if(a==b&&b==c){
            System.out.println("son los tres iguales");
        }else if(((a!=b)&&(a!=c))&&(b!=c)){
            System.out.println("son todos difesonrentes");
        }else {
            System.out.println("ni son todos diferentes ni todoiguales");
        }
    
        
    }
    public static void comparadorDeOrden3n() {
        int a;
        int b;
        int c;
        
        a=ingresarValores();
        b=ingresarValores();
        c=ingresarValores();
        
        
        if(a<b&&b<c){
            System.out.println("estan en orden decreciente");
        }else if(a>b&&b>c){
            System.out.println("estan orden decreciente");
        }else {
            System.out.println("no tienen orden");
        }
    
        
    }
    public static void ejercicio1sb() {
        String pal1="Anana";
        String pal2="Sotos";
        String pal3="Sus";
        String pal4="Motor";
        String pal5="Sometemos";
        String pal6="Suerte";
        String pal7="Poderío";
        String pal8="Nuestros";
        String pal9="JAVA Programming Language";
        ejercicio1sb1(pal1);
        ejercicio1sb1(pal2);
        ejercicio1sb1(pal3);
        ejercicio1sb1(pal4);
        ejercicio1sb1(pal5);
        ejercicio1sb1(pal6);
        StringBuilder builder = new StringBuilder(pal7);
        StringBuilder builder2 = new StringBuilder(pal8);
        StringBuilder builder3 = new StringBuilder(pal9);
        int number1 = 7337;
        int number2 = 11311; 
        int number3 = 113131;
        ejercicio1sb1(String.valueOf(number1));
        ejercicio1sb1(String.valueOf(number2));
        ejercicio1sb1(String.valueOf(number3));
        /*Con la ayuda del método replace de la clase Stringuilder proceda a modificar los strings según se indica a continuación 
•	"Nuestros" cambiar a "Nosotros" 
•	"JAVA Programming Language" cambiar a "JAVA Platform for Windows" • “Poderío” cambiar a "Potrero"
*/      builder.replace(2, 6, "trer");
        builder2.replace(1, 4, "oso");
        builder3.replace(5, builder3.length(), "Platform for Windows");
        System.out.println(builder);
        System.out.println(builder2);
        System.out.println(builder3);

        //palindromos2.append("Sotos").append("Sus").append("Motor").append("Sometemos").append("Suerte"); 

        
        
        

    }
    public static void ejercicio1sb1(String a) {
        StringBuilder palindromos1 = new StringBuilder(a);
        System.out.println(palindromos1.reverse().toString().equalsIgnoreCase(a));
        
    }
    

}