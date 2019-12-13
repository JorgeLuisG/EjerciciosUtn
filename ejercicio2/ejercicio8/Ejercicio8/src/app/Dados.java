package app;



public class Dados {
    private int[] dados=new int[5];
    
    public void tirarDados(){
        
        for (int i = 0; i < this.dados.length; i++) {
            this.dados[i]=(int)(Math.random()*6+1);
        }
        mostrarTiradas();
    }
    public void mostrarTiradas(){
        for (int i = 0; i < this.dados.length; i++) {
            if (i==dados.length-1) {
                System.out.println(this.dados[i]);
            } else {
                System.out.print(this.dados[i]+",");
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
        int caraDado=0;
        boolean bol1=false;
        boolean bol2=false;
        for (int i = 0; i < 3; i++) {
            suma2=0;
            for (int j = 0; j < dados.length; j++) {
                
                if (dados[i]==dados[j]) {
                    suma2++;
                    System.out.println(suma2);
                    if(suma2==3){
                        bol1=true;
                        caraDado=dados[i];
                        break;
                    }
                } 
                
            }
            if (suma2==3){
                break;
            }
            
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < dados.length; j++) {
                if(caraDado!=dados[i]){
                    if (dados[i]==dados[j]) {
                        suma3++;
                        System.out.println(suma3);
                        if(suma3==2){
                            bol2=true;
                            break;
                        }
                    } 
                }
            }
            if (suma3==2){
                break;
            }
            
        }
        System.out.println(bol1+","+bol2);
        if (bol2&&bol1) {
            for (int i = 0; i < dados.length; i++) {
                suma+=dados[i];
            }
        }
        return suma;
    }
    public int CuatroIguales(){
        int suma=0;
        int suma2=0;
        for (int i = 0; i < 5; i++) {
            suma2=0;
            for (int j = 0; j < dados.length; j++) {
                if (dados[i]==dados[j]) {
                    suma2++;
                    suma+=dados[j];
                    System.err.println(i);
                    System.out.println(suma2);
                    System.out.println(suma);
                    if(suma2==4){
                        break;
                    }
                }
            }     
            
            if (suma2==4){
                break;
            }
        }
        return suma;
    }
    public int[] getDados() {
        return dados;
    }
    public void setDados(int[] dados) {
        this.dados = dados;
    }
}
 