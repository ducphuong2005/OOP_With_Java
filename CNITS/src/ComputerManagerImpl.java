import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ComputerManagerImpl implements ComputerManager {
    Scanner sc = new Scanner(System.in);
    List<Computer> computers = new ArrayList<Computer>();
    public ComputerManagerImpl(List<Computer> c) {this.computers = c;}
    @Override
    public boolean addComputer(Computer c) {
        c.input(c);
        computers.add(c);
        return true;
    }

    @Override
    public boolean editComputer(Computer c) {
        System.out.println("Enter ID: ");
        c.setpID(sc.next());
        System.out.println("Enter Name: ");
        c.setpName(sc.next());
        System.out.println("Enter Price: ");
        c.setpPrice(sc.nextDouble());
        System.out.println("Enter Total: ");
        c.setpTotal(sc.nextDouble());
        System.out.println("Enter Color: ");
        c.setColor(sc.next());
        System.out.println("Enter Screen size: ");
        c.setScreenSize(sc.nextDouble());
        return true;
    }

    @Override
    public boolean delComputer(Computer c) {
        return computers.remove(c);
    }

    @Override
    public List<Computer> searchComputer(String name) {
        List<Computer> C2= new ArrayList<>();
        boolean found = false;
        for(int i=0; i<computers.size(); i++){
            if(computers.get(i).getpName().equals(name)){
                C2.add(computers.get(i));
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Computer not found!");
        }
        else System.out.println("Found Successfully!");
        return C2;
    }

    @Override
    public List<Computer> sortedComputer(double price) {
        computers.sort(Comparator.comparing(Computer::getpPrice));
        return computers;
    }
}
