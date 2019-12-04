package app;



public class Dados {
    int[] dados=new int[6];
    public void tirarDados(){
        for (int i = 0; i < dados.length; i++) {
            dados[i]=(int)(Math.random()*6+1);
        }
        mostrarTiradas();
    }
    public void mostrarTiradas(){
        for (int i = 0; i < dados.length; i++) {
            if (i==dados.length-1) {
                System.out.print(dados[i]);
            } else {
                System.out.print(dados[i]+",");
            }
             
            
        }
    }
    public void bloquearUnaPocicion(int posicion) {
        for (int i = 0; i < dados.length; i++) {
            if (posicion!=i) {
                dados[i]=(int)(Math.random()*6+1);
            } 
        }
    }
    
}
