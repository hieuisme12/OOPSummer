package baiTap;

public class bai1 {
	private int x;
	private int y;
	private char ten;
	public bai1() {
	}
	public bai1(int x, int y, char ten) {
		this.x = x;
		this.y = y;
		this.ten = ten;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public char getTen() {
		return ten;
	}
	public void setTen(char ten) {
		this.ten = ten;
	}
	@Override
	public String toString() {
		return "bai1 [x=" + x + ", y=" + y + ", ten=" + ten + "]";
	}
	 
}
