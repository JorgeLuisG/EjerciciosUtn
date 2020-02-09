package conectores;

import java.sql.*;

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


                System.out.println(1);
                stmt = micon.prepareStatement("INSERT INTO contactos.videojuegos (videoJuegoscol,tipo) VALUES (?,?)");
                System.out.println(2);
                stmt.setString   (1, "mario");
                System.out.println(3);
                stmt.setString    (2, "plataforma");
                System.out.println(4);
                int retorno = stmt.executeUpdate();
                System.out.println(5);
                if (retorno>0)
                    System.out.println("Insertado correctamente");
                Statement st = micon.createStatement();
                ResultSet rs = st.executeQuery("Select * from contactos.videojuegos");
                while(rs.next()){

                    System.out.println(rs.getInt("idnew_table")+" "+rs.getString("videoJuegoscol")+" "+rs.getString("tipo"));
                }
                // Cerramos las conexiones, en orden inverso a su apertura
                st.close();
                micon.close();

                System.out.println("Llamada agregada con éxito a la base de datos.");
            } catch (SQLException e) {
                System.out.println("Error!, la llamada no pudo ser agregada a la base de datos.");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
