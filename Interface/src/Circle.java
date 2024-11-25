
public class Circle extends Shape implements GeometricObject {
    protected double radius = 1.0;

    public Circle() {
    }

    public Circle(int x, int y, String name, double radius) {
        super(x, y, name);
        this.radius = radius;
    }
    public void inputData1(){
        super.inputData();
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }
}

