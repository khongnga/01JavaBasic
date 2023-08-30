package day3;

import java.util.Scanner;

public class MagicSum {
		
		public static void isMagicSum() {
			int sum = 0;
			Scanner scanner =new Scanner(System.in);
			int number;
			System.out.print("Enter a positive integer or -1 to exit: ");
			number = scanner.nextInt();
			while (number != -1) {  
			   System.out.print("Enter a positive integer or -1 to exit: ");
			   number = scanner.nextInt();
				String numberStr= String.valueOf(number);
				for(int i =0;i <numberStr.length();i++) {
					if(numberStr.charAt(i)=='8') {
						int stringnum= Integer.parseInt(numberStr);
						sum = sum + stringnum;
					}
				}
			}
			System.out.println("Sum is: " + sum);
		}
}
