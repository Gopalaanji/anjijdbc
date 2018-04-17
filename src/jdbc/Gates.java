package jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Gates {
	public static void main(String[] args) {
		try (// --------------try-with-resources begin-------------//
				// Creating connection
		Connection con = (Connection) DriverManager.getConnection(
				"");
				// Creating statement
				Statement stmt = (Statement) con.createStatement();
				// Executing query
				ResultSet rs = stmt
						.executeQuery("select *  from gate where ulbid=144");)// --------------try-with-resources
		// end--------------//
		{ // ----------------try block begin---------------------//
			// Creating CachedRowSet
			CachedRowSet cRS = RowSetProvider.newFactory().createCachedRowSet();
			// Populating ResultSet data into CachedRowSet
			cRS.populate(rs);
			
			while (cRS.next()) {
				System.out.println(cRS.getString(15) + "  " + cRS.getString(2) + ""
						+ cRS.getInt(3));
			}
		} // ----------------try block end----------------------//
		catch (Exception e) { // Exception handler
			System.out.println(e);
		}
	}
}
