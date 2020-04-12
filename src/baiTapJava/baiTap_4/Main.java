package baiTapJava.baiTap_4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XeNoiThanh xeNoiThanh1 = new XeNoiThanh( "N-001", "Nguyễn Văn Hùng", "79B-987645", 2000, 01, 50);
		XeNoiThanh xeNoiThanh2 = new XeNoiThanh( "N-003", "Nguyễn Văn Hào", "79B-988745", 1500, 02, 30);
		XeNoiThanh xeNoiThanh3 = new XeNoiThanh( "N-005", "Nguyễn Văn Thành", "79B-956745", 2800, 03, 20);
		XeNgoaiThanh xeNgoaiThanh1 =new XeNgoaiThanh("Ng-002", "Nguyễn Vũ Hưng", "79B-374658", 3500, "Cam Ranh", 20);
		XeNgoaiThanh xeNgoaiThanh2 =new XeNgoaiThanh("Ng-004", "Nguyễn Vũ Bình", "79B-374640", 4500, "Nha Trang", 25);
		XeNgoaiThanh xeNgoaiThanh3 =new XeNgoaiThanh("Ng-006", "Nguyễn Thành An", "79B-378378", 4000, "Bình Thuận", 26);

		QuanLyChuyenXe qLyChuyenXe = new QuanLyChuyenXe();
		qLyChuyenXe.themChuyenXe(xeNoiThanh1);
		qLyChuyenXe.themChuyenXe(xeNoiThanh2);
		qLyChuyenXe.themChuyenXe(xeNoiThanh3);
		qLyChuyenXe.themChuyenXe(xeNgoaiThanh1);
		qLyChuyenXe.themChuyenXe(xeNgoaiThanh2);
		qLyChuyenXe.themChuyenXe(xeNgoaiThanh3);
		
		//in thong tin cua tung chuyen xe
		qLyChuyenXe.xuatDS();
		
		//tong doanh thu cua xe ngoai thanh
		System.out.println("Tổng doanh thu xe ngoai thanh: " + qLyChuyenXe.tongDTXeNgoai());
				
		//tong doanh thu cua xe noi thanh
		System.out.println("Tổng doanh thu xe noi thanh: " + qLyChuyenXe.tongDTXeNoi());
		
		//tong doanh thu cua xe ngoai thanh va xe noi thanh
		System.out.println("Tổng doanh thu xe ngoai thanh và nội thành: " + qLyChuyenXe.tongDT());
		

		
	}

}
