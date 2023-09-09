package day5;

public class SinhVien {
	public int maSV;
	public String tenSV;
	public String gioiTinh;
	public String ngaySinh;
	
	public void inThongTin () {
		//System.out.println(maSV + " / " + tenSV + " / " + gioiTinh + " / " + ngaySinh);
		System.out.format("%10s %10s %10s %10s\n", "MaSV", "TenSV", "GioiTinh", "NgaySinh");
		System.out.format("%10d %10s %10s %10s\n", maSV, tenSV, gioiTinh, ngaySinh);
	}

}
