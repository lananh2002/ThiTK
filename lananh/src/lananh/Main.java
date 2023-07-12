package lananh;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
		GiangVien giangVien = new GiangVien("AA", "Lan Anh", LocalDate.of(2023, 10, 10), 300, 10);
		System.out.println(giangVien +"\n");
		
		NhanVienNghienCuu cuu = new NhanVienNghienCuu("BB", "Nguyen Van A", LocalDate.of(2023, 5, 20), 2, 3);
		System.out.println(cuu +"\n");

		
		NhanVienVanPhong nhanVienVanPhong = new NhanVienVanPhong("CCC", "Hoang", LocalDate.of(2023, 6, 15), 2, 20);
		System.out.println(nhanVienVanPhong);
		
		
	}

}
