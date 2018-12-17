import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class Ejdbc {

    public static void main(String[] args) {
        int ch;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "1603");

            do
            {
                System.out.println("\n");
                System.out.println("Menu:");
                System.out.println("1.Insert Record into the Table");
                System.out.println("2.Update The Existing Record.");
                System.out.println("3.Display all the Records from the Table");
                System.out.println("4.Exit");
                System.out.println("Enter your choice: ");

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                ch=Integer.parseInt(br.readLine());

                switch(ch)
                {
                    case 1:
                        PreparedStatement stat = con.prepareStatement("insert into tb1 values (?, ?, ?, ?)");
                        stat.setString(1,"Ze");
                        stat.setString(2,"Kann");
                        stat.setInt(3, 12);
                        stat.setInt(4, 500);
                        int i = stat.executeUpdate();

                        break;

                    case 2:
                        Statement stats = con.createStatement();
                        // String sql = "insert into tb1 " + "VALUES ('ABC', 'abd', 18, 900)";
                        //stat.executeUpdate(sql);
                        String sql = "update tb1 SET Name = 'abc' WHERE id = 18";
                        stats.execute(sql);

                        break;

                    case 3:
                        Statement stat1 = con.createStatement();
                        ResultSet rs = stat1.executeQuery("select * from tb1");
                        while(rs.next())
                            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));

                        break;

                    case 4:
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice");
                        break;
                }
            }while(ch!=4);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
