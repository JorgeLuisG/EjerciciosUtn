package app;

import java.util.Arrays;

public class Zapateria {
    private static Zapatilla[] modelosVendo;
    public static void ingresarZapatilla(Zapatilla zapatilla) {
        if(modelosVendo==null){
            modelosVendo = new Zapatilla[]{zapatilla};
        }else{
            int newLength = modelosVendo.length+1 ;
            modelosVendo = Arrays.copyOf(modelosVendo, newLength);
            modelosVendo[newLength-1]=zapatilla;
        }
    }
    public static void ingresarDatosDeUnaZapatilla(Zapatilla zap) {
        System.out.println("ingrese marca de Zapatilla");
        zap.setMarca(App.ingresarUnaCadena());
        System.out.println("ingrese modelo de Zapatilla");
        zap.setModelo(App.ingresarUnaCadena());
        System.out.println("ingrese numero de Zapatilla");
        zap.setNumero(App.ingresarUnEntero());
        System.out.println("ingrese industria de Zapatilla");
        zap.setIndustria(App.ingresarUnaCadena());
    }
    public static String compararIndustria(String industria){
        Boolean comparador=false;
        for (int i = 0; i < modelosVendo.length; i++) {
            if(industria.equalsIgnoreCase(modelosVendo[i].getIndustria())){
                comparador=true;
            }
            
        }
        if (comparador) {
            return ("hay almenos una Zapatilla de la industria "+industria);
        }else return("no hay Zapatillas de la industria "+industria+" ");
        
    }
    public static String compararIndustrias(String industria,String industria2){
        return (compararIndustria(industria)+".Y "+compararIndustria(industria2));
    }
}