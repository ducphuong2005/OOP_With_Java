package LaoDong;
import java.util.Scanner;
public class LaoDongPhoThong extends NguoiLaoDong {
	private double soNgayCong;
	private double donGiaNgayCong;
	public LaoDongPhoThong() {
		super();
	}
	public LaoDongPhoThong(double soNgayCong, double donGiaNgayCong, String hoTen, String diaChi) {
		super(hoTen, diaChi);
		this.soNgayCong= soNgayCong;
		this.donGiaNgayCong= donGiaNgayCong;
	}
	public double getSoNgayCong() {
		return soNgayCong;
	}
	public void setSoNgayCong(double soNgayCong) {
		this.soNgayCong = soNgayCong;
	}
	public double getDonGiaNgayCong() {
		return donGiaNgayCong;
	}
	public void setDonGiaNgayCong(double donGiaNgayCong) {
		this.donGiaNgayCong = donGiaNgayCong;
	}
	public void nhap() {
		super.nhapThongTin();
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhập số ngày công: ");
		soNgayCong= sc.nextDouble();
		System.out.println("Nhập đơn giá 1 ngày công: ");
		donGiaNgayCong= sc.nextDouble();
	}
	@Override
	public double tinhLuong() {
		// TODO Auto-generated method stub
		double thuong = 0;
        if (soNgayCong >= 25) {
            thuong = 700000;
        } else if (soNgayCong >= 15) {
            thuong = 0;
        }
        return  soNgayCong * donGiaNgayCong + thuong;
	}
	public void inThongTin() {
		System.out.println(super.toString());
		System.out.println("Lương tháng của lao động phổ thông là: "+ tinhLuong());
	}
}
