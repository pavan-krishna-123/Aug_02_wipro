package jdbcpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class RetrivalData{
	public static void main(String args[]) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","123456789");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from student");
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}
		rs.close();
		
		st.close();
		con.close();
	}
}
