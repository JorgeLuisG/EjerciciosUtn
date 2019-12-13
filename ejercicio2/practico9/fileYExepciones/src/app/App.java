package app;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int [] numeros=new int [50];
        Scanner scan=new Scanner(System.in);
        String[] numerosStrg=new String[50];
        List<String> palabras= new ArrayList<String>();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=(int)(Math.random()*1+1);
            numerosStrg[i]=String.valueOf(numeros[i]);
        }
        for (int i = 0; i < 5; i++) {
            palabras.add(scan.nextLine());
        }
        try{
            Path ruta=Paths.get("C:\\Users\\WIN10\\Documents\\java-utn\\extencion txt\\50 numeros.txt");
            Path ruta2 =Paths.get("C:\\Users\\WIN10\\Documents\\java-utn\\extencion txt\\palabras.txt");
            for (int i = 0; i < numerosStrg.length; i++) {
                Files.write(ruta, (numerosStrg[i]+"\n").getBytes(),StandardOpenOption.APPEND);
            }
            for (String palabra : palabras) {
                Files.write(ruta2, (palabra+"\n").getBytes(), StandardOpenOption.APPEND);
            }
            Path ruta3 =Paths.get("C:\\Users\\WIN10\\Documents\\java-utn\\extencion txt\\numAleatorio.txt");
            List<String> lineas=Files.readAllLines(ruta);
            if (Files.exists(ruta3)) {
                for (int i = 0; i < numerosStrg.length; i++) {
                    Files.write(ruta3, (numerosStrg+"\n").getBytes(), StandardOpenOption.APPEND);
                }   
            }else{
                for (int i = 0; i < numerosStrg.length; i++) {
                    Files.write(ruta3, (numerosStrg+"\n").getBytes(), StandardOpenOption.CREATE);
                }   
                
            }
            for (String string : lineas) {        
                System.out.println(string);
            }        
        }catch(Exception e){System.out.println("error");}
    }
    /*Scaner Buffer Nio.file
        if (file.exists(ruta))
        try{
            Path ruta=Path.get("datos.txt")
            list<String> lineas=file.readAllLines(ruta); 
            file.write(ruta,"String")*/
}