package LaoDong;

public class Test {
	public static void main(String[] args) {
		LaoDongPhoThong ld= new LaoDongPhoThong();
		KiSu ks= new KiSu();
		System.out.println("Nhập thông tin của lao động phổ thông: ");
		ld.nhap();
		System.out.println("Nhập thông tin của Kỹ sư: ");
		ks.nhap();
		 System.out.println("\nThông tin và lương lao động phổ thông:");
	        ld.inThongTin();
	     System.out.println("\nThông tin và lương kỹ sư:");
	        ks.inThongTin();
	}

}
