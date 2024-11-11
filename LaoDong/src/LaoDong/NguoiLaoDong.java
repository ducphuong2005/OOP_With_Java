package LaoDong;
import java.util.Scanner;
public abstract class NguoiLaoDong {
	private String hoTen;
	private String diaChi;
	public void nhapThongTin() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhập vào họ và tên: ");
		hoTen= sc.nextLine();
		System.out.println("Nhập vào địa chỉ: ");
		diaChi= sc.nextLine();
	}
	public NguoiLaoDong() {}
	public NguoiLaoDong(String hoTen, String diaChi) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
	}
	public abstract double tinhLuong();
	
	public String toString() {
		return "[hoTen=" + hoTen + ", diaChi=" + diaChi + "]";
	}
	

}
