import java.util.Scanner;

public abstract class Shape {
    protected String name;
    protected int x;
    protected int y;

    public Shape() {
    }

    public Shape(int x, int y, String name) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the shape : ");
        name = sc.nextLine();
        System.out.print("Enter the x : ");
        x = sc.nextInt();
        System.out.print("Enter the y : ");
        y = sc.nextInt();
    }


}
