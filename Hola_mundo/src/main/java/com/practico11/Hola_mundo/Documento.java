package com.practico11.Hola_mundo;

import java.util.Scanner;

public class Documento implements Imprimible{
    public String Texto_Cheto(){
        Scanner scanner=new Scanner(System.in);
        return imprimible(scanner.nextLine());
    }
    @Override
    public String imprimible(String cadena) {
        return cadena;
    }
}
