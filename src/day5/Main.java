package day5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		inSVKhoaNN();

	}
	
	public static void inSVKhoaToan() {
		Scanner scanner = new Scanner(System.in);
		ArrayList<SinhVienKhoaToan> sinhVienKhoaToan = new ArrayList<SinhVienKhoaToan>();
		SinhVienKhoaToan svKhoaToan = new SinhVienKhoaToan();
		System.out.println("Nhập vào số sinh viên: ");
		int number = scanner.nextInt();
		for (int i = 0; i < number; i++) {
			System.out.println("Nhập thông tin sinh viên: ");
			System.out.println("Nhập mã sinh viên: ");
			svKhoaToan.maSV = scanner.nextInt();
			System.out.println("Nhập tên sinh viên: ");
			scanner.nextLine();
			svKhoaToan.tenSV = scanner.nextLine();
			System.out.println("Nhập ngày sinh: ");
			svKhoaToan.ngaySinh = scanner.nextLine();
			System.out.println("Nhập giới tính: ");
			svKhoaToan.gioiTinh = scanner.nextLine();
			sinhVienKhoaToan.add(svKhoaToan);
		}
		
		for(SinhVienKhoaToan svSinhVienKhoaToan: sinhVienKhoaToan) {
			svSinhVienKhoaToan.inThongTin();
		}

	}
	
	public static void inSVKhoaNN() {
		Scanner scanner = new Scanner(System.in);
		ArrayList<SinhVienKhoaNgoaiNgu> sinhVienKhoaNN = new ArrayList<SinhVienKhoaNgoaiNgu>();
		SinhVienKhoaNgoaiNgu svKhoaNN = new SinhVienKhoaNgoaiNgu();
		System.out.println("Nhập vào số sinh viên: ");
		int number = scanner.nextInt();
		for (int i = 0; i < number; i++) {
			System.out.println("Nhập thông tin sinh viên: ");
			System.out.println("Nhập mã sinh viên: ");
			svKhoaNN.maSV = scanner.nextInt();
			System.out.println("Nhập tên sinh viên: ");
			scanner.nextLine();
			svKhoaNN.tenSV = scanner.nextLine();
			System.out.println("Nhập ngày sinh: ");
			svKhoaNN.ngaySinh = scanner.nextLine();
			System.out.println("Nhập giới tính: ");
			svKhoaNN.gioiTinh = scanner.nextLine();
			sinhVienKhoaNN.add(svKhoaNN);
			System.out.println("Nhập môn ngoại ngữ: ");
			svKhoaNN.monNgoaiNgu = scanner.nextLine();
			sinhVienKhoaNN.add(svKhoaNN);
		}
		
		for(SinhVienKhoaNgoaiNgu svSinhVienKhoaNN: sinhVienKhoaNN) {
			svSinhVienKhoaNN.inThongTin();
		}

	}

}
