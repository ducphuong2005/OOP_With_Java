import java.util.Scanner;

public abstract class GiangVien {
    Scanner sc = new Scanner(System.in);
    protected String hoTen;
    protected String ngaySinh;
    protected String diaChi;

    public GiangVien(String hoTen, String ngaySinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
    public GiangVien() {}

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
    public void nhapTT(){
        System.out.println("Nhap ho ten giang vien:");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh cua giang vien:");
        ngaySinh = sc.nextLine();
        System.out.println("Nhap dia chi cua giang vien:");
        diaChi = sc.nextLine();
    }
    public void inTT(){
        System.out.println("Ho ten giang vien: "+hoTen );
        System.out.println("Ngay sinh cua giang vien: "+ngaySinh );
        System.out.println("Dia chi cua giang vien: "+diaChi );
    }
}
