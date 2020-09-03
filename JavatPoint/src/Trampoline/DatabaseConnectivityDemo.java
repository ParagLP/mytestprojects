package Trampoline;
import java.sql.*;

public class DatabaseConnectivityDemo {

	public static void main(String[] args)throws Exception {
	
		//Class.forName("com.jdbc.mysql.Driver");
		String url="jdbc:mysql://localhost:3307/student";
		String user="root";
		String password="root";
		String query="select * from studinfo";
		
		
		Connection con1=DriverManager.getConnection(url, user, password);
		System.out.println("Successful");
		Statement st=con1.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+ "::"+rs.getString(2));
		}
		
     	
	
	

}
}