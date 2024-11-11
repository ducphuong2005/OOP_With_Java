package Abstract;
import java.util.Scanner;
public abstract class Hinh {
	protected ToaDo toaDo;

	public Hinh(ToaDo toaDo) {
		this.toaDo = toaDo;
	}

	public ToaDo getToaDo() {
		return toaDo;
	}
	public void setToaDo(ToaDo toaDo) {
		this.toaDo = toaDo;
	}
	public void inputData()
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Nhap toa do: ");
		toaDo= new ToaDo();
		toaDo.inputData();
	}

	

}
