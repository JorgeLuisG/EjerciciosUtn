
package app;


  

public class Dados {
    int n;
    int cantCaras;
    int valorMin;
    int valorMax;
    public Dados() {
    }
    public Dados(int cantCaras) {
        this.cantCaras = cantCaras;
        n=1;
        valorMin=0;
        valorMax=valorMin+cantCaras;
    }
    public Dados(int n,int cantCaras) {
        this.n = n;
        this.cantCaras = cantCaras;
        valorMin=0;
        valorMax=valorMin+cantCaras;

    }
    public Dados(int n, int cantCaras, int valorMin) {
        this.n = n;
        this.cantCaras = cantCaras;
        this.valorMin = valorMin;
        valorMax=valorMin+cantCaras;
    }
    private  int[] tirarDados() {
        int[] resultado=new int[n];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i]=(int)(Math.random()*(valorMax+1-valorMin)+valorMin);
        }
        return resultado;
    }
    public void imprimirResultado() {
        for (int i = 0; i < tirarDados().length; i++) {
            if (tirarDados().length-1==i) {
                System.out.println(tirarDados()[i]);
            } else {
                System.out.print(tirarDados()[i]+";");
            }
            
        }
    }
    
    

    
    
    
}