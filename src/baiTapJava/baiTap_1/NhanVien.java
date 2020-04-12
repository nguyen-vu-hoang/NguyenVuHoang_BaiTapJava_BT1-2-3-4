package baiTapJava.baiTap_1;

public class NhanVien {
	private String ten;
	private int tuoi;
	private String diaChi;
	private double tienLuong;
	private int tongGioLam;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public double getTienLuong() {
		return tienLuong;
	}
	public void setTienLuong(double tienLuong) {
		this.tienLuong = tienLuong;
	}
	public int getTongGioLam() {
		return tongGioLam;
	}
	public void setTongGioLam(int tongGioLam) {
		this.tongGioLam = tongGioLam;
	}
	
	public NhanVien() {
		// TODO Auto-generated constructor stub
	}
	public NhanVien(String _ten,int _tuoi, String _diaChi, double _tienLuong, int _tongGioLam) {
		setDiaChi(_diaChi);
		setTen(_ten);
		setTienLuong(_tienLuong);
		setTongGioLam(_tongGioLam);
		setTuoi(_tuoi);
	}
	
	public String getThongtin() {
		return    "Ten: " + getTen() +"\n"
				+ "Tuoi: " + getTuoi() + "\n"
				+ "Dia Chi: " + getDiaChi() + "\n"
				+ "Tien Luong: " +getTienLuong() + "\n"
				+ "Tong so gio lam: " + getTongGioLam();
		}
	
	public double tinhThuong() {
		if (getTongGioLam()>=200) {
			return getTienLuong() * 0.2;
		}
		else if (getTongGioLam()<200 && getTongGioLam()>=100) {
			return getTienLuong() * 0.1;
		}
		else return 0;
	}
	
}
