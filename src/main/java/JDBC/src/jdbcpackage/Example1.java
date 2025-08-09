package jdbcpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example1 
{
	public static void main(String[] args) 
	{			
			String url="jdbc:mysql://localhost:3306/java11";
			String user="root";
			String password="123456789";
			
			try 
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection(url,user,password);
				
				Statement st=con.createStatement();
				
				String qry="create table emp(id int,name varchar(20),cmp varchar(20))";
				st.execute(qry);
				
				
				con.close();
			}
			catch (ClassNotFoundException e) 
			{
				e.printStackTrace();
			} 
			catch (SQLException e) 
			{
				
				e.printStackTrace();
			}
	}
}

			
