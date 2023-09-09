package day5;

public class SinhVienKhoaNgoaiNgu extends SinhVien{
	public String monNgoaiNgu;
	public void inThongTin() {
		System.out.format("%10s %10s %10s %10s %10s\n", "MaSV", "TenSV", "GioiTinh", "NgaySinh", "MonNgoaiNgu");
		System.out.format("%10d %10s %10s %10s %10s\n", maSV, tenSV, gioiTinh, ngaySinh, monNgoaiNgu);
	}
}
