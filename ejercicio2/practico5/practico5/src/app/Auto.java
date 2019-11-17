package app;

import java.util.Calendar;

public class Auto {
    private String auto;
    private String marca;
    private int modelo;
    private String patente;
    private int km;
    private int ultimoCambioDeAceite;
	public Auto(String auto, String marca, String patente) {
		this.auto = auto;
		this.marca = marca;
        this.patente = patente;
        Calendar calen=Calendar.getInstance();
        this.modelo = calen.get(Calendar.YEAR);
        this.km=0;
        this.ultimoCambioDeAceite=0;
	}
	public Auto(String auto, String marca, int modelo, String patente, int km, int ultimoCambioDeAceite) {
		this.auto = auto;
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.km = km;
		this.ultimoCambioDeAceite = ultimoCambioDeAceite;
    }
    public Boolean cambiarAceite() {
        return km>(ultimoCambioDeAceite+5000);
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getUltimoCambioDeAceite() {
        return ultimoCambioDeAceite;
    }

    public void setUltimoCambioDeAceite(int ultimoCambioDeAceite) {
        this.ultimoCambioDeAceite = ultimoCambioDeAceite;
    }
    
    
    
}
