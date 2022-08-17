package webLogin;

import java.sql.Connection;
import java.sql.DriverManager;
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
	
	public void Login(String LastName, String Password) throws SQLException {
		System.out.println(LastName + " " + Password);
		String query = "select * from users where LastName='"+LastName+ "' and Password= '" + Password + "'";
		System.out.println(query);
		myRes = myStmt.executeQuery(query);
		if(myRes.next()) { 
			//Orders order = new Orders(myRes.getString("name"),myRes.getString("base"),myRes.getString("size"),myRes.getString("topping1"),myRes.getString("topping2"),myRes.getString("topping3"),myRes.getString("address"));
			//totalOrder.add(order);
			//System.out.println("Inside");
			System.out.println(myRes.getString("PersonID"));
		}
	}
}
