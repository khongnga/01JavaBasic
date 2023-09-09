package day3;


public class SumAndAverage {
	//B.Loop - 2
	public static void sumAndAverage1() {
		int sum = 0;
		for (int i=1;i<=100;i++) {
			sum = sum+i;
		}
		System.out.println("The sum is: " + sum);
		double average = (double)(sum/100.0);
		System.out.println("The average is: " + average);
	}
	
	//B.Loop - 3
	public static void sumAndAverage2() {
		int sum = 0;
		int count = 0;
		for(int i =111;i<=8899;i++) {
			sum = sum+i;
			count++;
		}
		double average = (double)(sum)/(double)(count);
		System.out.println("The sum is: " + sum);
		System.out.println("The count is: " + count);
		System.out.println("The average is: " + average);
	}
	
	//B.Loop - 4
	public static void sumAndAverage3() {
		int sum = 0;
		int count = 0;
		for (int i=1;i<=100;i++) {
			if(i%2!=0) {
				sum = sum+i;
				count++;
			}
		}
		double average = (double)(sum)/(double)(count);
		System.out.println("The sum is: " + sum);
		System.out.println("The count is: " + count);
		System.out.println("The average is: " + average);
	}
	
	//B.Loop - 5
	public static void sumAndAverage4() {
		int sum = 0;
		int count = 0;
		for (int i=1;i<=100;i++) {
			if(i%7==0) {
				sum = sum + i;
				count++;
			}
		}
		double average = (double)(sum)/(double)(count);
		System.out.println("The sum is: " + sum);
		System.out.println("The count is: " + count);
		System.out.println("The average is: " + average);
	}

}
