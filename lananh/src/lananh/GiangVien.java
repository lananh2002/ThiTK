package lananh;

import java.time.LocalDate;

public class GiangVien extends NhanVien{
	private double soTiet; 
	private double soDeTai;
	public double getSoTiet() {
		return soTiet;
	}
	public void setSoTiet(double soTiet) {
		this.soTiet = soTiet;
	}
	public double getSoDeTai() {
		return soDeTai;
	}
	public void setSoDeTai(double soDeTai) {
		this.soDeTai = soDeTai;
	}
	public GiangVien(String maNV, String hoTen, LocalDate ngaySinh, double soTiet, double soDeTai) {
		super(maNV, hoTen, ngaySinh);
		this.soTiet = soTiet;
		this.soDeTai = soDeTai;
	}
	public GiangVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GiangVien(String maNV, String hoTen, LocalDate ngaySinh) {
		super(maNV, hoTen, ngaySinh);
		// TODO Auto-generated constructor stub
	}
	
	
	public String xetLaoDongTienTien() {
		if (soTiet>=300) {
			if (soDeTai>= 5) {
				return "Tien Tien";
			}
		}
		return "chua du tien tien";
	}
	@Override
	public String toString() {
		return "GiangVien [soTiet=" + soTiet + ", soDeTai=" + soDeTai + ", xetLaoDongTienTien()=" + xetLaoDongTienTien()
				+ ", getMaNV()=" + getMaNV() + ", getHoTen()=" + getHoTen() + ", getNgaySinh()=" + getNgaySinh() + "]";
	}
	
	
	
	
	

}
