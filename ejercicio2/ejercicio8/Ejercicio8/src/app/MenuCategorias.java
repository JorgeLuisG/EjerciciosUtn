package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuCategorias {
    
    private String[] nombre={"Unos","Dos","Tres","Cuatros","Cincos","Seis","Casa llena","Cuatro de un tipo","Escalera Pequeña","Escalera Grande","Eleccion","Yacht"};
    private Scanner scan= new Scanner(System.in);
    private int categoria;
    private Dados dado= new Dados();
    int[] dadoInicial={2,2,3,4,4};
    public void mostrarCategorias(){
        System.out.println("Elige la categoria ingresando el numero que lo antecede");
        for (int i = 0; i < nombre.length; i++) {
            System.out.println((i+1)+". "+nombre[i]);
        }
        dado.tirarDados();
        dado.setDados(dadoInicial);
        obtenerCategoria();
        asignarCategoria();
        
    }
    public void obtenerCategoria(){
        do {
            try {
                categoria=scan.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("ingrese un número");
            }
            
        } while (!(categoria>0&&categoria<nombre.length));
    
    }
    public void asignarCategoria(){
        if (this.categoria>0&&this.categoria<=6){
            System.out.println(dado.sumarIguales(this.categoria));
        }else if(categoria==7){
            System.out.println(dado.sumar3y2Iguales());
        }else if(categoria==8){
            System.out.println(dado.CuatroIguales());
        }
        
    }
}
