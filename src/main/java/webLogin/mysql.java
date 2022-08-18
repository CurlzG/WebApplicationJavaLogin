package webLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mysql {
	
	public Connection myConn;
	public Statement myStmt;
	public ResultSet myRes;
	
	public mysql() throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo",System.getenv("Username"),System.getenv("Password"));
		myStmt = myConn.createStatement();
		
	}
	
	public boolean Login(String LastName, String Password) throws SQLException {
		boolean allowed = false;
		String query = " select * from users where LastName = ? and Password = ? ";
		PreparedStatement p = myConn.prepareStatement(query);
		p.setString(1,LastName);
		p.setString(2,Password);
		myRes = p.executeQuery();
		if(myRes.next()) { 
			//System.out.println(myRes.getString("PersonID"));
			allowed = true;
		}
		return allowed;
	}
}
