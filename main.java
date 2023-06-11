package BaiTap5;

import java.time.LocalDate;

public class main {
	public static void main(String[]agrs ) {
		HangThucPham p1 = new HangThucPham("001","gao", 100000,LocalDate.of(2018, 7, 10), LocalDate.of(2018, 7, 10));
		System.out.println(p1);
	}
}
