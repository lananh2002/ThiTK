package lananh;

import java.time.LocalDate;

public class NhanVienVanPhong extends NhanVien{
	private double soLopBoiDuongCM; 
	private double soGioThamGiaLD;
	
	public double getSoLopBoiDuongCM() {
		return soLopBoiDuongCM;
	}
	public void setSoLopBoiDuongCM(double soLopBoiDuongCM) {
		this.soLopBoiDuongCM = soLopBoiDuongCM;
	}
	public double getSoGioThamGiaLD() {
		return soGioThamGiaLD;
	}
	public void setSoGioThamGiaLD(double soGioThamGiaLD) {
		this.soGioThamGiaLD = soGioThamGiaLD;
	}
	public NhanVienVanPhong(String maNV, String hoTen, LocalDate ngaySinh, double soLopBoiDuongCM,
			double soGioThamGiaLD) {
		super(maNV, hoTen, ngaySinh);
		this.soLopBoiDuongCM = soLopBoiDuongCM;
		this.soGioThamGiaLD = soGioThamGiaLD;
	}
	public NhanVienVanPhong() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhanVienVanPhong(String maNV, String hoTen, LocalDate ngaySinh) {
		super(maNV, hoTen, ngaySinh);
		// TODO Auto-generated constructor stub
	} 
	
	public String xetLaoDongTienTien() {
		if (soLopBoiDuongCM >=1) {
			if (soGioThamGiaLD>= 20) {
				return "Tien Tien";
			}
		}
		return "chua du tien tien";
	}
	@Override
	public String toString() {
		return "NhanVienVanPhong [soLopBoiDuongCM=" + soLopBoiDuongCM + ", soGioThamGiaLD=" + soGioThamGiaLD
				+ ", xetLaoDongTienTien()=" + xetLaoDongTienTien() + ", getMaNV()=" + getMaNV() + ", getHoTen()="
				+ getHoTen() + ", getNgaySinh()=" + getNgaySinh() + "]";
	}
	
	
}
