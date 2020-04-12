package baiTapJava.baiTap_4;

public class XeNgoaiThanh extends ChuyenXe
{
	String noiDen;
	int soNgay; //so ngay di duoc
	public XeNgoaiThanh(String _msChuyen, String _hoTenTaiXe, String _soXe, double _doanhThu, String _noiDen, int _soNgay )  {
		// TODO Auto-generated constructor stub
		super(_msChuyen, _hoTenTaiXe, _soXe, _doanhThu);
		noiDen = _noiDen;
		soNgay = _soNgay;
	}
}
