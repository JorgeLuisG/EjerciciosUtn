package app;

import java.util.Random;

public class Dados {
    int[] dados=new int[6];
    Random dado= new Random();
    public void tirarDados(){
        for (int i : dados) {
            dados[i]=dado.nextInt()*6+1;
        }
        mostrarTiradas();
    }
    public void mostrarTiradas(){
        for (int i = 0; i < dados.length; i++) {
            System.out.println(dados[i]); 
            
        }
    }
    
}
