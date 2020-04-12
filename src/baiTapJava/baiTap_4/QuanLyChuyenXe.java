package baiTapJava.baiTap_4;

import java.util.ArrayList;

public class QuanLyChuyenXe {
	
	ArrayList<ChuyenXe> ds =new ArrayList<ChuyenXe>();
	public void themChuyenXe(ChuyenXe chuyenXe) {
		ds.add(chuyenXe);
	}
	
	public void thongTin_ct(ChuyenXe chuyenXe) {
		System.out.println("Mã số chuyến: " + chuyenXe.msChuyen);
		System.out.println("Họ tên tài xế: " + chuyenXe.hoTenTaiXe);
		System.out.println("Số xe: " + chuyenXe.soXe);
		System.out.println("Doanh thu: " + chuyenXe.doanhThu);
		if (chuyenXe instanceof XeNoiThanh) {
			XeNoiThanh xeNoiThanh = (XeNoiThanh) chuyenXe;	
			System.out.println("Số tuyến: " + xeNoiThanh.soTuyen);
			System.out.println("Số Km đã đi: " + xeNoiThanh.soKm);
		}
		else {
			XeNgoaiThanh xeNgoaiThanh = (XeNgoaiThanh) chuyenXe;
			System.out.println("Nơi đến: " + xeNgoaiThanh.noiDen);
			System.out.println("Số ngày đã đi: " + xeNgoaiThanh.soNgay);
		}
	}
	
	public void xuatDS() {
		for (ChuyenXe chuyenXe : ds) {
			this.thongTin_ct(chuyenXe);
		}
	}
	
	//tong doanh xe noi thanh
	public double tongDTXeNoi() {
		double sum = 0;
		for (ChuyenXe chuyenXe : ds) {
			if (chuyenXe instanceof XeNoiThanh) {
				XeNoiThanh xeNoiThanh = (XeNoiThanh) chuyenXe;				
				sum += xeNoiThanh.doanhThu;
			}
		}
		return sum;
	}
	
	//tong doanh xe ngoai thanh
	public double tongDTXeNgoai() {
		double sum = 0;
		for (ChuyenXe chuyenXe : ds) {
			if (chuyenXe instanceof XeNgoaiThanh) {
				XeNgoaiThanh xeNgoaiThanh = (XeNgoaiThanh) chuyenXe;				
				sum += xeNgoaiThanh.doanhThu;
			}
		}
		return sum;
	}
	
	//tong doanh xe noi thanh va ngoai thanh
	public double tongDT() {
		return tongDTXeNgoai() + tongDTXeNoi();
	}
}
