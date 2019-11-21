package app;

public class AdmistradorDeItems {
    
    private static final Item capacitor=new Item("capacitor", 200/4, 135);
    private static final Item ledAmariillo=new Item("led Amarillo", 50/4, 25);
    private static final Item rele=new Item("rele", 230/4, 187);
    private static final Item parlantes=new Item("parlantes", 65/4, 380);
    private static final Item[] items={capacitor,ledAmariillo,rele,parlantes};
    public static double ingresoNMeces(int meses) {
        double ingreso=0;
        for (int i = 0; i < items.length; i++) {
            ingreso+=items[i].getCantidadDeProductosMensuales()*items[i].getPreciounit()*meses;
        }
        return ingreso;
    }
    public static double ingresoNMecesPorcentual(int meses, int porcentage) {
        return ingresoNMeces(meses)*porcentage/100;
    }
    public static double[] stockEnDiasPorcentuales(int dias, int porcentage) {
        double stockNesesario[]=new double[items.length];
        for (int i = 0; i < items.length; i++) {
            stockNesesario[i]=dias*items[i].getCantidadDeProductosMensuales()/30*porcentage/100;
        }
        return stockNesesario;
    }
    public static void imprimirIngreso(int mes,int porcentage) {
        for (int i = 1; i < mes; i++) {
            System.out.println("El " +porcentage+"% ingresos acumulados hasta el mes "+i+" es de "+ingresoNMecesPorcentual(i,porcentage));
        }

    }
    public static void imprimirStokParaRepocicion(int dias,int porcentage) {
        double[] stock=stockEnDiasPorcentuales(dias, porcentage);
        
        for (int j = 0; j < items.length; j++) {
            System.out.println("Con un nivel de ventas del "+porcentage+"% se necitan "+stock[j]+" unidades de "+items[j].getDescripcion()+ " para los siguientes "+dias+" dias");
        }
    }
}