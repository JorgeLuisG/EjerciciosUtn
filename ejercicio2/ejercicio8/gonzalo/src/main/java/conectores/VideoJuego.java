package conectores;

import java.sql.*;

public class VideoJuego {
    public static void main(String[] args) {
        try{
            //conectar
            Connection micon= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Contactos?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root","jorge32931700");
            //crear una sentencia SQL
            String executeQuery = "INSERT INTO contactos.videojuegos  (Genero, Nombre, Creador, Pago) VALUE (?, ?, ?, ?)";;
            PreparedStatement s ;
            s=micon.prepareStatement(executeQuery);
            //juego 1
            s.setString(1, "Moba");
            s.setString(2, "Leagueoflegends");
            s.setString(3, "RiotGames");
            s.setString(4, "Gratuito");
            s.executeUpdate();
            //juego 2
            s.setString(1, "Arcade");
            s.setString(2, "PONG");
            s.setString(3, "Atari");
            s.setString(4, "Gratuito");
            s.executeUpdate();
            //juego 3
            s.setString(1, "Shooter");
            s.setString(2, "Counter Strike");
            s.setString(3, "Bill Gates");
            s.setString(4, "Gratuito");
            s.executeUpdate();
            //crear una sentencia SQL
            Statement s1 = micon.createStatement();
            ResultSet res = s1.executeQuery("SELECT * FROM contactos.videojuegos");
            while (res.next()){
                System.out.println(res.getString("Genero") + " " + res.getString("Nombre") + " " + res.getString("Creador") + " " + res.getString("Pago"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
