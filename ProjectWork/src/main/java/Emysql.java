import java.sql.*;

public class Emysql {

    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root", "1603");
            /*

            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("select * from tb1");
            while(rs.next())
            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
            */

            /*
            PreparedStatement stat = con.prepareStatement("insert into tb1 values (?, ?, ?, ?)");
            stat.setString(1,"Ze");
            stat.setString(2,"Kann");
            stat.setInt(3, 12);
            stat.setInt(4, 500);
            int i = stat.executeUpdate();
            */
/*
            //creating the database
            Statement stat = con.createStatement();
            String sql = "create database temp";
            stat.executeUpdate(sql);


            // dropping the database
            Statement stat = con.createStatement();
            String sql = "drop database temp";
            stat.executeUpdate(sql);

*/

            // insertion without the prepared statements
            Statement stat = con.createStatement();
           // String sql = "insert into tb1 " + "VALUES ('ABC', 'abd', 18, 900)";
            //stat.executeUpdate(sql);
            String sql = "update tb1 SET Name = 'abc' WHERE id = 18";
            stat.execute(sql);
            String sql1 = "select * from tb1";
            ResultSet rs =stat.executeQuery(sql1);
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
            }
            con.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
