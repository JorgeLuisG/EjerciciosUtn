package app;

import java.util.Scanner;

public class MenuPosicion {
    private String[] posiciones= {"primer","segundo","tercer","cuarto","quinto"};
    private Scanner scan = new Scanner(System.in);
    private String[] desicion={"n","n","n","n","n"};
    public String[] mostrarMenuBloqueo() {
        
        for (int i = 0; i < posiciones.length; i++) {
            System.out.println("desea bloquear el "+posiciones[i]+" dado S/N");
            do {
                desicion[i]=scan.next();
            } while ((!desicion[i].equalsIgnoreCase("n"))&&(!desicion[i].equalsIgnoreCase("s")));
            
        }
        String[] desicion2= desicion;
        return desicion2;
        
    }

}