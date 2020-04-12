package baiTapJava.baiTap_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien nv1 = new NhanVien("Nguyen Vu Hung", 20, "Nha Trang", 5000, 220);
		NhanVien nv2 = new NhanVien("Nguyen Van Tiep", 22, "Nha Trang", 6000, 120);
		System.out.println(nv1.getThongtin());
		System.out.println(nv2.getThongtin());
	}

}
