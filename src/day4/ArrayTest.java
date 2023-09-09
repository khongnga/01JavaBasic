package day4;

import java.util.Scanner;

public class ArrayTest {
	//D.Array - 1
	public static void calGradesAverage () {
		int numStudents = 0;
		double average = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		numStudents = scanner.nextInt();
		int grades[] = new int[numStudents];
		for (int i = 0; i<=grades.length; i++) {
			System.out.println("Enter the grade for student "+(i+1)+": ");
			if(grades[i]>=0 && grades[i]<=100) {
				sum += grades[i];
			}
			else {
				System.out.println("Invalid grade, try again.");
				System.out.println("Enter the grade for student "+(i+1)+": ");
				grades[i] = scanner.nextInt();
				sum += grades[i];
			}
		}
		average = (double)(sum)/(double)(numStudents);
		System.out.println("The average is: " + average);
	}
	
	//D.Array - 2,3
	public static void printArray(int[] array) {
		if (array.length > 0) {
			System.out.print("{");
			for (int i = 0; i < array.length; i++) {
				if (i == array.length - 1) {
					System.out.print(array[i]);
				} else {
					System.out.print(array[i] + ",");
				}
			}
			System.out.print("}");
		} else {
			System.out.println("Mảng rỗng");
		}
	}

}
