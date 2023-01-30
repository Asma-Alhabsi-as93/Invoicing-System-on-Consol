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
		boolean userExit= true;
		
//		while(userExit)
//		{
//		System.out.println("Enter User Name :");
//		String teacherName=menuescanner.next();
//		stk.push(teacherName);
//		
//		//int inputTeacherPassword = Integer.parseInt(teacherPassword);
//		
//		try {
//		if(!teacherName.equals("Asma")){
//			throw new Exception (" User Name Wrong");
//		}
//		
//		}
//		catch(Exception e){
//			System.out.println(e.getMessage());
//			continue;
//		}
//		System.out.println("Enter User Password :");
//		String teacherPassword=menuescanner.next();
//		stk.push(teacherPassword);
//		
//		try {
//		if(!teacherPassword.equals("A-1234")){
//			throw new Exception (" User password wrong");
//		}
//		}
//		catch(Exception e){
//			System.out.println(e.getMessage());
//			continue;
//		}

		do {
		for(String x:menue.getMenuArray()) {
			System.out.println(x);
		}
		
			
			int select = menuescanner.nextInt();

			switch (select) {
			case 0:
//				createTable.invoice();
//				createTable.items();
//				createTable.shop();
				createTable.shop_deteals();
				
				break;
			
			case 1:
				subMenue.Shop();

				break;
				
			case 2:
				ItemMnue.Item();
				break;
			case 3:
//				InvoiveServer .SetInvoice(1);
				break;
				
			case 4:
				
				break;
				
				
			}
	}while (menueExit);
//		}
		userExit = false;
}
}
