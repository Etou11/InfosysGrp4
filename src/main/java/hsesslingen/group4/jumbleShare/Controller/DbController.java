package hsesslingen.group4.jumbleShare.Controller;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21User;

import java.sql.*;
import java.util.ArrayList;
import java.util.UUID;

public class DbController
{
    String dbHost = "ITNT0005";
    String dbPort = "1433";
    String dbName = "Infosys";
    String dbUser = "wkb6";
    String dbPass = "wkb6";

    String connectionUrl = "jdbc:sqlserver://"+
            dbHost+":"+
            dbPort+";"+
            "databaseName="+dbName+";"+
            "user="+dbUser+";"+
            "password="+dbPass+";";

    Connection con = null;
    PreparedStatement p_stmt = null;
    ResultSet rs = null;

    public DbController ()
    {

    }

    public ArrayList<String> getAllUser()
    {
        ArrayList<String> results = new ArrayList<>();
        try
        {
            Connection con = DriverManager.getConnection(connectionUrl);

            String sql = "SELECT * FROM Grp_4_SS21_User";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next())
            {
                results.add(rs.getString("FName"));
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return results;
    }

    public void createNewUser(Grp4Ss21User user)
    {
        try
        {
            Connection con = DriverManager.getConnection (connectionUrl);

            Statement St = con.createStatement();
            St.executeQuery("INSERT INTO [dbo].[Grp_4_SS21_User]\n" +
                    "           ([Id]\n" +
                    "           ,[FName]\n" +
                    "           ,[LName]\n" +
                    "           ,[UserName]\n" +
                    "           ,[Email]\n" +
                    "           ,[Password]\n" +
                    "           ,[DateOfBirth]\n" +
                    "           ,[City]\n" +
                    "           ,[Country]\n" +
                    "           ,[PostCode]\n" +
                    "           ,[StreetAndNumber])\n" +
                    "     VALUES\n" +
                    "('" + UUID.randomUUID() + "',\n" +
                    "'"+ user.getFName()  +"',\n" +
                    " '"+ user.getLName()  +"',\n" +
                    " '" + user.getUserName() + "',\n" +
                    "'" + user.getEmail() + "',\n" +
                    "'" + user.getPassword() + "',\n" +
                    "CAST('"+ user.getDateOfBirth() +"' AS date),\n" +
                    "'" + user.getCity() + "',\n" +
                    "'"+ user.getCountry() +"',\n" +
                    "" + user.getPostCode() + ",\n" +
                    "'" + user.getStreetAndNumber() + "')");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }


}
