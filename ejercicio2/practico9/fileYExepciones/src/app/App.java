package app;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    private static Scanner scan0=new Scanner(System.in);
    private static Scanner scan2=new Scanner(System.in);
    //private static Empleado empleado=new Empleado();
    private static ArrayList<Empleado> list= new ArrayList<Empleado>();
    
    public static void main(String[] args) throws Exception {
        int [] numeros=new int [50];
        int [] pruevaLongitud={1,2,1,2,2,1,2,1,1,2,1,2};
        Scanner scan=new Scanner(System.in);
        String[] numerosStrg=new String[50];
        ArrayList<String> palabras= new ArrayList<String>();
        System.out.println("Ejercicio11");
        Animal perro = new Animal();
        perro.caminar();
        Ave pajaro = new Ave();
        pajaro.volar();
        pajaro.caminar();
        sumaRecursiva(10);
        serieDefibonachi(5);
        System.out.println("ejercicio 7");
        System.out.println(medirLongitudArray(pruevaLongitud,1)); 
        System.out.println("ejercicio 8");
        System.out.println(contarNumeros(pruevaLongitud, 0, 2));
        System.out.println("Ejercicio 9");
        ingresarUnEmpleado();
        System.out.println("Ejercicio 10");
        ImplementacionClaseGenerica implement=new ImplementacionClaseGenerica();
        System.out.println("Llenar de String");
        implement.LLenarString();
        System.out.println("Llenar de Enteros");
        implement.LLenarDeEnteros();
        
        implement.mostrarArray();

        
        System.out.println("Ejercicios Varios");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=(int)(Math.random()*100+1);
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
                    Files.write(ruta3, (numerosStrg[i]+"\n").getBytes(), StandardOpenOption.APPEND);
                }   
            }else{
                for (int i = 0; i < numerosStrg.length; i++) {
                    Files.write(ruta3, (numerosStrg[i]+"\n").getBytes(), StandardOpenOption.CREATE);
                }   
                
            }
            for (String string : lineas) {        
                System.out.println(string);
            }        
        }catch(Exception e){System.out.println("error");}
        scan.close();
    }
    public static int sumaRecursiva(int n) {
        int suma=0;
        if(n==1){
            suma=1;
        }else{
            suma=n;
            suma+=sumaRecursiva(n-1);
            System.out.println(suma);
        }
        
        return suma;
    }
    public static int funcionDefibonachi(int n) {
        int numero=0;
        if(n==1||n==0){
            numero=1;
        }else{
            numero=funcionDefibonachi(n-1)+funcionDefibonachi(n-2);
            
        }
        
        return numero;
    }
    public static void serieDefibonachi(int n) {
        int i=0;
        while (i<=n) {
            i++;
            System.out.println(funcionDefibonachi(i));
        }
        
    }
    public static int medirLongitudArray(int[] array,int longitud){
        final int[] vacio={};
        int [] copia={};
        copia=Arrays.copyOf(array,longitud);
        if (copia.equals(vacio)) {
            longitud=0;
            longitud++;
        } else if(!Arrays.equals(copia, array)){
            longitud++;
            longitud=medirLongitudArray(array,longitud);  
        }
        return longitud;

    }
    public static int contarNumeros(int[] array,int longitud,int numero){
        int [] copia={};
        int suma=0;
        copia=Arrays.copyOf(array,longitud);
        if(!Arrays.equals(copia, array)){
            longitud++;
            if (numero==array[longitud-1]) {
                suma++;
            }
            System.out.println(suma);
            suma+=contarNumeros(array,longitud,numero);  
        }
        return suma;

    }
    public static void ingresarUnEmpleado() {
        boolean estado=false;
        
        do {
            Empleado empleado=new Empleado();
            System.out.println("desea ingresar un empleado o Salir(ingresar/salir)");
            if(scan0.next().equalsIgnoreCase("salir")){
                estado=true;
            }else{
                empleado.setNombre(ingresarNombre("nombre"));
                System.out.println("El nombre es"+empleado.getNombre());
                empleado.setApellido(ingresarApellido("apellido"));
                empleado.setSueldoActual (ingresarSueldo());
                empleado.setAntiguedad(ingresarAntiguedad());
            }
            list.add(empleado);        
        } while (!estado);
        for (int i = 0; i < list.size()-1; i++) {
            System.out.println(list.get(i).toString()); 
        }
        
    }
    public static String ingresarNombre(String dato){
        String nom="";
        System.out.println("ingrese "+dato);
        nom=scan2.nextLine();
        return nom;
    }
    public static String ingresarApellido(String dato){
        System.out.println("ingrese "+dato);

        return scan2.nextLine();
    }
    
    public static double ingresarSueldo(){
        double sueldo;
        sueldo=-1;
        
        
        System.out.println("ingrese sueldo");
        do {
            try {
                sueldo=Double.parseDouble(scan2.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("ingrese un numero");
            }
        } while (sueldo<0);
        
        
        return sueldo;
    }
    public static int ingresarAntiguedad(){
        int antiguedad;
        antiguedad=-1;
        System.out.println("ingrese Antiguedad");
        do {
            try {
                antiguedad=Integer.parseInt(scan2.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("ingrese un numero");
            }
        } while (antiguedad<0);
        
        return antiguedad;
    }
}

    

    /*Scaner Buffer Nio.file
        if (file.exists(ruta))
        try{
            Path ruta=Path.get("datos.txt")
            list<String> lineas=file.readAllLines(ruta); 
            file.write(ruta,"String")*/
