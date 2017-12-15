import java.sql.*;

public class Select {
	
	
	public Select() {
		
		try{ 
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			//Class.forName("com.timetenjdbc.TimesTenDriver"); 
			
			//Get Connection
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:UserName/UserPassword@localhost:port#:DatabaseName");
			//System.out.println("Connected!");
			//here SWDB.192.168.0.28 is database name, root is username and password
			
			//Create Statement
			Statement stmt=con.createStatement();
			//System.out.println("Got Statement!");
			
			//Execute SQL query
			//Do not need to ORDER BY
			ResultSet rs=stmt.executeQuery("SELECT * FROM tableName ORDER BY columnId");
			//System.out.println("Executed Query");
			
			//Process Result Set
			while(rs.next())  
			System.out.println(rs.getInt("columnId1") + ", " + rs.getString("columnId2") + "," + rs.getString("columnId3"));
			//System.out.println(rs.getRowId(1));
			System.out.println("Done");
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  
		
}
