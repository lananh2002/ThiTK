package lananh;

import java.time.LocalDate;
import java.util.Scanner;


public class QuanLyNhanVien {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  int choiceNumber;
	        Scanner scanner = new Scanner(System.in);
	         
	    
	        for (;;) {
	            System.out.println("1. Tính Tiên Tiến Giang Vien");
	            System.out.println("2. Tính Tiên Tiến Nghiên Cứu Viên");
	            System.out.println("3. Tính Tiên Tiến Nhân Viên Văn Phòng");
	             
	            do {
	                System.out.println("Bấm số để chọn (1/2/3): ");
	                choiceNumber = scanner.nextInt();
	            } while ((choiceNumber < 1) || (choiceNumber > 3));
	             
	            switch (choiceNumber) {
	                case 1:
	                	GiangVien giangVien = new GiangVien("1", "a", LocalDate.of(2013,6,5), 305, 5);
	            		System.out.println(giangVien);
	                    break;
	                case 2:
	                	NhanVienNghienCuu cuu = new NhanVienNghienCuu("2", "Nguyen Van A", LocalDate.of(2023, 5, 20), 2, 3);
	            		System.out.println(cuu +"\n");
	                    break;
	                case 3:
	                	NhanVienVanPhong nhanVienVanPhong = new NhanVienVanPhong("CCC", "Hoang", LocalDate.of(2023, 6, 15), 2, 20);
	            		System.out.println(nhanVienVanPhong);
	                    break;
	            }
	        }
	    }
}
