import java.util.ArrayList;
import java.util.Random;

public class Password {
    private int longitud;

    public Password() {
        this.longitud = 8;
        generarPwd();
    }
    public Password(int longitud) {
        this.longitud = longitud;
        generarPwd();
    }



    public String getPwd() {
        return pwd;
    }
    private String pwd;
    public boolean esFuerte(){
        return(contarMayusculas(pwd)>2&&contarMinusculas(pwd)>=1&&contarNumeros(pwd)>=5);
    }
    public boolean esFuerte(String cadena){
        return(contarMayusculas(cadena)>2&&contarMinusculas(cadena)>=1&&contarNumeros(cadena)>=5);
    }
    private static int contarMayusculas(String pwd){
        return (int) pwd.chars().filter(Character::isUpperCase).count();
    }
    private static int contarMinusculas(String pwd){
        return (int) pwd.chars().filter(Character::isLowerCase).count();
    }
    private static int contarNumeros(String pwd) {
        return (int)pwd.codePoints().filter(Character::isDigit).count();
    }
    public void generarPwd() {
        StringBuilder cadena= new StringBuilder();
        char caracter;
        for (int i = 0; i < longitud; i++) {
            String chars = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789";
            Random rnd = new Random();
            caracter = chars.charAt(rnd.nextInt(chars.length()));
            cadena.append(caracter);
        }
        pwd=cadena.toString();
    }
    public static int contarFuertes(ArrayList<String> arrayCadena){
        return arrayCadena.size();
    }
}