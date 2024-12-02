package PreparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Inserts {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqls","root","root");
		PreparedStatement ps=conn.prepareStatement("insert into emps values(1,'dev',300)");
		int i=ps.executeUpdate();
		System.out.println("insert data=>"+i);
	}

}
