import java.util.Scanner;

public class ResizableCricle extends Circle implements Resizable {
    public ResizableCricle() {}
    public ResizableCricle(int x, int y, String name, double radius) {
        super(x, y, name, radius);
    }
    public void intputData2(){
        super.inputData1();
    }

    @Override
    public void resizable(int percent) {
       setRadius(radius*(double)percent/100);
        System.out.println("Dien tich: " + getArea());
        System.out.println("Chu Vi: " + getPerimeter());
    }
}
