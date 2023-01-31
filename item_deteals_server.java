package c22;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
	
	
	public static void addItem_deteals() {
		String url = "jdbc:mysql://localhost:3306/shibli_task";
		String user = "root";
		String pass = "root";
		Scanner scanner = new Scanner(System.in);

		Connection conn = null;
		try {
			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			
			conn = DriverManager.getConnection(url, user, pass);
			// Creating a statement
			
			System.out.println("Please Enter shop name :");
			String shop_name=scanner.next();
			
			System.out.println("Please Enter the  Faxe :");
			String Fax = scanner.next();
			System.out.println("Please Enter the  Email :");
			String Email = scanner.next();
			System.out.println("Please Enter the  Website :");
			String Website = scanner.next();
			
			String sql1 = "select id from shop where Shope_Name=?";
			PreparedStatement shopPreparedStatment = conn.prepareStatement(sql1);
            shopPreparedStatment.setString(1, shop_name);
            int id_shop = 0;
            ResultSet shopResultSet = shopPreparedStatment.executeQuery();
            if(shopResultSet.next())
            {
            	id_shop = shopResultSet.getInt("id");
                System.out.println(id_shop);
            }
            String sql2 = "insert into shop_deteals(id_shop,Fax,Email,Website)"
    				+ " values('"+ id_shop+"','"+ Fax+"','"+ Email+"','"+ Website+"')";
    		Statement st1 = conn.createStatement();
    		//
    		// Executing query
    		int result = st1.executeUpdate(sql2);
    		if (result >= 1)
    			System.out.println("inserted successfully  ");
    		else
    			System.out.println("insertion failed");
		conn.close();
			
		
		} catch (Exception ex) {
			System.err.println(ex);

		}
}
}
