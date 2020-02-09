
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {
        System.out.println("ejercicio 4");
        String[] cadenas={"uno","dos","dos","tres","cuatro","tres","dos"};
        HashSet<String> stringHashSet = new HashSet<>(Arrays.asList(cadenas));
        System.out.println(stringHashSet.toString());
        System.out.println("ejercicio 3");
        Integer[] vector={1,1,3,1,1,4,5,6};
        String[] vector2={"hola","hola",null,null,"1","4","5","hola"};
        System.out.println(contarOcurrencias(vector,1));
        System.out.println(contarOcurrencias(vector2,null));
        System.out.println("ejercicio 2");
        String cadena1="hola1";
        String cadena2="hola2";
        //intercambiar(cadena1,cadena2);
        System.out.println(cadena1+" "+cadena2);
        System.out.println("ejercicio 1");
        Terna<String> terna=new Terna<>("hola1","hola2","hola3");
        Terna<Integer> terna2=new Terna<>(1,2,3);
        Terna<String>terna3=new Terna<>();
        System.out.println(terna2.getElemento(0));
        System.out.println(terna3.getElemento(0));
        System.out.println(terna.getElemento(0));
        System.out.println(terna2.getElemento(1));
        System.out.println(terna.getElemento(1));
        System.out.println(terna2.getElemento(2));
        System.out.println(terna.getElemento(2));
        //System.out.println(terna.getElemento(3));
        //System.out.println(terna.getElemento(3));
        System.out.println(terna);
        System.out.println(terna2);
        System.out.println("ejercicio 5");
        HashSet<Integer> integerHashSet = new HashSet<>(Arrays.asList(vector));
        String[] array = new String[stringHashSet.size()];
        Integer[] vector3=new Integer[integerHashSet.size()];
        int i=0;
        for(String s: stringHashSet){
            array[i]=s;
            i++;
        }
        for (String s : array) {
            System.out.println(s);
        }
        int j=0;
        for(Integer s: integerHashSet){
            vector3[j]=s;
            j++;
        }
        for (Integer s : vector3) {
            System.out.println(s);
        }
        System.out.println("Ejercicio 8");
        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        lista.forEach(System.out::println);
        System.out.println("Ejercicio 9");
        List<Integer> listaMayorACinco= lista.stream().filter(numero->numero>10).collect(Collectors.toList());
        listaMayorACinco.forEach(System.out::println);
        System.out.println("Ejercicio 10");
        List<Integer> listaPares= lista.stream().filter(numero->numero%2==0).collect(Collectors.toList());
        listaPares.forEach(System.out::println);
        System.out.println("Ejercicio 11");
        int[]arrayAleatorio=numerosAleatorios();
        arrayAleatorio= Arrays.stream(arrayAleatorio).sorted().toArray();
        Arrays.stream(arrayAleatorio).forEach(System.out::println);
        System.out.println("Ejercicio 12");
        List<String> list= Arrays.stream(cadenas).filter(palabra-> !palabra.equals("dos")).collect(Collectors.toList());
        list.add("dos");
        System.out.println(list.toString());
        System.out.println("Ejercicio 13");
        Alumno[] alumnos=new Alumno[20];
        alumnos[0]=new Alumno(1,"10000001","Pamela","Perez","quinto",10,17);
        alumnos[1]=new Alumno(2,"10000002","Alumno2","Apellido02","quinto",9,16);
        alumnos[2]=new Alumno(3,"10000003","Mauro","Apellido03","quinto",7,17);
        alumnos[3]=new Alumno(4,"10000004","Jorge","Paredes","quinto",8,16);
        alumnos[4]=new Alumno(5,"10000005","Alumno5","Apellido05","quinto",9,16);
        alumnos[5]=new Alumno(6,"10000006","Luz","Peña","quinto",7,17);
        alumnos[6]=new Alumno(7,"10000007","Ian","Apellido07","quinto",7,16);
        alumnos[7]=new Alumno(8,"10000008","Alumno8","Apellido08","quinto",7,17);
        alumnos[8]=new Alumno(9,"10000009","Arturo","Palacio","quinto",9,17);
        alumnos[9]=new Alumno(10,"10000010","Mariano","Apellido10","quinto",9,16);
        alumnos[10]=new Alumno(11,"10000011","Alumno11","Perez","quinto",8,16);
        alumnos[11]=new Alumno(12,"10000012","Gonzalo","Apellido12","quinto",1,17);
        alumnos[12]=new Alumno(13,"10000013","Alumno13","Apellido13","quinto",7,17);
        alumnos[13]=new Alumno(14,"10000014","Roberto","Apellido14","quinto",9,16);
        alumnos[14]=new Alumno(15,"10000015","Maria","Apellido15","quinto",7,17);
        alumnos[15]=new Alumno(16,"10000016","Alumno1611111","Apellido16","quinto",4,17);
        alumnos[16]=new Alumno(17,"10000017","Guillermo","Apellido17","quinto",7,16);
        alumnos[17]=new Alumno(18,"10000018","Alicia","Apellido18","quinto",8,16);
        alumnos[18]=new Alumno(19,"10000019","Alumno19111","Apellido19","quinto",10,17);
        alumnos[19]=new Alumno(20,"10000020","Fernando","Apellido20","quinto",8,16);
        System.out.println("a)");
        Arrays.stream(alumnos).forEach(System.out::println);
        System.out.println("b)");
        System.out.println("Filtro Apellido");
        Arrays.stream(alumnos).filter(x ->x.getApellido().substring(0,1).equalsIgnoreCase("P")).forEach(System.out::println);
        System.out.println("c)");
        System.out.println("Filtro Nota");
        Arrays.stream(alumnos).filter(x->x.getNota()>=9).forEach(System.out::println);
        System.out.println("d)");
        System.out.println("Filtro minimo");
        System.out.println(Arrays.stream(alumnos).min(Comparator.comparing(Alumno::getDni)));
        System.out.println("e)");
        System.out.println("Filtro maximo");
        System.out.println(Arrays.stream(alumnos).max(Comparator.comparing(Alumno::getDni)));
        System.out.println("f)");
        System.out.println("Filtro termina con o");
        Arrays.stream(alumnos).filter(x->x.getNombre().substring((x.getNombre().length()-1)).equalsIgnoreCase("o")).forEach(System.out::println);
        System.out.println("g)");
        System.out.println("Filtro Apellido con mas de 10 letras");
        Arrays.stream(alumnos).filter(x->x.getApellido().length()>=10).forEach(System.out::println);
        System.out.println("h)");
        Alumno[] listaMenorA6=Arrays.stream(alumnos).filter(x->x.getNota()<6).toArray(Alumno[]::new);
        Arrays.stream(listaMenorA6).forEach(System.out::println);
        System.out.println("i)");
        Alumno[] listaIgualA10=Arrays.stream(alumnos).filter(x->x.getNota()==10).toArray(Alumno[]::new);
        Arrays.stream(listaIgualA10).forEach(System.out::println);
        System.out.println("j)");
        Alumno[] listaEmpiesenConAYLongMayorA8=Arrays.stream(alumnos).filter(x->x.getNombre().substring(0,1).equalsIgnoreCase("A")&&x.getNombre().length()>8).toArray(Alumno[]::new);
        Arrays.stream(listaEmpiesenConAYLongMayorA8).forEach(System.out::println);
        
        System.out.println("k)");
        System.out.println(Arrays.stream(alumnos).count());
        System.out.println("l)");
        Arrays.stream(alumnos).sorted(Comparator.comparing(Alumno::getApellido)).forEach(System.out::println);
        System.out.println("Ejercicio 6");
        Scanner scan=new Scanner(System.in);
        System.out.println("ingrese tamaño matriz");
        int tamagnoMatriz=scan.nextInt();
        System.out.println("ingrese longitud password");
        int longitudPwd=scan.nextInt();

        Password[] pwds=new Password[tamagnoMatriz];
        boolean[] fuertes=new boolean[tamagnoMatriz];
        for (int k = 0; k <pwds.length ; k++) {
            pwds[k]=new Password(longitudPwd);
            fuertes[k]=pwds[k].esFuerte();
            System.out.println(pwds[k].getPwd()+" es fuerte: "+fuertes[k]);
        }
        guardaPwd(pwds,fuertes);




    }
    public static void guardaPwd(Password[] pwds,boolean[] esFuerte){
        try{

            Path ruta= Paths.get("C:\\Users\\WIN10\\Documents\\java-utn\\extencion txt\\password.txt");
            Files.delete(ruta);
            Files.write(ruta, ("").getBytes(), StandardOpenOption.CREATE_NEW);

            for (int i = 0; i < pwds.length; i++) {
                if (esFuerte[i]){
                    Files.write(ruta, (i+": "+pwds[i].getPwd()+"\n").getBytes(), StandardOpenOption.APPEND);
                }
            }
            Path ruta3 =Paths.get("C:\\Users\\WIN10\\Documents\\java-utn\\extencion txt\\password2.txt");
            List<String> palabras=Files.readAllLines(ruta3);
            Password pwd=new Password();
            ArrayList<String> fuertes=new ArrayList<>();
            for (String palabra : palabras ){
                if(pwd.esFuerte(palabra)) {
                    Files.write(ruta, (palabra + "\n").getBytes(), StandardOpenOption.APPEND);
                    fuertes.add(palabra);
                }
            }
            System.out.println(Password.contarFuertes(fuertes));

        }catch(IOException e){System.out.println("error");}

    }
    public static <T> int contarOcurrencias(T[] matriz, T elemento) {
        int acum = 0;
        for (T t : matriz) {
            if (t == null) {
                acum++;
            } else if (t.equals(elemento)) {
                acum++;
            }

        }
        return acum;
    }
    public static int[] numerosAleatorios(){
        int [] arrayAleatoria=new int[50];
        for (int i = 0; i < arrayAleatoria.length; i++) {
            arrayAleatoria[i]=(int)(Math.random()*50+1);
        }
        return arrayAleatoria;
    }

    /*public static <T> void intercambiar(T item1, T item){
        T aux=item;
        item=item1;
        item1=aux;
    }*/

}
