package c22;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class InvoiveServer {
	public static void SelectInvoice(int top) {
		 String url = "jdbc:mysql://localhost:3306/ shibli_task";
		 String username = "root";
		 String password = "root";
		Connection con = null;
		try {
			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			// Registering drivers
			DriverManager.registerDriver(driver);
			// Reference to connection interface
			con = DriverManager.getConnection(url, username, password);
			// Creating a statement
			Statement st = con.createStatement();
			Scanner scanner = new Scanner(System.in);
			int count = 1;
			String sql="SELECT * FROM invoice ORDER BY id LIMIT "+top;
			ResultSet rs = st.executeQuery(sql);
			while (rs.next() && count <= top) {
				int id = rs.getInt("id");

				String customerFullName = rs.getString("customerFullName");
				String phoneNumber = rs.getString("phoneNumber");
				Date invoiceDate = rs.getDate("invoiceDate");
				int numberOfItems = rs.getInt("numberOfItems");
				int totalAmount = rs.getInt("totalAmount");
				int paidAmoun = rs.getInt("paidAmoun");
				int balance = rs.getInt("balance");
				String Fax = rs.getString("Fax");
				String Email = rs.getString("Email");
				String Website = rs.getString("Website");
				System.out.println(id + " " + customerFullName + " " + phoneNumber + " " + invoiceDate + " " + numberOfItems
						+ " " + totalAmount +" "+paidAmoun +""+balance+" "+Fax+""+Email+" "+Website);
				count++;
			}
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
	public static void insertInvoice() {
		String url = "jdbc:mysql://localhost:3306/shibli_task";
		String user = "root";
		String pass = "root";
		Scanner scanner = new Scanner(System.in);

		Connection conn = null;
		System.out.println("plz enter the URL!");
		String url1=scanner.next();
		System.out.println("plz enter the username!");
		String username=scanner.next();
		System.out.println("plz enter the password!");
		String password=scanner.next();
		try {
			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			// Reference to connection interface
			conn = DriverManager.getConnection(url1, user, pass);
			// Creating a statement
			Statement st = conn.createStatement();

//			System.out.println("Please Enter any id to Update Item data :");
//			int userinput = scanner.nextInt();
			System.out.println("Please Enter the  customerFullName :");
			String customerFullName = scanner.next();
			System.out.println("Please Enter the  phoneNumber:");
			String phoneNumber = scanner.next();
//			System.out.println("Please Enter the invoiceDate :");
			Date invoiceDate = new Date(System.currentTimeMillis());
			System.out.println("Please Enter the number Of Itemst :");
			int numberOfItems = scanner.nextInt();
			System.out.println("Please Enter total Amount :");
			int totalAmount = scanner.nextInt();
			System.out.println("Please Enter paid Amoun :");
			int paidAmoun = scanner.nextInt();
			System.out.println("Please Enter balance :");
			int balance = scanner.nextInt();


			String sql = "insert into invoice(customerFullName,phoneNumber,invoiceDate,numberOfItems,totalAmount,paidAmoun,balance)  "
					+ "values('" + customerFullName + "','" + phoneNumber+"' ,'"+invoiceDate+"'," + numberOfItems +" ," + totalAmount +" ,"+paidAmoun+"," + balance +" );" ;
			int result = st.executeUpdate(sql);
		} catch (Exception ex) {
			System.err.println(ex);

		}

	}
	public static void insertIntoTable(int number) throws Throwable {
		 String url = "jdbc:mysql://localhost:3306/ shibli_task";
		 String username = "root";
		 String password = "root";
		Connection con = null;
		
		
		String customerFullName = "KHLOOD";
		String phoneNumber = "+554367994";
		Date invoiceDate = new Date(System.currentTimeMillis());
		int numberOfItems=3;
		int totalAmount=8;
		int paidAmoun=33;
		int balance=12;
//		String Fax = "m6544";
//		String Email="Fatema@gmail.com";
//		String Website="url-tth-fhgfygwd.kkh.vv";
		Random rn = new Random();
		Integer NumberToAdd = rn.nextInt(100);
		Connection conn = null;
		try {
			Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, username, password);
			for (int i = 0; i <= number; i++) {

				String insert1 = "Insert into invoice(customerFullName,phoneNumber,invoiceDate,numberOfItems,totalAmount,paidAmoun,balance)"
						+ " values( '" + customerFullName + "','"
						+ phoneNumber + "','" + invoiceDate + "'," + numberOfItems + "," + totalAmount + ","
								+ paidAmoun+ ","+ balance+ ")";
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
	
	public static void report() {
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
		
		String report = "select *from invoice";
		
			ResultSet result = st.executeQuery(report);
			if(result.next()) {
				System.out.println("invoice No:"+result.getInt(1));
//				System.out.println("invoiceDate:"+result.getDate(1));
				System.out.println("Customer Name:"+result.getString(1));
				System.out.println("No of items:"+result.getInt(1));
				System.out.println("Total:"+result.getInt(1));
				System.out.println("balance:"+result.getInt(1));
				
			}
		} catch (Exception ex) {
			System.err.println(ex);
		}

	}
	public static void serch(int num) {
		String url = "jdbc:mysql://localhost:3306/shibli_task";
		String user = "root";
		String pass = "root";
		Scanner scanner = new Scanner(System.in);
		Connection conn = null;
		System.out.println("plz enter the URL!");
		String url1=scanner.next();
		System.out.println("plz enter the username!");
		String user1=scanner.next();
		System.out.println("plz enter the password!");
		String pass1=scanner.next();
		try {
			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			// Reference to connection interface
			conn = DriverManager.getConnection(url1, user1, pass1);
			// Creating a statement
			Statement st = conn.createStatement();
			String search = "SELECT * FROM invoice WHERE id=" +num;
			ResultSet result = st.executeQuery(search);
			if(result.next()) {
				System.out.println("id:"+result.getInt(1));
				System.out.println("invoiceDate:"+result.getDate(1));
				System.out.println("customerFullName:"+result.getString(1));
				System.out.println("numberOfItems:"+result.getInt(1));
				System.out.println("totalAmount:"+result.getInt(1));
				System.out.println("balance:"+result.getInt(1));
				
			}
		
	} catch (Exception ex) {
		System.err.println(ex);
	}
}
	
	public static void count() {
		String url = "jdbc:mysql://localhost:3306/shibli_task";
		String user = "root";
		String pass = "root";
		Scanner scanner = new Scanner(System.in);
		Connection conn = null;
		System.out.println("plz enter the URL!");
		String url1=scanner.next();
		System.out.println("plz enter the username!");
		String user1=scanner.next();
		System.out.println("plz enter the password!");
		String pass1=scanner.next();
		try {
			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			// Reference to connection interface
			conn = DriverManager.getConnection(url1, user1, pass1);
			// Creating a statement
			Statement st = conn.createStatement();
			String search = "select count(id)from invoice";
			ResultSet result = st.executeQuery(search);
			if(result.next()) {
				System.out.println("No Of Items:"+result.getInt(1));
			}	
			String count = "select count(numberOfItems)from invoice";
			ResultSet result1 = st.executeQuery(count);
			if(result1.next()) {
				System.out.println("No of Invoices:"+result1.getInt(1));
			}
			String sum = "select sum(totalAmount)from invoice";
			ResultSet result11 = st.executeQuery(sum);
			if(result11.next()) {
				System.out.println("Total Sales:"+result11.getInt(1));
				
			}
		
	} catch (Exception ex) {
		System.err.println(ex);
	}
	
}
}
	
