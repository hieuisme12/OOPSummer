package baiTap2;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private float diemTH;
	private float diemLT;
	
	public SinhVien(int maSV, String hoTen, float diemTH, float diemLT) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diemTH = diemTH;
		this.diemLT = diemLT;
	}
	public SinhVien() {
		super();
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		if(maSV<=0)
			this.maSV = 0;
		else
		
			this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		if(hoTen.equals(""))
			this.hoTen = "mac dinh";
		else	
			this.hoTen = hoTen;
	}
	public float getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(float diemTH) {
		if(diemTH<0||diemTH>10)
			this.diemTH=0;
		else
			this.diemTH = diemTH;
	}
	public float getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(float diemLT) {
		if(diemLT<0||diemLT>10)
			this.diemLT=0;
		else
			this.diemLT = diemLT;
	}
	public float diemTB() {
		return (diemLT+diemTH)/2;
	}
	@Override
	public String toString() {
		return "" + maSV + "  " + hoTen + "        " + diemTH + "    " + diemLT + "   ";
	}
	
	}
	

