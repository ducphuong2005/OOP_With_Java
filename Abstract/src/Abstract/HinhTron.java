package Abstract;
import java.util.Scanner;
public class HinhTron extends Hinh{
	private double r;

	public HinhTron(ToaDo toaDo, double r) {
		super(toaDo);
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public HinhTron(ToaDo toaDo) {
		super(toaDo);
	}
	public void inputData()
	{
		Scanner sc= new Scanner(System.in);
		super.inputData();
		
		
	}

}
