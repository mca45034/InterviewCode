package PreparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Deletes {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqls","root","root");
		PreparedStatement ps=conn.prepareStatement("delete from emps where id=1");
		int i=ps.executeUpdate();
		System.out.println("deleted data=>"+i);


	}

}
