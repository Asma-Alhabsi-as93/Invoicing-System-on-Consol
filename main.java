package c22;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;



public class main {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Scanner menuescanner = new Scanner(System.in);
		Stack<String> stk = new Stack<String>();
		boolean menueExit = true;
		

		while (menueExit) {
		for(String x:menue.getMenuArray()) {
			System.out.println(x);
		}
		
			
			int select = menuescanner.nextInt();
			String st=String.valueOf(select);
            stk.push(st);
			switch (select) {
			case 0:
//				createTable.invoice();
//				createTable.items();
//				createTable.shop();
//				createTable.shop_deteals();
				
				break;
			
			case 1:
				subMenue.Shop();

				break;
				
			case 2:
				ItemMnue.Item();
				break;
			case 3:
				InvoiveServer .insertInvoice();
				break;
				
			case 4:
				InvoiveServer.count();
				break;
				
			case 5:
				InvoiveServer.report();
					break;
			case 6:
				System.out.println("Enter  id you wont search");
			int number=menuescanner.nextInt();
			InvoiveServer.search(number);
				break;
				
			case 7:
				try {
            Stack<String> stt = (Stack<String>) stk;
            System.out.println(stt);
				}catch (Exception e) {
					// TODO: handle exception
				}
            break;
			case 8:
				System.out.println("Are you sure you want to exit? If yes, program ends, if No , then main menu reprinted again ");
				String option=menuescanner.next();
				if(option.equals("YES")) {
					menueExit=false;
					System.out.println("=======THANK YOU=============");
				}
				else if(option.equals("NO")) {
					menueExit=true;
				}
				break;
				
				
			}
	}menueExit=false;
//		}
		
}
}
