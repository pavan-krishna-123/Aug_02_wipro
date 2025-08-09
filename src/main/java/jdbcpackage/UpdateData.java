package jdbcpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class UpdateData
{
	public static void main(String args[]) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","123456789");
		Statement st=con.createStatement();
		int i=st.executeUpdate("update student set rno=12 where branch='cse'");
		System.out.println("records updated is"+i);
		
		st.close();
		con.close();
	}
}
