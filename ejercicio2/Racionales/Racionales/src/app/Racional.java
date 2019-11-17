package app;

public class Racional {
    private int numerador;
    private int denominador;

    public Racional() {
        numerador=0;
        denominador=0;
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public void show() {
        if(numerador<denominador){
            for (int i = 2; i < numerador; i++) {
                if (numerador%i==0&&denominador%i==0) {
                    numerador=numerador/i;
                    denominador=denominador/i;
                }
            }
        
        }else{
            if(numerador>denominador){
                for (int i = 2; i <denominador; i++) {
                    if (numerador%i==0&&denominador%i==0) {
                        numerador=numerador/i;
                        denominador=denominador/i;
                    }
                }
            }
        }
        System.out.println(numerador+"/"+denominador);
    }
    public static void show(Racional racional) {
        racional.show();
    }
    public Racional invert(){
        Racional racional=new Racional();
        racional.numerador=denominador;
        racional.denominador=numerador;
        return racional;

    }
    public Double toDouble(){
        return ((double)numerador/(double)denominador);
    }
    public Racional sumaIgualDenominador(Racional racional) {
        Racional racional2=new Racional();
        if (denominador==racional.denominador) {
            racional2.numerador=numerador+racional.numerador;
            racional2.denominador=denominador;
        } else {
            System.out.println("utilice el metodo suma");
        }
        return racional2;
    }
    public void igualarDenominadores(Racional racional) {
        numerador=racional.denominador*numerador;
        racional.numerador=racional.numerador*denominador;
        int aux=denominador;
        denominador=denominador*racional.denominador;
        racional.denominador=aux*racional.denominador;
    }

    public Racional suma (Racional racional){
        this.igualarDenominadores(racional);
        return this.sumaIgualDenominador(racional);
    }
    public Racional restaIgualDenominadores(Racional racional) {
        Racional racional2=new Racional();
        if (denominador==racional.denominador) {
            racional2.numerador=numerador-racional.numerador;
            racional2.denominador=denominador;
        } else {
            System.out.println("utilice el metodo resta");
        }
        return racional2;
    }
    public Racional resta (Racional racional){
        this.igualarDenominadores(racional);
        return this.restaIgualDenominadores(racional);
    }
    public Racional mult (Racional racional){
        Racional racional2=new Racional();
        racional2.numerador=numerador*racional.numerador;
        racional2.denominador=denominador*racional.denominador;
        return racional2;
    }
    public Racional div(Racional racional) {
        return this.mult(racional.invert());
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
}