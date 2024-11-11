import java.util.Scanner;

public class Student {
    protected String stuID;
    protected String name;
    protected int age;

    public Student(String stuID, String name, int age) {
        this.stuID = stuID;
        this.name = name;
        this.age = age;
    }
    public Student() {}

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void inputData(){
        System.out.println("Nhap stuID");
        Scanner sc = new Scanner(System.in);
        stuID = sc.nextLine();
        System.out.println("Nhap name");
        name = sc.nextLine();
        System.out.println("Nhap age");
        age = sc.nextInt();
    }
    @Override
    public String toString() {
        return
                "stuID='" + stuID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
