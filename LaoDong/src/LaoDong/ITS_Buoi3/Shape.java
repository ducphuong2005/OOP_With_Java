package LaoDong.ITS_Buoi3;

public abstract class Shape {
    private double tinhChuVi;
    private double tinhDienTich;

    public Shape() {}
    public Shape(double tinhDienTich, double tinhChuVi) {
        this.tinhDienTich = tinhDienTich;
        this.tinhChuVi = tinhChuVi;
    }

    public double getTinhChuVi() {
        return tinhChuVi;
    }

    public void setTinhChuVi(double tinhChuVi) {
        this.tinhChuVi = tinhChuVi;
    }

    public double getTinhDienTich() {
        return tinhDienTich;
    }

    public void setTinhDienTich(double tinhDienTich) {
        this.tinhDienTich = tinhDienTich;
    }

    public abstract double tinhDienTich();
}
