package LaoDong.ITS_Buoi3;

public class HinhTron extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
public double tinhDienTich(){
        return radius * radius;
}
}
