package lananh;

import java.time.LocalDate;
import java.util.ArrayList;
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
	                	GiangVien giangVien1 = new GiangVien("2", "a", LocalDate.of(2013,6,5), 299, 5);
	                	ArrayList<GiangVien> giangViens = new ArrayList<GiangVien>(); 
	                	giangViens.add(giangVien); 
	                	giangViens.add(giangVien1);
	                	System.out.println(giangViens);
	          
	                    break;
	                case 2:
	                	NhanVienNghienCuu cuu = new NhanVienNghienCuu("1", "Nguyen Van A", LocalDate.of(2023, 5, 20), 2, 3);
	                	NhanVienNghienCuu cuu1 = new NhanVienNghienCuu("2", "Nguyen Van B", LocalDate.of(2023, 6, 20), 0, 3);
	                	ArrayList<NhanVienNghienCuu> cuus = new ArrayList<NhanVienNghienCuu>();
	                	cuus.add(cuu);
	                	cuus.add(cuu1);
	                	System.out.println( cuus);
	                    break;
	                case 3:
	                	NhanVienVanPhong nhanVienVanPhong = new NhanVienVanPhong("1", "Hoang", LocalDate.of(2023, 6, 15), 2, 20);
	                	NhanVienVanPhong nhanVienVanPhong1 = new NhanVienVanPhong("2", "Anh", LocalDate.of(2023, 7, 25), 2, 5);
	                	ArrayList<NhanVienVanPhong> nhanVienVanPhongs = new ArrayList<NhanVienVanPhong>();
	                	nhanVienVanPhongs.add(nhanVienVanPhong);
	                	nhanVienVanPhongs.add(nhanVienVanPhong1);
	            		System.out.println(nhanVienVanPhongs);
	                    break;
	            }
	        }
	    }
}
