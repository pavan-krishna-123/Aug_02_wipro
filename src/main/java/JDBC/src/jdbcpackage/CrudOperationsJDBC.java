package jdbcpackage;
import java.sql.Connection;
import java.sql.Statement;

import java.sql.*;
public class CrudOperationsJDBC {
	public static void main(String args[]) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","123456789");
		Statement st=con.createStatement();
		st.executeUpdate("create table student(rno int,name varchar(20),branch varchar(20))");
		st.close();
		con.close();
	}
	
}
