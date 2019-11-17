package app;

public class ClaseString {
    
    public static void main(String[] args) throws Exception {
        String cadena1= "hola";
        String cadena2= "hola";
        String nulo="";
        String saludo="java\u2122";
        String saludo1="hola mundo";
        String semana=String.join(" ","Lunes", "martes","miercoles","jueves","viernes");
        System.out.println(saludo.substring(1,3));
        System.out.println(saludo);
        System.out.println(saludo1.substring(5,10));
        System.out.println(saludo1+saludo);
        System.out.println(saludo1.concat(saludo));
        System.out.println(semana);
        System.out.println(cadena1==cadena2);
        System.out.println("hola".equals(cadena2));
        System.out.println("Hola".equalsIgnoreCase(cadena1));
        System.out.println("".length());
        
        if(nulo!=null&&nulo.isEmpty()){
            System.out.println("la cadena no es nula");
        }

    }
}