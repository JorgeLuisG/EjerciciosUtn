package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuCategorias {
    
    private String[] nombre={"Unos","Dos","Tres","Cuatros","Cincos","Seis","Casa llena","Cuatro de un tipo","Escalera Pequeña","Escalera Grande","Eleccion","Yacht"};
    private Scanner scan;
    private int categoria;
    private Dados dado= new Dados();
    private int[] categorias= {1,2,3,4,5,6,7,8,9,10,11,12};
    private Jugador jugador;
    int[] dadoInicial={1,2,3,4,5};
    public MenuCategorias(Jugador jugador) {
        this.jugador = jugador;
    }

    
    public void mostrarCategorias(){
        int categoria2;
        int sum=1;
        dado.tirarDados();
        dado.mostrarTiradas();
        do {
            System.out.println("Ingrese 1 para elegir categoria.\nIngrese 2 para bloquear Dados\nIngrese 3 para salir.");
            categoria2=obtenerCategoria2();
            if (categoria2==1) {
                System.out.println("Elige la categoria ingresando el numero que lo antecede");
                for (int i = 0; i < nombre.length; i++) {
                    if(categorias[i]==0){
                        System.out.println((i+1)+". "+nombre[i]+" bloqueada");
                    }else{
                        System.out.println((i+1)+". "+nombre[i]);

                    }
                    
                }
                
                obtenerCategoria();
                asignarCategoria();
                break;
            }else if (categoria2==2) {
                MenuPosicion menuPosicion=new MenuPosicion();
                dado.cambiarPosiciones(menuPosicion.mostrarMenuBloqueo());
                dado.mostrarTiradas();
                if (sum==3){
                    System.out.println("Elige la categoria ingresando el numero que lo antecede");
                for (int i = 0; i < nombre.length; i++) {
                    if(categorias[i]==0){
                        System.out.println((i+1)+". "+nombre[i]+" bloqueada");
                    }else{
                        System.out.println((i+1)+". "+nombre[i]);

                    }
                    
                }
                
                obtenerCategoria();
                asignarCategoria();
                break;
                }
                
                sum++;
            }
        } while (categoria2!=3);
          
        
        //dado.setDados(dadoInicial);
        
        
    }
    public int obtenerCategoria2(){
        int desicion=0;
        do {
            try {
                scan= new Scanner(System.in);
                desicion=scan.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("ingrese un número");
            }
            
        } while (desicion!=1&&desicion!=2&&desicion!=3);
        return desicion;
    }
    public int obtenerCategoria3(){
        int desicion=0;
        do {
            try {
                scan= new Scanner(System.in);
                desicion=scan.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("ingrese un número");
            }
            
        } while (desicion!=1&&desicion!=2&&desicion!=3);
        return desicion;
    }

    public void obtenerCategoria(){
        do {
            try {
                scan= new Scanner(System.in);
                categoria=scan.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("ingrese un número");
            }
            
        } while (!(categoria>0&&categoria<nombre.length+1&&bloquearCategoria()));
    
    }
    public void asignarCategoria(){
        int num1;
        if (this.categoria>0&&this.categoria<=6){
            num1=dado.sumarIguales(this.categoria);
            System.out.println(jugador.getNombre()+" en esta ronda obtuviste "+num1+" puntos");
            jugador.setScore(num1+jugador.getScore());
            System.out.println("Y tus puntos acumulados son "+jugador.getScore());
        }else{
            switch (categoria) {
                case 7:
                    num1=dado.sumar3y2Iguales();
                    System.out.println(jugador.getNombre()+" en esta ronda obtuviste "+num1+" puntos");
                    jugador.setScore(num1+jugador.getScore());
                    System.out.println("Y tus puntos acumulados son "+jugador.getScore());
                    break;
                case 8:
                    num1=dado.cuatroIguales();
                    System.out.println(jugador.getNombre()+" en esta ronda obtuviste "+num1+" puntos");
                    jugador.setScore(num1+jugador.getScore());
                    System.out.println("Y tus puntos acumulados son "+jugador.getScore());
                    break;
                case 9:
                    num1=dado.escaleraPequeña();
                    System.out.println(jugador.getNombre()+" en esta ronda obtuviste "+num1+" puntos");
                    jugador.setScore(num1+jugador.getScore());
                    System.out.println("Y tus puntos acumulados son "+jugador.getScore());
                    break;
                case 10:
                    num1=dado.escaleraGrande();
                    System.out.println(jugador.getNombre()+" en esta ronda obtuviste "+num1+" puntos");
                    jugador.setScore(num1+jugador.getScore());
                    System.out.println("Y tus puntos acumulados son "+jugador.getScore());
                    break;
                case 11:
                    num1=dado.eleccion();
                    System.out.println(jugador.getNombre()+" en esta ronda obtuviste "+num1+" puntos");
                    jugador.setScore(num1+jugador.getScore());
                    System.out.println("Y tus puntos acumulados son "+jugador.getScore());
                    break;
                case 12:
                    num1=dado.yacht();
                    System.out.println(jugador.getNombre()+" en esta ronda obtuviste "+num1+" puntos");
                    jugador.setScore(num1+jugador.getScore());
                    System.out.println("Y tus puntos acumulados son "+jugador.getScore());
                    break;
                default:
                    break;
            }
        }
        
    }
    public boolean bloquearCategoria(){
        boolean bloqueador=false;
        
        for (int i = 0; i < categorias.length; i++) {
            if (categorias[i]==categoria) {
                categorias[i]=0;
                System.out.println("categoria "+(i+1)+" bloqueada");
                bloqueador=true;
                break;
            } else {
                bloqueador=false;
            }
        }
        
        return bloqueador;
    }

    public int[] getCategorias() {
        return categorias;
    }

   
}
