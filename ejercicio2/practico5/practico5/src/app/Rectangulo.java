package app;

public class Rectangulo {
    private float altura;
    private float base;
    
    public float getArea() {
        return base*altura;
    }
    public float getPerimetro() {
        return base*2+2*altura;
    }

    public Rectangulo(float altura, float base) {
        this.altura = altura;
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }
}