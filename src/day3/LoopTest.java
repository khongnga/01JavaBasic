package day3;

import java.util.Scanner;

public class LoopTest {
	public static void main (String[] args) {
		LoopTest.doExe1();
	}
	
	//B. Loop - 1
	public static void doExe1()
	{
		int a[] = new int [5];
		a[0]= 1;
		a[1]= 3;
		a[2]= 5;
		a[3]= 8;
		a[4]= 9;
		for(int i = 0;i<a.length;i++) {
			System.out.println("Phần tử thứ " +i+" là: " +a[i]); 
		}
	}
	
	//B.Loop - 6
	public static void doExe6() {
		int sum = 0;
		for(int i=1;i<=100;i++) {
			sum += i*i;
		}
		System.out.println("Sum of the square is: " + sum);
	}
	
	//B.Loop - 7
	public static void doExe7() {
		int n;
		float sum = 0;
		do {
			System.out.println("Nhập n: ");
			Scanner scanner = new Scanner(System.in);
			n = scanner.nextInt();
        }while(n <= 0);
         
        for(int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }
        System.out.println("Tổng là: " + sum);
	}
	
	//B.Loop - 8
	public static void doExe8() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
	
	//B.Loop - 9
	public static void doExe9() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i % 2 != 0) {
					System.out.print("# ");
				} else {
					System.out.print(" #");
				}
			}
			System.out.println();
		}
	}
	
	//B.Loop - 10
	public static void doExe10() {
		String str = "Hello World";
		int index = -1;
//		for (int i = 0;i < str.length(); i++) {
//			if(str.charAt(i)=='r') {
//				System.out.println("Vị trí của chữ r là: " + i);
//			}
//		}
		
		do {
			index++;
			System.out.println("chi so " + index);
		}
		while(str.charAt(index)=='r' && index < str.length());
		
	}
}
