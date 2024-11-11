package Abstract;
import java.util.Scanner;
public class ToaDo {
	int x,y;

	public ToaDo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public ToaDo() {
		this.x=0;
		this.y=0;
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
	public void inputData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap toa do x: ");
		x= sc.nextInt();
		System.out.println("Nhap toa do y: ");
		y=sc.nextInt();
		
	}
	public String outputData()
	{
		return "toa do x : "+x+"\ntoa do y: "+y;
	}

}
