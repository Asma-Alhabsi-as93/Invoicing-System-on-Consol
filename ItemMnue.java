package c22;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ItemMnue {
	
		public static List<String> getItemMenue1(){
			List<String> menueItemList=Arrays.asList("1- Add Items (Item should be saved/serialized)",
					 "2- Delete Items  ",
					"3- Change Item Price",
					"4: Report All Items",
					"5:Go Back ");
			return menueItemList;
		}
		public static void Item () throws Throwable {
			Scanner sc = new Scanner(System.in);
			boolean itemExit = true;
			System.out.println("**************");
			System.out.println(" Manage Shop Items ");
			System.out.println("**************");
			do {
				for(String x:ItemMnue.getItemMenue1()) {
					System.out.println(x);
				}
				int itemMenue = sc.nextInt();
				switch(itemMenue) {
				
				case 1:
//					System.out.println("inter how many items you wont input");
//					int number=sc.nextInt();
//					ItemServer.insertIntoTable( number);
					ItemServer.addNewItem();
					break;
					
				case 2:
					ItemServer.deleteById();
					break;
					
				case 3:
					break;
				case 4:
					break;
				case 5:
					itemExit = false;					
					break;
			}
				}while(itemExit);
					
					
		}

}
