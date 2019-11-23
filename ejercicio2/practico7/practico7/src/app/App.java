package app;



public class App {
    public static void main(String[] args) {
    
        double cantVarillas=100;
        double cantTuercas=200;
        double cantLijas=50;
        double cantFlexibles=40;
        double precioVarillas=135;
        double precioTuercas=25;
        double precioLijas=187;
        double precioFlexibles=380;
        double ingresoMensual=(cantVarillas*precioVarillas+cantTuercas*precioTuercas+cantLijas*precioLijas+cantFlexibles*precioFlexibles)/3;
        System.out.println("Ejecicio 1)");
        System.out.println("el ingreso mensual es de "+ingresoMensual);
        System.out.println("Ejecicio 2)");
        int[] meses={1,2,3};
        int[] porcentages={50,90,100,110,120};
        for (int i = 0; i < porcentages.length; i++) {
            for (int j = 0; j < meses.length; j++) {
                ingresoParaVentas(porcentages[i],meses[j], ingresoMensual );
            }
        }
        System.out.println("Ejecicio 3)");
        
        int[] dias={30,45,90};
        String[] items={"varilla","tuercas","flexible","lijas"};
        double[]cant={cantVarillas,cantTuercas,cantLijas,cantFlexibles};
        for (int i = 0; i < porcentages.length; i++) {
            for (int j = 0; j < dias.length; j++) {
                for (int j2 = 0; j2 < items.length; j2++) {
                    stockNesesario(porcentages[i], dias[j], items[j2], cant[j2]); 
                }
            }
        }
    }
  
    public static void stockNesesario(int porcentage,int dias,String item,double cant) {
        double stockNecesario=cant/3/30*dias*porcentage/100;
        System.out.println("El stock necesario al "+porcentage+"% de ventas, de "+item+" para "+dias+" dias es de: "+stockNecesario);
        
    }
    public static void ingresoParaVentas(int porcentage,int meses,double ingresoMensual ) {
        double ingresoParaVentas=ingresoMensual*porcentage/100*meses;
        System.out.println("Los ingresos al "+porcentage+"% son de: "+ingresoParaVentas+" hasta el mes "+meses);
        
    }
 }