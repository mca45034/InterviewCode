package Statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqls", "root", "root");
		Statement stmt=conn.createStatement();
		int i=stmt.executeUpdate("insert into emp values(7,'xyz',399)");
		System.out.println("data inserted=>"+i);
	}

}
