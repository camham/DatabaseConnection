import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

public class SimpleAPITest {
	
	
	public SimpleAPITest() {
		
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
			CallableStatement cStmt = con.prepareCall("{API_Name ( ? )}");
			
			System.out.println("Calling API... ");
			
			cStmt.registerOutParameter(1, Types.VARCHAR);
			cStmt.execute();
			System.out.println(cStmt.getString(1));
			
			System.out.println("Done!");
			
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  
		
}
