import java.util.Scanner;

public class Computer extends Product {
    Scanner sc=new Scanner(System.in);
    protected String color;
    protected double screenSize;

    public Computer() {
    }
    public Computer(String pID, String pName, double pPrice, double pTotal, String color, double screenSize) {
        super(pID, pName, pPrice, pTotal);
        this.color = color;
        this.screenSize = screenSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void input(Computer c) {
        System.out.println("Enter ID:");
        c.setpID(sc.next());
        System.out.println("Enter name:");
        c.setpName(sc.next());
        System.out.println("Enter price:");
        c.setpPrice(sc.nextDouble());
        System.out.println("Enter total:");
        c.setpTotal(sc.nextDouble());
        System.out.println("Enter color:");
        c.setColor(sc.next());
        System.out.println("Enter screen size:");
        c.setScreenSize(sc.nextDouble());


    }
    @Override
    public String toString() {
        return "Computer{" +
                "color='" + color + '\'' +
                ", screenSize=" + screenSize +
                ", pID='" + pID + '\'' +
                ", pName='" + pName + '\'' +
                ", pPrice=" + pPrice +
                ", pTotal=" + pTotal +
                '}';
    }
}
