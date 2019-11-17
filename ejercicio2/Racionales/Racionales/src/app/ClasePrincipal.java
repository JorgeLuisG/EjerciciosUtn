package app;


public class ClasePrincipal {

    public static void main(String[] args) throws Exception {
        Racional numero1=new Racional(3,6);
        Racional numero2=new Racional(4,3);
        
        
        
        Racional.show(numero1.suma(numero2));
        Racional.show(numero1.div(numero2));
        Racional.show(numero1.mult(numero2));
    }

}