package c22;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class subMenue {
	public static List<String> getSubMenushop(){
		List<String> menueItemList=Arrays.asList("1- Load Data (Items and invoices)",
				 "2- Set Shop Name (data should be saved) ",
				"3- Set Invoice Header (Tel / Fax / Email / Website) (Data should be saved)",
				"4:go back");
		return menueItemList;
	}
	public static void Shop () throws Throwable {
		
		Scanner sc = new Scanner(System.in);
		boolean submenueExit = true;
		System.out.println("**************");
		System.out.println("Shop Settings ");
		System.out.println("**************");
		do {
			for(String x:subMenue.getSubMenushop()) {
				System.out.println(x);
			}
			int SubMenue = sc.nextInt();
			switch(SubMenue) {
			
			case 1:
//				System.out.println(" how many users you have to print");
//				int number = sc.nextInt();
				InvoiveServer. insertInvoice();
				
				break;
				
			case 2:
				shopServer.add() ;
				break;
				
			case 3:
				item_deteals_server.addItem_deteals();
				break;
				
			case 4:
				submenueExit = false;					
				break;
		}
			}while(submenueExit);
				
		}
}
