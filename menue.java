package c22;

import java.util.Arrays;
import java.util.List;

public class menue {
	public static List<String> getMenuArray(){
		List<String> menueItemList=Arrays.asList("*********************",
				"1-Shop Settings  ",
				"2: Manage Shop Items  ",
				"3:Create New Invoice (Invoices should be save/serialized) ",
				"4:Report: Statistics (No Of Items, No of Invoices, Total Sales)",
				 "5:Report: All Invoices ( Invoice No, Invoice Date, Customer Name, No of items, Total, Balance) ",
				"6:Search (1) Invoice (Search by Invoice No and Report All Invoice details with items) ",
				"7:Program Statistics (Print each Main Menu Item with how many number selected)",
				 "8:Exit",
				"********************************" );
		return menueItemList;
	}

		
//			public static List<String> getSubMenuArray(){
//				List<String> menueItemList=Arrays.asList("1-: Add Items",
//						"2-: Delete Items",
//						"3-: Change Item Price ",
//						"4-:Report All Items ",
//						"5-:Go Back");
//				return menueItemList;
//			}
						

}
