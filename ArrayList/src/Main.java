import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //arraylist(car 1, car 2, ... car n);
        //arraylist.car1;
        //thay đổi được kích thước của arraylist
        //truy cập theo chỉ số như array
        //cho phép ptử trùng
        /*
        Khởi tạo ArrayList:
        ArrayList<Object>Tên= new ArrayList<>();
        Các phương thức trong ArrayList:
        add: thêm 1 ptử vào cuối ds
        remove(int index): xóa ptử tại vị trí chỉ định
        set(int index, Object): cập nhật phần tử tại vtrí chỉ định
        get(int index): lấy ptử tại vtrí chhỉ định
        size(): trả về slg các ptử trong arraylist
        isEmpty(): ktra ds có rỗng hay không
        contains(Object o): kiểm tra xem mảng có chưa đối tượng cần tìm hay không
         */

//        ArrayList<String>list=new ArrayList<>();
//        //thêm ptử vào arraylist
//        list.add("apple");
//        list.add("orange");
//        list.add("banana");
//        list.add("banana");
//        list.add("banana");
//        list.add("banana");
//
//        //in ra
//        System.out.println(list.get(0));
//        list.set(0,"jackfruit");
//        System.out.println("Phan tu 0 sau cap nhat: ");
//        System.out.println(list.get(0));
//        list.remove(list.get(0));
//        System.out.println(list);
//        // vong lap truyen thong
//        for(int i=0;i<list.size();i++){
//            System.out.println("phan tu "+i+":"+list.get(i) );
//        }
//        //duyet theo for-each
//        System.out.println("===============================");
//        for(String a: list){
//            System.out.println(a);
//        }
//        //duyet theo lamda
//        list.forEach(a1->{
//            System.out.println("===============================");
//            System.out.println(a1);
//        });
        ArrayList<Student> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice:");
            System.out.println("1. Add student");
            System.out.println("2. Show all students");
            System.out.println("3. Exit");
            int choice= scanner.nextInt();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < list.size(); i++) {
                        Student student = new Student();
                        System.out.println("Enter student name" + (i + 1) + ":");
                        student.inputData();
                        list.add(student);
                    }
                    break;
                case 2:
                    System.out.println("======================");
                    for(Student s : list){
                        System.out.println(s);
                    }
                    break;
                    //remove
                case 3:
                        Student s=new Student();
                        System.out.println("Enter information about Student");
                        s.inputData();
                        list.remove(s);
                        break;
                case 0:
                    return;
            }
        }
        }
    }
