package baiTapJava.baiTap_2;

import baiTapJava.baiTap_1.NhanVien;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IQuanly qlnVien = new QuanLyNhanVien();
		NhanVien nv1 = new NhanVien("Nguyen Van A", 20, "Cam Lam", 20000, 120);
		NhanVien nv2 = new NhanVien("Nguyen Van B", 22, "Cam Lam", 10000, 220);
		NhanVien nv3 = new NhanVien("Nguyen Thi An", 21, "Nha Trang", 12000, 100);
		NhanVien nv4 = new NhanVien("Nguyen Vu C", 20, "Cam Ranh", 15000, 90);
		NhanVien nv5 = new NhanVien("Nguyen Thi Mo", 19, "Khanh Vinh", 20000, 150);
		
		qlnVien.them(nv1);
		qlnVien.them(nv2);
		qlnVien.them(nv3);
		qlnVien.them(nv4);
		qlnVien.them(nv5);
		
		qlnVien.inDS();
	}

}
