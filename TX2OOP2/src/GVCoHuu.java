import java.util.Scanner;

public class GVCoHuu extends GiangVien implements GVThingGiang{
    Scanner sc = new Scanner(System.in);
    protected double luongCB;
    protected double heSo;
    protected double phuCap;

    public GVCoHuu(String hoTen, String ngaySinh, String diaChi, double luongCB, double heSo, double phuCap) {
        super(hoTen, ngaySinh, diaChi);
        this.luongCB = luongCB;
        this.heSo = heSo;
        this.phuCap = phuCap;
    }
    public GVCoHuu() {}

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    public void nhap(){
        super.nhapTT();
        System.out.println("Nhap luong co ban cua giang vien:");
        luongCB = sc.nextDouble();
        System.out.println("Nhap he so luong;");
        heSo = sc.nextDouble();
        System.out.println("Nhap phu cap;");
        phuCap = sc.nextDouble();
    }
    public void inCH(){
        super.inTT();
    }
    @Override
    public double tinhLuong() {
        return luongCB*heSo+phuCap;
    }
}
