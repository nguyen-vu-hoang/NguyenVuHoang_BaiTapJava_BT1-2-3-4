package baiTapJava.baiTap_2;
import baiTapJava.baiTap_1.NhanVien;
import java.util.ArrayList;


public class QuanLyNhanVien implements IQuanly
{
	ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
	
	@Override
	public void them(NhanVien nv) {
		// TODO Auto-generated method stub
		dsNhanVien.add(nv);
	}

	@Override
	public void inDS() {
		// TODO Auto-generated method stub
		for (NhanVien nhanVien : dsNhanVien) {
			System.out.println(nhanVien.getThongtin());
		}
	}

}
