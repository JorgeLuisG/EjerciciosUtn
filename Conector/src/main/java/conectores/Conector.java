package conectores;

import java.sql.*;
import java.util.Scanner;

public class Conector {
    public static void main(String[] args) {
        try{
            System.out.println("Ejercicio 1");
            Connection micon= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Contactos?user=JorgeuseUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","jorge32931700");
            Statement s= micon.createStatement();

            ResultSet res= s.executeQuery("Select * from contactos.amigos");

            while (res.next()){
                System.out.println(res.getString("nombre")+" "+res.getDate("fecha de cumpleaños"));
            }
            Statement s2= micon.createStatement();
            ResultSet res2= s2.executeQuery("Select * from contactos.clientes");
            System.out.println("Ejercicio 2");
            while(res2.next()){
                System.out.println(res2.getString("nombre")+" "+res2.getString("apellido")+" "+res2.getDate("checkout"));
            }

            PreparedStatement stmt;

            try {

                System.out.println("ejercicio 3");
                stmt = micon.prepareStatement("INSERT INTO contactos.videojuegos (videoJuegoscol,tipo) VALUES (?,?)");
                stmt.setString   (1, "mario");
                stmt.setString    (2, "plataforma");
                int retorno = stmt.executeUpdate();
                if (retorno>0)
                    System.out.println("Insertado correctamente");
                Statement st = micon.createStatement();
                ResultSet rs = st.executeQuery("Select * from contactos.videojuegos");
                while(rs.next()){
                    System.out.println(rs.getInt("idnew_table")+" "+rs.getString("videoJuegoscol")+" "+rs.getString("tipo"));
                }
                // Cerramos las conexiones, en orden inverso a su apertura
                st.close();


                System.out.println("Llamada agregada con éxito a la base de datos.");
            } catch (SQLException e) {
                System.out.println("Error!, la llamada no pudo ser agregada a la base de datos.");
            }
            System.out.println("ejercicio 4");
            /*PreparedStatement s3;
            s3 = micon.prepareStatement("INSERT INTO contactos.libros (nombre,autor) VALUES (?,?)");
            System.out.println("Ingrese Libro");
            s3.setString   (1, ingresarCampo());
            System.out.println("Ingrese Autor");
            s3.setString    (2, ingresarCampo());
            s3.executeUpdate();*/
            System.out.println("ejercicio 5");
            Statement s4= micon.createStatement();
            //System.out.println(1);
            //String sql="DROP TABLE contactos.productos";
            //System.out.println(2);
            //s4.executeUpdate(sql);
            String sql="CREATE TABLE IF NOT EXISTS contactos.productos ("+"id INT NOT NULL AUTO_INCREMENT, "+"nombre VARCHAR(45) NOT NULL, "+"precio INT NOT NULL,"+" PRIMARY KEY (id));";
            s4.executeUpdate(sql);
            System.out.println(3);
            /*sql="IF NOT EXISTS (SELECT column_name \n" +
                    "FROM contactos.productos \n" +
                    "WHERE table_schema='contactos' \n" +
                    "and table_name='productos' \n" +
                    "and column_name='industria') THEN\n" +
            s4.executeUpdate(sql);*/
            PreparedStatement ps4 = micon.prepareStatement("INSERT INTO contactos.productos (nombre,industria,precio) VALUES (?,?,?)");
            ps4.setString(1, "Celular");
            ps4.setString(2, "China");
            ps4.setInt(3,20000);
            ps4.executeUpdate();
            ps4.setString(1,"tablet");
            ps4.setString(2,"Argentina");
            ps4.setInt(3,50000);
            ps4.executeUpdate();
            System.out.println("ejercicio 6");
            Statement st = micon.createStatement();
            ResultSet rs = st.executeQuery("Select * from contactos.productos mascotas WHERE industria = \"china\" ;");
            while(rs.next()){
                System.out.println(rs.getInt("id")+" "+rs.getString("nombre")+" "+rs.getInt("precio")+" "+rs.getString("industria"));
            }
            ResultSet rs2=st.executeQuery("SHOW FULL TABLES FROM contactos");
            while(rs2.next()){
                System.out.println(rs2.getString("Tables_in_contactos")+" "+rs2.getString("Table_type"));
            }
            System.out.println("ejercicio 7");
            ResultSet rs3 = st.executeQuery("Select * from contactos.peliculas  WHERE pais = \"Corea\" ;");
            while(rs3.next()){
                System.out.println(rs3.getInt("idpeliculas")+" "+rs3.getString("titulo")+" "+rs3.getInt("valoracion")+" "+rs3.getString("director")+" "+rs3.getString("pais")+" "+rs3.getString("genero")+" "+rs3.getInt("duracion"));
            }
            ResultSet rs4 = st.executeQuery("Select * from contactos.peliculas  WHERE duracion < \"60\" ;");
            while(rs4.next()){
                System.out.println(rs4.getInt("idpeliculas")+" "+rs4.getString("titulo")+" "+rs4.getInt("valoracion")+" "+rs4.getString("director")+" "+rs4.getString("pais")+" "+rs4.getString("genero")+" "+rs4.getInt("duracion"));
            }
            ResultSet rs5 = st.executeQuery("Select * from contactos.peliculas  WHERE valoracion >= \"7\" ;");
            while(rs5.next()){
                System.out.println(rs5.getInt("idpeliculas")+" "+rs5.getString("titulo")+" "+rs5.getInt("valoracion")+" "+rs5.getString("director")+" "+rs5.getString("pais")+" "+rs5.getString("genero")+" "+rs5.getInt("duracion"));
            }
            ResultSet rs6 = st.executeQuery("Select * from contactos.peliculas  WHERE valoracion <=5  ;");
            while(rs6.next()){
                System.out.println(rs6.getInt("idpeliculas")+" "+rs6.getString("titulo")+" "+rs6.getInt("valoracion")+" "+rs6.getString("director")+" "+rs6.getString("pais")+" "+rs6.getString("genero")+" "+rs6.getInt("duracion"));
            }
            Scanner scanner = new Scanner(System.in);
            String director= scanner.nextLine();
            ResultSet rs7 = st.executeQuery("Select * from contactos.peliculas  WHERE director =\""+director+"\"  ;");
            while(rs7.next()){
                System.out.println(rs7.getInt("idpeliculas")+" "+rs7.getString("titulo")+" "+rs7.getInt("valoracion")+" "+rs7.getString("director")+" "+rs7.getString("pais")+" "+rs7.getString("genero")+" "+rs7.getInt("duracion"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static String ingresarCampo(){
        Scanner scanner=new Scanner(System.in);
        return scanner.nextLine();

    }
}
