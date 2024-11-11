package BAI2;
public class Person {
	// Constants
	public static final String FIRST
	_
	NAME = "No FirstName";
	public static final String LAST
	_
	NAME = "No LastName";
	public static final byte AGE = 0;
	public static final GENDER GEN = GENDER.UNDEFINED;
	public static final Address ADDRESS = new Address();

	// Classes' variables
	private static int count = 0;
	// Object's properties
	private String firstName;
	private String lastName;
	protected byte age;
	private GENDER gen;
	private Address address;
	// Constructor methods
	public Person() {
	// Đặc biệt 1
	// this.firstName = "No FirstName";
	// this.lastName = "No LastName";
	// this.age = 0;
	// this.gen = GENDER.UNDEFINED;
	this(Person.FIRST
	_
	NAME, Person.LAST
	_
	NAME, Person.AGE,
	Person.GEN, Person.ADDRESS);
	}
	public Person(byte age) {
	this(Person.FIRST
	_
	NAME, Person.LAST
	_
	NAME, age,
	Person.GEN, Person.ADDRESS);
	}
	public Person(GENDER gen) {
	this(Person.FIRST
	_
	NAME, Person.LAST
	_
	NAME, Person.AGE,
	gen, Person.ADDRESS);
	}
	public Person(String firstName, byte age) {
	this(firstName, Person.LAST
	_
	NAME, age,
	Person.GEN, Person.ADDRESS);
	}
	public Person(String firstName, String lastName,
	byte age, GENDER gen, Address address) {
	// Đặc biệt 2
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.gen = gen;
	//Cách 1 - Gán địa chỉ trong bộ nhớ cho nhau
	//this.address = address;
	//Cách 2 - Khởi tạo vùng nhớ mới và sao chép giá trị
	this.address = new Address(address);
	// Tăng biến đếm thể hiện đối tượng của lớp
	Person.count++;
	}
	// Getter methods
	public String getFirstName() {
	return this.firstName;
	}
	public String getLastName() {
	return this.lastName;
	}
	public byte getAge() {
	return this.age;
	}
	public GENDER getGen() {
	return this.gen;
	}
	public Address getAddress() {
	return address;
	}
	public void setAddress(Address address) {
	this.address = address;
	}
	public void setAddress(String cityName,
	String districtName, String streetName) {
	this.address = new Address(cityName,
	districtName, streetName);
	}
	// Setter methods
	public Person setFirstName(String firstName) {
	this.firstName = firstName;
	return this;
	}
	public Person setLastName(String lastName) {
	this.lastName = lastName;
	return this;
	}
	public Person setAge(byte age) {
	this.age = age;
	
	return this;
	}
	public Person setGen(GENDER gen) {
	this.gen = gen;
	return this;
	}
	// Other methods
	public String toString() {
	return age + " -
	" + gen.name();
	//return lastName + " " + firstName + ", " +
	age + " - " + gen.name();
	}
	public static int getCountPerson() {
	return Person.count;
	}
	protected void finalize() throws Throwable {
	// Giảm thể hiện đối tượng
	Person.count--;
	}
	public static void main(String[] args) {
	int len = GENDER.values().length;
	int index = (int) (Math.random() * len);
	Address addr = new Address("Hà Nội",
	"Bắc Từ Liêm", "Phố Nhổn");
	Person p;
	Person p1 = new Person();
	Person p2 = new Person((byte) 18);
	Person p3 = new Person(GENDER.values()[index]);
	Person p4 = new Person("Tuấn Anh", (byte) 20);
	Person p5 = new Person("Tuấn", "Phạm Minh",
	(byte) 23, GENDER.MALE, addr);
	System.out.println(p5);
	//Thay đổi thông tin lưu của addr
	addr.setStreetName("Kiều Mai");
	System.out.println(p5);
	}
	public static enum GENDER {
	MALE, FEMALE, MF, FM, UNDEFINED

	}
	}//Person