package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Ice;

/**
 *
 * @author admin
 */
public class DBConnection {
    public boolean insertNewice(Ice ice) {
        boolean result = false;
        Connection connection = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3305/Icecream1",
                    "root", "UBU_12345678");

            Statement statement;
            statement = connection.createStatement();

        
            String yummy = "";
            int nl = ice.getYummy().length;
            
 
            for(int i=0; i < nl - 1; i++){
                yummy = yummy + ice.getYummy()[i] + ";";
            }

            yummy = yummy + ice.getYummy()[nl-1];
            
            String query = "INSERT INTO icecream "
                    + "(name, type, yummy, toping, price) "
                    + "VALUES('"
                    + ice.getName() + "','"
                    + ice.getType() + "','"
                    + yummy + "','"
                    + ice.getToping() + "',"
                    + ice.getPrice() + ")";
            System.out.println("........SQL: " + query);

            int i = statement.executeUpdate(query);	
            if (i != 0) {
                result = true;
            }
            statement.close();
            connection.close();
        } catch (Exception exception) {
            System.out.println(exception);
        }

        return result;

    }

    /*
    https://www.geeksforgeeks.org/java-database-connectivity-with-mysql/
     */
    public void testRetrieve() {
        Connection connection = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3305/Icecream",
                    "root", "UBU_12345678");

            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select name from icecream");
            String name;
            while (resultSet.next()) {
                name = resultSet.getString("name").trim();
                System.out.println(" name : " + name);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

}


