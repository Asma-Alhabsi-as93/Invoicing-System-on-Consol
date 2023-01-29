package c22;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;

public class shopServer {
	public static void insertIntShopoTable() throws Throwable {
		 String url = "jdbc:mysql://localhost:3306/ shibli_task";
		 String username = "root";
		 String password = "root";
//		Connection con = null;
		
		int id=1;
		String ShopName = "almeera shop";
//	Random rn = new Random();
//		Integer NumberToAdd = rn.nextInt(100);
		Connection conn = null;
		try {
			Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, username, password);
//			for (int i = 0; i <= number; i++) {

				String insert1 = "Insert into shop(id,ShopName)"
						+ " values("+id+",'"+ShopName+"')";
					

				Statement st = conn.createStatement();
				st.executeUpdate(insert1);
				System.out.println(insert1 + " Records Inserted Successfully!");

			
		} catch (Exception ex) {
			System.err.println(ex);
				conn.close();
		}
	

}
}
