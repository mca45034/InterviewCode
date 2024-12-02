package PreparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Updates {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqls","root","root");
		PreparedStatement ps=conn.prepareStatement("update emps set name='rahul' where id=1");
		int i=ps.executeUpdate();
		System.out.println("update data=>"+i);

	}

}
