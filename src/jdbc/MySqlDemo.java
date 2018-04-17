package jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;

public class MySqlDemo {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "root", "root");
			Statement stmt = (Statement) connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee");
//			ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
//            int columnCount = rsmd.getColumnCount();
//            System.out.println(columnCount);
//            for(int i=1;i<=columnCount;i++){
//                System.out.print(rsmd.getColumnName(i)+"     ");
//                System.out.println(rsmd.getColumnType(i));
//            }
			System.out.println("ResultSet Curson is at before first: "+rs.isBeforeFirst());
			while (rs.next())
				System.out.println(rs.getString(1) + "  " + rs.getString(2)+ "  " +rs.getString(3)+ "  " +rs.getInt(4));
			connection.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
