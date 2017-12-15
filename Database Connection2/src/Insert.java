import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Insert {
	
	public Insert() {
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
			//System.out.println("Executed Query");
			
			//Process Result Set
			ResultSet rs = stmt.executeQuery("INSERT INTO tableName"
					+ "( columnName1, columnName2, columnName3, columnName4, columnName5, columnName6, columnName7, columnName8, columnName9, columnName10, columnName11, columnName12, columnName13, columnName14 ) "
	                + "VALUES ( columnVal1, columnVal2, columnVal3, columnVal4(Ex String 'insert String'), columnVal5[example date('20171214','YYYYMMDD')], columnVal6, columnVal7, columnVal8, columnVal9, columnVal10, columnVal11, columnVal12, columnVal13, columnVal14 )");

			
			con.commit();
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
