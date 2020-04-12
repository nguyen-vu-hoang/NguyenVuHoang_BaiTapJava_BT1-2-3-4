package baiTapJava.baiTap_3;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		// không thể tạo sinh viên poly vì là lớp trừu tượng
		SinhVienIT svIT = new SinhVienIT("Nguyen Van Hung", "IT", 8, 7, 7);
		SinhVienBiz svBiz =	new SinhVienBiz("Nguyen Thi An", "Biz", 7, 9);
		// thông tin sinh viên IT
		svIT.xuat();
		System.out.println("Diem: " + svIT.getDiem());
		System.out.println(svIT.getHocLuc());
		// thông tin sinh viên Biz
		svBiz.xuat();
		System.out.println("Diem: " + svBiz.getDiem());
		System.out.println(svBiz.getHocLuc());
	}

}
