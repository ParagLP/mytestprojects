package Trampoline;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class InsertIntoDB {

	public static void main(String[] args) throws Exception{
		String url="jdbc:mysql://localhost:3307/student";
		String user="root";
		String password="root";
		//String query1="insert into studinfo values(?,?)";
		String query1="insert into studinfo values(4,'thapa')";
		
		int rollno=5;
		String sname="Rahul";
		
	
		Connection con1=DriverManager.getConnection(url, user, password);
		System.out.println("Successful");
		Statement st=con1.createStatement();
		//PreparedStatement st=(PreparedStatement) con1.prepareStatement(query1);
		//st.setInt(1,rollno);
		//st.setString(2, sname);
		
		int count=st.executeUpdate(query1);
		
		System.out.println(count +"rows affected");

	}

}
