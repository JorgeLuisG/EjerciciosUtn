package app;

public class ClaseGenerica<T> {
    
    public void mostrarArray(T[] objeto) {
        for (int i = 0; i < objeto.length; i++) {
            if (objeto.length-1==i) {
                System.out.println(objeto[i]);
            } else {
                System.out.print(objeto[i]+",");
            }
            
        }

    }





}