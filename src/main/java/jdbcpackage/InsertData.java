package jdbcpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class InsertData{
	public static void main(String args[]) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","123456789");
		Statement st=con.createStatement();
		//int i=st.executeUpdate("insert into student values(1,'ajay','cse')");
		int i=st.executeUpdate("insert into student values(2,'ram','Civil')");
		 i=st.executeUpdate("insert into student values(3,'vijay','Ece')");
		 i=st.executeUpdate("insert into student values(4,'koti','cse')");
		 i=st.executeUpdate("insert into student values(5,'zunid','eee')");
		System.out.println("Records Inserted are"+i);
		st.close();
		con.close();
	}
	
}
