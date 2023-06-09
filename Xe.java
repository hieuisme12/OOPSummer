package BaiTap4;

public class Xe {
	private String chuXe;
	private String loaiXe;
	private double giaXe;
	private float dungTich;
	public Xe() {
	}
	public Xe(String chuXe, String loaiXe, double giaXe, float dungTich) {
		setChuXe(chuXe);
		setLoaiXe(loaiXe);
		setGiaXe(giaXe);
		setDungTich(dungTich);
	}
	public String getChuXe() {
		return chuXe;
	}
	public void setChuXe(String chuXe) {
		if(chuXe.equals(""))
		this.chuXe = "mac dinh";
		else 
			this.chuXe = chuXe;
	}
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) {
		if(loaiXe.equals(""))
			this.loaiXe = "Mac dinh";
		else 
		this.loaiXe = loaiXe;
	}
	public double getGiaXe() {
		return giaXe;
	}
	public void setGiaXe(double giaXe) {
		if ( giaXe < 0  )
			this.giaXe = 0;
		else 
			this.giaXe = giaXe;
	}
	public float getDungTich() {
		return dungTich;
	}
	public void setDungTich(float dungTich) {
		if(dungTich >=0  )
		this.dungTich = dungTich;
		else 
			this.dungTich = 0;
	}
	public double thue() {
		if(dungTich<100)
			return giaXe*0.01;
		else if ( dungTich >=100 && dungTich <=200)
			return giaXe*0.03;
		else
			return giaXe*0.05;
	}
	@Override
	public String toString() {
		return "Xe [chuXe=" + chuXe + ", loaiXe=" + loaiXe + ", giaXe=" + giaXe + ", dungTich=" + dungTich + ", thue="
				+ thue() + "]";
	}
	
	
}
