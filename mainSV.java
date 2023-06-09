package baiTap2;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(21112581, "Lam Trung Hieu",6,8);	//sv1
		SinhVien sv2 = new SinhVien(21112331, "Lam Trung Hieu12",3,1);	//sv2
		SinhVien sv3 = new SinhVien();
		Scanner sc = new Scanner(System.in);
	//sv3
		System.out.println("Nhap mssv cua sv3: ");
		int masv= sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ten cua sv3: ");
		String hoten = sc.nextLine();
		System.out.println("Nhiem diem TH: ");
		float diemTH = sc.nextFloat();
		System.out.println("Nhap diem LT: ");
		float diemLT = sc.nextFloat();
		sv3.setMaSV(masv);
		sv3.setHoTen(hoten);
		sv3.setDiemTH(diemTH);
		sv3.setDiemLT(diemLT);
		System.out.println(String.format("%-5s %-30s %10s %10s %10s", "masv",
				"hoten","diemlt","diemth","diemtb"));
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
	}
}
