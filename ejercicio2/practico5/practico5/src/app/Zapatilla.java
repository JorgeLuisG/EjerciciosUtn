package app;

public class Zapatilla {
    private String marca;
    private String modelo;
    private int numero;
    private String industria;

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public static Boolean compararMarca(Zapatilla zap1,Zapatilla zap2){
        return zap1.marca.equalsIgnoreCase(zap2.marca);
     }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getIndustria() {
        return industria;
    }

    public void setIndustria(String industria) {
        this.industria = industria;
    }

    public Zapatilla(String marca, String modelo, int numero, String industria) {
        this.marca = marca;
        this.modelo = modelo;
        this.numero = numero;
        this.industria = industria;
    }

    public Zapatilla() {
    }

   
}
