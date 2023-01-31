package c22;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class createTable {
	static String url = "jdbc:mysql://localhost:3306/shibli_task";
	static String username = "root";
	static String password = "root";
	
	public static boolean invoice() {
		Scanner sc = new Scanner(System.in);
		String sqlDB = "CREATE TABLE invoice" + "(id INTEGER NOT NULL AUTO_INCREMENT ,"
				+ " customerFullName VARCHAR(8) not NULL,"+" InvoiceItems_id INTEGER ,"
				 +"FOREIGN KEY (InvoiceItems_id)  REFERENCES items(id) ON DELETE CASCADE ,"
				+ "phoneNumber varchar(20),"
				+ "invoiceDate Date not NULL,"
				+"numberOfItems INTEGER,"
				+"totalAmount INTEGER,"
				+"paidAmoun INTEGER ,"
				+"balance INTEGER,"
				+ "PRIMARY KEY  (id))";
		String sqlOutIncrement="Alter Table invoice AUTO_INCREMENT=1";
		
System.out.println("plz enter the URL!");
String url=sc.next();
System.out.println("plz enter the username!");
String username=sc.next();
System.out.println("plz enter the password!");
String password=sc.next();

		Connection conn = null;
		try {
			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, username, password);
			Statement st = conn.createStatement();
			int m = st.executeUpdate(sqlDB);
			st.executeUpdate(sqlOutIncrement);

			if ((m >= 0)) {
				System.out.println("Created table in given database...");

			} else {
				System.out.println(" table already Created in given database...");

				return true;
			}
			conn.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
		return false;
	}
	
	
	
	public static boolean items() {
		
		Scanner sc = new Scanner(System.in);
		String sqlDB = "CREATE TABLE items" +"( id INTEGER not NULL,"
			  + "item_ID INTEGER not NULL,"
		      +"FOREIGN KEY (item_ID) REFERENCES shop_deteals(id)ON DELETE CASCADE,"
				+ " itemName VARCHAR(8) not NULL,"
				+ "unitPrice varchar(20),"
				+"quantity INTEGER,"
				+"qtyAmount INTEGER,"
				+"qtyPrice INTEGER ,"
				+ "PRIMARY KEY AUTO_INCREMENT (id))";

		Connection conn = null;
		try {
			Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, username, password);
			Statement st = conn.createStatement();
			int m = st.executeUpdate(sqlDB);

			if ((m >= 0)) {
				System.out.println("Created table in given database...");

			} else {
				System.out.println(" table already Created in given database...");

				return true;
			}
			conn.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
		return false;
	}
	
	public static boolean shop() {
		Scanner sc = new Scanner(System.in);
		String sqlDB = "CREATE TABLE shop" + "(id INTEGER ,"
				+ " Shope_Name VARCHAR(8) not NULL,"
				+ "PRIMARY KEY AUTO_INCREMENT (id))";

		Connection conn = null;
		try {
			Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, username, password);
			Statement st = conn.createStatement();
			int m = st.executeUpdate(sqlDB);

			if ((m >= 0)) {
				System.out.println("Created table in given database...");

			} else {
				System.out.println(" table already Created in given database...");

				return true;
			}
			conn.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
		return false;
	}
	
	public static boolean shop_deteals() {
		Scanner sc = new Scanner(System.in);
		String sqlDB = "CREATE TABLE shop_deteals" 
		        + "(id INTEGER not NULL,"
		        + "id_shop INTEGER not NULL,"
		        + "FOREIGN KEY(id_shop)REFERENCES shop(id)ON DELETE CASCADE ,"
				+ " Fax VARCHAR(8) not NULL,"
				+"Email VARCHAR(100),"
				+"Website VARCHAR(100),"
				+ "PRIMARY KEY AUTO_INCREMENT (id))";

		Connection conn = null;
		try {
			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, username, password);
			Statement st = conn.createStatement();
			int m = st.executeUpdate(sqlDB);

			if ((m >= 0)) {
				System.out.println("Created table in given database...");

			} else {
				System.out.println(" table already Created in given database...");

				return true;
			}
			conn.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
		return false;
	}
	}


