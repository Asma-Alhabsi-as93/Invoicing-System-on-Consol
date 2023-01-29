package c22;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class ItemServer {
	public static void insertIntoTable(int number) throws Throwable {
		 String url = "jdbc:mysql://localhost:3306/ shibli_task";
		 String username = "root";
		 String password = "root";
		Connection con = null;
		
		
		String itemName = "books";
		String unitPrice = "s4";
		int quantity=4;
		int qtyAmount=1;
		int qtyPrice=100;
		
		Random rn = new Random();
		Integer NumberToAdd = rn.nextInt(100);
		Connection conn = null;
		try {
			Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, username, password);
			for (int i = 0; i <= number; i++) {

				String insert1 = "Insert into  items(itemName,unitPrice,quantity,qtyAmount,qtyPrice)" 
						+"values('" + itemName + "','"
						+ unitPrice + "'," + quantity + "," + qtyAmount + ","
								+ qtyPrice+ ")";
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
	public static void deleteById() {
		String url = "jdbc:mysql://localhost:3306/shibli_task";
		String user = "root";
		String pass = "root";
		Scanner scanner = new Scanner(System.in);

		Connection conn = null;
		try {
			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			// Reference to connection interface
			conn = DriverManager.getConnection(url, user, pass);
			// Creating a statement
			Statement st = conn.createStatement();
			int inputid=scanner.nextInt();
			String sql = "select * from items where id='" + inputid + "'";
			
			int rs = st.executeUpdate(sql);

		      // execute the preparedstatement
		      
		      conn.close();
		   
	} catch (Exception ex) {
		System.err.println(ex);
	}
}
}
