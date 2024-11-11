package LaoDong;
import java.util.Scanner;
public class KiSu extends NguoiLaoDong{
	private double luongCoBan;
	private double heSoLuong;
	private double soNgayCong;
	public KiSu() {
		super();
	}
	public KiSu(String hoTen, String diaChi, double luongCoBan, double heSoLuong, double soNgayCong ) {
		super(hoTen, diaChi);
		this.heSoLuong= heSoLuong;
		this.luongCoBan= luongCoBan;
		this.soNgayCong= soNgayCong;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public double getSoNgayCong() {
		return soNgayCong;
	}
	public void setSoNgayCong(double soNgayCong) {
		this.soNgayCong = soNgayCong;
	}
	public void nhap() {
		super.nhapThongTin();
		Scanner sc= new Scanner (System.in);
		System.out.println("Nhập lương cơ bản của kỹ sư: ");
		luongCoBan= sc.nextDouble();
		System.out.println("Nhập hệ số lương: ");
		heSoLuong= sc.nextDouble();
		System.out.println("Nhập số ngày công của kỹ sư: ");
		soNgayCong= sc.nextDouble();
	}
	@Override
	public double tinhLuong() {
		// TODO Auto-generated method stub
		double thuong = 0;
        if (soNgayCong >= 25) {
            thuong = 2000000;
        } else if (soNgayCong >= 15) {
            thuong = 1000000;
        } else {
            thuong = 500000;
        }
        return luongCoBan * heSoLuong + thuong;
	}
	public void inThongTin() {
		System.out.println(super.toString());
		System.out.println("Lương tháng của kỹ sư là: "+ tinhLuong());
	}
	}
