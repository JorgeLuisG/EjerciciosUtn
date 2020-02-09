import java.sql.*;

public class ClasePrincipal {
    public static void main(String[] args) {
        try{
            System.out.println(1);
            Connection micon= DriverManager.getConnection("jdbc:mysql://localhost:3306/EjercicioUno","root","jorge32931700");
            System.out.println(2);
            Statement s= micon.createStatement();
            ResultSet res= s.executeQuery("Select*from contactos.amigos");
            while (res.next()){
                System.out.println(res.getString("nombre")+" "+res.getDate("fecha de cumpleaños"));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
