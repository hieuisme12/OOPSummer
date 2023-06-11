package BaiTap5;

import java.time.LocalDate;

public class HangThucPham {
	private String maHang;
	private String tenHang;
	private double donGia;
	private LocalDate ngaySX;
	private LocalDate ngayHH;
	
	public HangThucPham() {
	}

	public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySX, LocalDate ngayHH) {
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setNgaySX(ngaySX);
		setNgayHH(ngayHH);
	}

	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		if(maHang.equals(""))	
		this.maHang= "xxx";
		else 
			this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		if(tenHang.equals(""))	
			this.tenHang= "xxx";
			else 
				this.tenHang = tenHang;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		if(donGia <=0)
			this.donGia = 0;
		else
		 this.donGia = donGia;
	}
	public LocalDate getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(LocalDate ngaySX) {
		if(ngaySX.isBefore(LocalDate.now()))
			this.ngaySX = ngaySX;
		else 
			this.ngaySX= LocalDate.now();
	}
	public LocalDate getNgayHH() {
		return ngayHH;
	}
	public void setNgayHH(LocalDate ngayHH) {
		if(ngayHH.isAfter(LocalDate.now())&&ngayHH.isAfter(ngaySX))
			this.ngaySX = ngaySX;
		else 
			this.ngayHH = ngaySX;
	}
	public void hetHan() {
		if(LocalDate.now().isAfter(ngayHH))
		{
			System.out.println("San pham het han");
		}
		else 
			System.out.println("Con han su dung");
	}

	@Override
	public String toString() {
		return "HangThucPham [maHang=" + maHang + ", tenHang=" + tenHang + ", donGia=" + donGia + ", ngaySX=" + ngaySX
				+ ", ngayHH=" + ngayHH + "]";
	}

	
}
