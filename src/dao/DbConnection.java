package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static void main(String[] args) {
		
		System.out.println(DbConnection.getDb());

	}
	
	public static Connection getDb() 
	{
		Connection conn = null;
		String URL = "jdbc:mysql://localhost:3306/atm";
		String user = "root";
		String password = "820812";
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, user, password);
		}
		catch(ClassNotFoundException e) 
		{
			System.out.println("no driver");
			e.printStackTrace();
		}
		catch(SQLException e) 
		{
			System.out.println("no connection");
			e.printStackTrace();
		}
		
		return conn;
	}

}