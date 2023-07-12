package lananh;

import java.time.LocalDate;

public class NhanVienNghienCuu extends NhanVien{
	private double soDeTaiNC; 
	private double soBaiBao;
	
	
	public double getSoDeTaiNC() {
		return soDeTaiNC;
	}
	public void setSoDeTaiNC(double soDeTaiNC) {
		this.soDeTaiNC = soDeTaiNC;
	}
	public double getSoBaiBao() {
		return soBaiBao;
	}
	public void setSoBaiBao(double soBaiBao) {
		this.soBaiBao = soBaiBao;
	}
	public NhanVienNghienCuu(String maNV, String hoTen, LocalDate ngaySinh, double soDeTaiNC, double soBaiBao) {
		super(maNV, hoTen, ngaySinh);
		this.soDeTaiNC = soDeTaiNC;
		this.soBaiBao = soBaiBao;
	}
	public NhanVienNghienCuu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhanVienNghienCuu(String maNV, String hoTen, LocalDate ngaySinh) {
		super(maNV, hoTen, ngaySinh);
		// TODO Auto-generated constructor stub
	} 
	
	
	public String xetLaoDongTienTien() {
		if (soDeTaiNC >=1) {
			if (soBaiBao>= 2) {
				return "Tien Tien";
			}
		}
		return "chua du tien tien";
	}
	@Override
	public String toString() {
		return "NhanVienNghienCuu [soDeTaiNC=" + soDeTaiNC + ", soBaiBao=" + soBaiBao + ", xetLaoDongTienTien()="
				+ xetLaoDongTienTien() + ", getMaNV()=" + getMaNV() + ", getHoTen()=" + getHoTen() + ", getNgaySinh()="
				+ getNgaySinh() + "]";
	}
	
	
	
}
