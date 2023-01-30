package c22;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class item_deteals_server {
	public static void insertIntoTable(int number) throws Throwable {
		 String url = "jdbc:mysql://localhost:3306/ shibli_task";
		 String username = "root";
		 String password = "root";
//		Connection con = null;
		
		
		String Fax = "ASNNIIU";
		String Email = "asma@gmail.com";
		String Website="thht/asma.th.com.sever";
		
	Random rn = new Random();
		Integer NumberToAdd = rn.nextInt(100);
		Connection conn = null;
		try {
			Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, username, password);
			for (int i = 0; i <= number; i++) {

				String insert1 = "Insert into  shop_deteals(Fax,Email,Website)" 
						+"values('" + Fax + "','"
						+ Email + "','"+Website+"')";
				System.out.println(insert1);

				Statement st = conn.createStatement();
				st.executeUpdate(insert1);
				System.out.println(insert1 + " Records Inserted Successfully!");

			}
		} catch (Exception ex) {
			System.err.println(ex);
		} finally {
			if (conn != null)
				conn.close();
		}
	}
}
