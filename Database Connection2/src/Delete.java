import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Delete {
	public Delete() {
		try{ 
			
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			//Class.forName("com.timetenjdbc.TimesTenDriver"); 
			
			//Get Connection
			Connection con=DriverManager.getConnection(  
			//"jdbc:mysql://localhost:1521/SWDB.168.0.28","dean22","SWDB_API_USER");
			"jdbc:oracle:thin:UserName/UserPassword@localhost:port#:DatabaseName");
			//System.out.println("Connected!");
			//here SWDB.192.168.0.28 is database name, root is username and password
			
			//Create Statement
			Statement stmt=con.createStatement();  
			//System.out.println("Got Statement!");
			
			
			//Process Result Set
			ResultSet rs = stmt.executeQuery("DELETE FROM tableName WHERE columnName");
			
			
			con.commit();
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
