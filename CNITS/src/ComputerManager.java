import java.util.ArrayList;
import java.util.List;
public interface ComputerManager {
    public boolean addComputer (Computer c);
    public boolean editComputer (Computer c) ;
    boolean delComputer (Computer c);
    public List<Computer> searchComputer (String name) ;
    public List<Computer> sortedComputer (double price);
}
