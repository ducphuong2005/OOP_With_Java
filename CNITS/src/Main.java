import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Computer> C= new ArrayList<>();
        ComputerManagerImpl com =new ComputerManagerImpl(C);
        System.out.println("Enter total of product:");
        int slg= sc.nextInt();
        sc.nextLine();
        try {
            for (int i = 0; i < slg; i++) {
                Computer c = new Computer();
                com.addComputer(c);
            }
        }
        catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("Enter pID to fix");
        String p= sc.next();
        boolean check= false;
        for(int i=0; i<C.size(); i++){
            if(C.get(i).getpID().equals(p)){
                com.editComputer(C.get(i));
                check=true;
                break;
            }
        }
        if(!check){
            System.out.println("Not found");
        }
        System.out.println("Enter product ID to erase");
        String p1= sc.next();
        boolean check1= false;
        for(int i=0; i<C.size(); i++){
            if(C.get(i).getpID().equals(p1)){
                com.delComputer(C.get(i));
                check1=true;
                break;
            }
        }
        if(!check1){
            System.out.println("Not successfully");
        }
        else System.out.println("successfully");
        List<Computer> C2= new ArrayList<>();
        System.out.println("Enter name of computer to find:");
        String name= sc.next();
        C2 = com.searchComputer(name);
        for(Computer c: C2){
            System.out.println(c.toString());
        }
        System.out.println("Sort by price:");
        C=com.sortedComputer(0);
        for(Computer c: C){
            System.out.println(c.toString());
        }
    }
}