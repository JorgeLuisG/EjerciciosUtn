package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuCategorias {
    
    private String[] nombre={"Unos","Dos","Tres","Cuatros","Cincos","Seis","Casa llena","Cuatro de un tipo","Escalera Pequeña","Escalera Grande","Eleccion","Yacht"};
    private Scanner scan= new Scanner(System.in);
    private int categoria;
    private Dados dado= new Dados();
    int[] dadoInicial={1,2,3,4,5};
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
            
        } while (!(categoria>0&&categoria<nombre.length+1));
    
    }
    public void asignarCategoria(){
        if (this.categoria>0&&this.categoria<=6){
            System.out.println(dado.sumarIguales(this.categoria));
        }else{
            switch (categoria) {
                case 7:
                    System.out.println(dado.sumar3y2Iguales());
                    break;
                case 8:
                    System.out.println(dado.cuatroIguales());
                    break;
                case 9:
                    System.out.println(dado.escaleraPequeña());
                    break;
                case 10:
                    System.out.println(dado.escaleraGrande());
                    break;
                case 11:
                    System.out.println(dado.sumar3y2Iguales());
                    break;
                case 12:
                    System.out.println(dado.yacht());
                    break;
                default:
                    break;
            }
        }
        
    }
}
