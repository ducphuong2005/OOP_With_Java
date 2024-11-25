import java.util.Scanner;

public abstract class Nguoi {
    Scanner sc = new Scanner(System.in);
    protected String hoTen;
    protected String ngaySinh;
    protected String diaChi;
    protected String maSV;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String ngaySinh, String diaChi, String maSV) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void nhapThongTin(){
        System.out.println("Nhap vao ho va ten: ");
        hoTen= sc.nextLine();
        System.out.println("Nhap vao ngay sinh: ");
        ngaySinh= sc.nextLine();
        System.out.println("Nhap vao dia chi: ");
        diaChi= sc.nextLine();
        System.out.println("Nhap vao ma sv: ");
        maSV= sc.nextLine();
    }
    public void inThongTin(){
        System.out.println("Ho ten: "+ hoTen);
        System.out.println("Ngay sinh: "+ ngaySinh);
        System.out.println("Dia chi: "+ diaChi);
        System.out.println("Ma sv: "+ maSV);
    }
  public abstract double tinhDiem();
}
