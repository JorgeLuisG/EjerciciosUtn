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
                System.out.println(dados[i]);
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
    public void cambiarPosiciones(String[] desiciones) {
        for (int i = 0; i < dados.length; i++) {
            if (desiciones[i].equalsIgnoreCase("n")) {
                dados[i]=(int)(Math.random()*6+1);
            } 
        }
    }
    public int sumarIguales(int n){
        int suma=0;
        for (int i = 0; i < dados.length; i++) {
            if (n==dados[i]) {
                suma+=dados[i];
            }
            
        }
        return suma;
    }
    public int sumar3y2Iguales(){
        int suma=0;
        int suma2=0;
        int suma3=0;
        boolean bol1=false;
        boolean bol2=false;
        for (int i = 0; i < dados.length; i++) {
            for (int j = 1; j < dados.length; j++) {
                if (i!=j) {
                    if(i==0){
                        if (dados[i]==dados[j]) {
                            suma2++;
                        
                            if(suma2==3){
                                bol1=true;
                            }
                        
                        } 
                    }else if(dados[0]!=dados[i]){                    
                        if (dados[i]==dados[j]) {
                            suma3++;
                            suma+=dados[i];
                            if(suma3==2){
                                bol2=true;
                            }
                            
                        } 
                    }
                     
                }
                
                
            }
        }
        if (bol2&&bol1) {
            
        }
        
        return suma;
    }


    
}
 