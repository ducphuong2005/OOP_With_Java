package Abstract;
import java.util.Scanner;
public class HinhChuNhat extends Hinh {
	private double chieuRong, chieuCao;
	public HinhChuNhat(ToaDo toaDo, double chieuRong, double chieuCao) {
		super(new ToaDo());
		// TODO Auto-generated constructor stub
		this.chieuRong= chieuRong;
		this.chieuCao= chieuCao;
		
	}

	public void inputData()
	{
		Scanner sc= new Scanner(System.in);
		super.inputData();
		System.out.println("Nhap chieu rong cua hinh chu nhat: ");
		chieuRong=sc.nextDouble();
		System.out.println("Nhap chieu cao cua hinh chu nhat: ");
		chieuCao= sc.nextDouble();
	}

	
	}
	


