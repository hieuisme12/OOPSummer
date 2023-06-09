package BaiTap3;
public class TamGiac {
	private int ma;
	private int mb;
	private int mc;
	public TamGiac() {
		
	}
	public TamGiac(int ma, int mb, int mc) {
		setMa(ma);
		setMb(mb);
		setMc(mc);
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		if(ma <= 0 )
			this.ma = 0;
		else
			this.ma = ma;
	}
	public int getMb() {
		return mb;
	}
	public void setMb(int mb) {
		if(mb <= 0 )
			this.mb = 0;
		else
			this.mb = mb;
	}
	public int getMc() {
		return mc;
	}
	public void setMc(int mc) {
		if(mc <= 0 )
			this.mc = 0;
		else
			this.mc = mc;
	}
	public long tinhChuVi() {
		return ma+mb+mc;
	}
	public double tinhDienTich() {
		float p = (ma+mb+mc)/2;
		double x = p*(p-ma)*(p-mb)*(p-mc);
		return Math.sqrt(x); 
	}
	public String kiemTraTamGiac() {
		if ( ma+mb <=mc || ma+mc<=mb||mb+mc<= ma)
			return "khong phai tam giac";
			else if ( ma==mb || ma==mc || mb==mc)
				return "tam giac can";
			else if(ma*ma + mb*mb == mc*mc|| ma*ma + mc*mc == mb*mb || mb*mb + mc*mc == ma*ma)
				return "tam giac vuong";
			else 
				return "tam giac thuong";			
	}
	@Override
	public String toString() {
		return "TamGiac [ma=" + ma + ", mb=" + mb + ", mc=" + mc + ", tinhChuVi()=" + tinhChuVi() + ", tinhDienTich()="
				+ tinhDienTich() + ", kiemTraTamGiac()=" + kiemTraTamGiac() + "]";
	}
	
	
}
