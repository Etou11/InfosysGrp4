package hsesslingen.group4.jumbleShare.Controller;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Trip;
import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21User;
import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Vehicle;
import hsesslingen.group4.jumbleShare.JumbleShareApplication;

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

    String guid = "6ed0132a-ee25-44cf-95a1-8f4cf9d1da3c";

    public DbController ()
    {

    }

    public void createTrip(Grp4Ss21Trip trip)
    {
        try
        {
            Connection con = DriverManager.getConnection (connectionUrl);

            Statement St = con.createStatement();
            St.executeQuery("INSERT INTO [dbo].[Grp_4_SS21_Trip]\n" +
                    "           ([Id]\n" +
                    "           ,[TimestampStart]\n" +
                    "           ,[TimestampEnd]\n" +
                    "           ,[LongitudeOrig]\n" +
                    "           ,[LatitudeOrig]\n" +
                    "           ,[LongitudeFin]\n" +
                    "           ,[LatitudeFin]\n" +
                    "           ,[VehiclePricePerMinute]\n" +
                    "           ,[UserId]\n" +
                    "           ,[VehicleId])\n" +
                    "     VALUES\n" +
                    "           ('" + guid +"'\n" +
                    "           ,GETDATE() \n" +
                    "           ," + trip.getTimestampEnd() +"\n" +
                    "           ," + trip.getLongitudeOrig() +"\n" +
                    "           ," + trip.getLatitudeOrig() +"\n" +
                    "           ," + trip.getLongitudeFin() +"\n" +
                    "           ," + trip.getLatitudeFin() +"\n" +
                    "           ," + trip.getVehiclePricePerMinute()+"\n" +
                    "           ,'" + trip.getUserId() +"'\n" +
                    "           ,'C7864511-DB27-4086-8471-9DB9BEA93090')");
        }
        catch (Exception e)
        {

        }

    }

    public void updateTrip(Grp4Ss21Trip trip)
    {
        try
        {
            Connection con = DriverManager.getConnection (connectionUrl);

            Statement St = con.createStatement();
            St.executeQuery("UPDATE [dbo].[Grp_4_SS21_Trip]\n" +
                    "   SET [Id] = '"+ guid +"'\n" +
                    "      ,[TimestampStart] = GETDATE() \n" +
                    "      ,[TimestampEnd] = DATEADD(MINUTE, 5, GETDATE()) \n" +
                    "      ,[LongitudeOrig] =  1 \n" +
                    "      ,[LatitudeOrig] = 1 \n" +
                    "      ,[LongitudeFin] = 10 \n" +
                    "      ,[LatitudeFin] = 1 \n" +
                    "      ,[VehiclePricePerMinute] = 1 \n" +
                    "      ,[UserId] = '" + JumbleShareApplication._currentlyActiveUser +"'\n" +
                    "      ,[VehicleId] = 'C7864511-DB27-4086-8471-9DB9BEA93090' \n" +
                    " WHERE Id = '"+ guid +"'");
        }
        catch (Exception e)
        {

        }

    }

    public ArrayList<String> getAllVehicleTypes()
    {
        ArrayList<String> results = new ArrayList<>();
        try
        {
            Connection con = DriverManager.getConnection(connectionUrl);

            String sql = "SELECT * FROM Grp_4_SS21_VehicleType";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next())
            {
                results.add(rs.getString("Id"));
                results.add(rs.getString("Description"));

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

    public void createNewVehicle(Grp4Ss21Vehicle vehicle)
    {
        try
        {
            Connection con = DriverManager.getConnection (connectionUrl);

            Statement St = con.createStatement();
            St.executeQuery("INSERT INTO [dbo].[Grp_4_SS21_Vehicle]\n" +
                    "           ([Id]\n" +
                    "           ,[Brand]\n" +
                    "           ,[PlateOrSerialNumber]\n" +
                    "           ,[PricePerMinute]\n" +
                    "           ,[Longitude]\n" +
                    "           ,[Latitude]\n" +
                    "           ,[UserId]\n" +
                    "           ,[VehicleTypeId])\n" +
                    "     VALUES\n" +
                    "( NEWID(),\n" +
                    "'"+ vehicle.getBrand()  +"',\n" +
                    " '"+ vehicle.getPlateOrSerialNumber()  +"',\n" +
                    " '" + vehicle.getPricePerMinute()+ "',\n" +
                    "'" + vehicle.getLongitude() + "',\n" +
                    "'" + vehicle.getLatitude() + "',\n" +
                    "(SELECT TOP 1 Id FROM [dbo].[Grp_4_SS21_User] WHERE Id = '" + JumbleShareApplication._currentlyActiveUser + "'),\n" +
                    "'" + vehicle.getVehicleTypeId() + "')");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }




}
