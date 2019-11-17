package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        StringBuilder stb= new StringBuilder();
        stb.append(1);
        Scanner scanner=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String fraseScanner=scanner.nextLine();

        String frase= "Hemos cosechado el doble de durazno que el año anterior";
        String frase2= "¿Eso que vi fue un auto o un gato?";
        System.out.println(frase.length());
        System.out.println(frase.charAt(9));
        System.out.println(frase.charAt(19));
        System.out.println(frase2.substring(12,23));
        System.out.println(frase2.substring(12, 23).length());
        System.out.println("La frase ingresada tiene "+fraseScanner.length()+" caracteres");
        System.out.println("Ingrese otra frase");
        String fraseScanner2=scanner.nextLine();
        System.out.println(fraseScanner2.replace('t', 'p'));
        System.out.println(fraseScanner2.toUpperCase());
        System.out.println(fraseScanner2.toLowerCase());
        System.out.println(fraseScanner2.concat(fraseScanner2));
 /*       String fraseSinVocales=fraseScanner2.replace('a', ' ');
        fraseSinVocales=fraseSinVocales.replace('e',' ');
        fraseSinVocales=fraseSinVocales.replace('i',' ');
        fraseSinVocales=fraseSinVocales.replace('o',' ');
        fraseSinVocales=fraseSinVocales.replace('u',' ');*/

        System.out.println(fraseScanner2.replaceAll("[aeiouAEIOU]"," "));
        System.out.println(fraseScanner2.endsWith("?"));
        System.out.println(fraseScanner2.startsWith("H"));
        

    }
}