package app;

public class App {
    public static void main(String[] args) throws Exception {
    //    Una casa de venta de electrónica, ha vendido en promedio en los últimos 4 meses, 200 capacitores, 
    //    50 leds de color amarillo, 230 botones relé y 65 parlantes. El precio unitario de cada capacitor es de $135, 
    //    el de cada led color amarillo es de $25, cada botón es de $187 y cada parlante cuesta $380.
    //    a. Calcular el ingreso mensual de la casa de electrónica.
    //    b. Calcular el ingreso para ventas que alcancen el 50%, 120% y 350% de las ventas señaladas.
    //    c. Calcular para cada una de dichas hipótesis de venta, el stock de productos necesarios para cubrir 30, 45 y 
    //    90 días de venta.
        double cantCapacitores=200;
        double cantLedAmarillo=50;
        double cantRele=230;
        double cantParlantes=65;
        double precioCapacitores=135;
        double precioLedAmarillo=25;
        double preciotRele=187;
        double precioParlantes=380;
        double ingresoMensual=(cantCapacitores/4*precioCapacitores+cantLedAmarillo/4*precioLedAmarillo+cantParlantes/4*precioParlantes+cantRele/4*preciotRele);
        System.out.println("Ejecicio 1 \na)");
        System.out.println("el ingreso mensual es de "+ingresoMensual);
        System.out.println("b)");
        ingresoMensual=(cantCapacitores/8*precioCapacitores+cantLedAmarillo/8*precioLedAmarillo+cantParlantes/8*precioParlantes+cantRele/8*preciotRele);
        System.out.println("el ingreso mensual al 50% es de "+ingresoMensual);
        ingresoMensual=(cantCapacitores/4*precioCapacitores*6/5+cantLedAmarillo/4*precioLedAmarillo*6/5+cantParlantes/4*precioParlantes*6/5+cantRele/4*preciotRele*6/5);
        System.out.println("el ingreso mensual al 120% es de "+ingresoMensual);
        ingresoMensual=(cantCapacitores/4*precioCapacitores*7/2+cantLedAmarillo/4*precioLedAmarillo*7/2+cantParlantes/4*precioParlantes*7/2+cantRele/4*preciotRele*7/2);
        System.out.println("el ingreso mensual al 350% es de "+ingresoMensual);
        System.out.println("d)");
        hipotecisDeVenta(100, 30);
        hipotecisDeVenta(100, 45);
        hipotecisDeVenta(100, 90);
        hipotecisDeVenta(50, 30);
        hipotecisDeVenta(50, 45);
        hipotecisDeVenta(50, 90);
        hipotecisDeVenta(120, 30);
        hipotecisDeVenta(120, 45);
        hipotecisDeVenta(120, 90);
        hipotecisDeVenta(350, 30);
        hipotecisDeVenta(350, 45);
        hipotecisDeVenta(350, 90);
        AdmistradorDeItems.imprimirIngreso(10, 50);
        AdmistradorDeItems.imprimirIngreso(10, 100);
        AdmistradorDeItems.imprimirIngreso(10, 120);
        AdmistradorDeItems.imprimirIngreso(10, 350);
        int[] porcentages={50,100,120,350};
        int[] dias={30,45,90};
        for (int i = 0; i < porcentages.length; i++) {
            
            for (int j = 0; j < dias.length; j++) {
                AdmistradorDeItems.imprimirStokParaRepocicion(dias[j], porcentages[i]);
            }
        }
    
    }
    public static void hipotecisDeVenta(int porcentage,int dias) {
        double cantCapacitores=200;
        double cantLedAmarillo=50;
        double cantRele=230;
        double cantParlantes=65;
        double stockNecesarioCapacitores=cantCapacitores/4/30*dias*porcentage/100;
        double stockNecesarioLed=cantLedAmarillo/4/30*dias*porcentage/100;
        double stockNesesarioParlantes=cantParlantes/4/30*dias*porcentage/100;
        double stockNecesarioRele=cantRele/4/30*dias*porcentage/100;
        System.out.println("Stock necesario al "+porcentage+"% de capacitores para "+dias+" dias es de: "+stockNecesarioCapacitores);
        System.out.println("Stock necesario al "+porcentage+"% de led para "+dias+" dias es de: "+stockNecesarioLed);
        System.out.println("Stock necesario al "+porcentage+"% de parlantes para "+dias+" dias es de: "+stockNecesarioRele);
        System.out.println("Stock necesario al "+porcentage+"% de rele para "+dias+" dias es de: "+stockNesesarioParlantes);
    }
}