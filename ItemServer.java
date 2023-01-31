package c22;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class ItemServer {
	public static void insertIntoTable(int number) throws Throwable {
		 String url = "jdbc:mysql://localhost:3306/ shibli_task";
		 String username = "root";
		 String password = "root";
		Connection con = null;
		
		
		String itemName = "tables";
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
	public static void deleteItem() {
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
			String sql = "select * from items where id=" + inputid + "";
			
			ResultSet rs = st.executeQuery(sql);
            System.out.println(sql+"culom delete Successfully!");
		      // execute the preparedstatement
		      
		      conn.close();
		   
	} catch (Exception ex) {
		System.err.println(ex);
	}
}
	
	public static void addItem() {
		String url = "jdbc:mysql://localhost:3306/shibli_task";
		String user = "root";
		String pass = "root";
		Scanner scanner = new Scanner(System.in);
		System.out.println("plz enter the URL!");
		String url1=scanner.next();
		System.out.println("plz enter the username!");
		String username=scanner.next();
		System.out.println("plz enter the password!");
		String password=scanner.next();
		Connection conn = null;
		try {
			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			// Reference to connection interface
			conn = DriverManager.getConnection(url1, user, pass);
			// Creating a statement
			Statement st = conn.createStatement();

//			System.out.println("Please Enter any id to Update Item data :");
//			int userinput = scanner.nextInt();
			System.out.println("Please Enter the new item Name :");
			String itemName = scanner.next();
			System.out.println("Please Enter the new unit Price:");
			String unitPrice = scanner.next();
			System.out.println("Please Enter the new quantity :");
			int quantity = scanner.nextInt();
			System.out.println("Please Enter the new qtyAmount :");
			int qtyAmount = scanner.nextInt();
			System.out.println("Please Enter qtyPrice :");
			int qtyPrice = scanner.nextInt();

			String sql = "insert into items(itemName,unitPrice,quantity,qtyAmount,qtyPrice)  values('" + itemName + "','" + unitPrice+"' ," + quantity +" ," + qtyAmount +" ," + qtyPrice +" );" ;
			int result = st.executeUpdate(sql);
		} catch (Exception ex) {
			System.err.println(ex);

		}

	}
	
	public static void printItem(int num){
		String url = "jdbc:mysql://localhost:3306/shibli_task";
		String username = "root";
		String password = "root";
		 Scanner sc = new Scanner(System.in);
		 System.out.println("plz enter the URL!");
		 String url1=sc.next();
		 System.out.println("plz enter the username!");
		 String username1=sc.next();
		 System.out.println("plz enter the password!");
		 String password1=sc.next();
			Connection conn = null;
			
			 
			 
			
			try {
				Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
				DriverManager.registerDriver(driver);
				conn = DriverManager.getConnection(url1,username1, password1);
				Statement st = conn.createStatement();
				
				 System.out.println("=====================================");
				 String SQL="SELECT * FROM items ORDER BY id LIMIT "+num;
				ResultSet m = st.executeQuery(SQL);
				 while(m.next()){
			            //Display values
			            System.out.print("ID: " + m.getInt("id"));
			            System.out.print(", itemName: " + m.getString("itemName"));
			            System.out.print(", unitPrice: " + m.getString("unitPrice"));
			            System.out.print(", quantity: " + m.getInt("quantity"));
			            System.out.println(", qtyAmount: " + m.getInt("qtyAmount"));
			            System.out.println(", qtyPrice: " + m.getInt("qtyPrice"));
				 }
				conn.close();
			}
			catch (Exception ex) {
				System.err.println(ex);
			}
}
	
	public static void updateprice() {
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

			
			System.out.println("Please change the price:");
			int qtyPrice = scanner.nextInt();
	
			String sql = "UPDATE items SET qtyPrice=" +qtyPrice + "";
			int result = st.executeUpdate(sql);
		} catch (Exception ex) {
			System.err.println(ex);

		}

	}
}
