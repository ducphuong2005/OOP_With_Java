import java.util.Scanner;

public class AverageRank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Math score: ");
        double math = scanner.nextDouble();
        System.out.print("Enter Physics score: ");
        double physics = scanner.nextDouble();
        System.out.print("Enter Chemistry score: ");
        double chemistry = scanner.nextDouble();

        double avg = (math + physics + chemistry) / 3;
        char rank;
        if (avg >= 8.0) rank = 'A';
        else if (avg >= 6.5) rank = 'B';
        else if (avg >= 5.0) rank = 'C';
        else rank = 'D';

        System.out.println("Average: " + avg + ", Rank: " + rank);
    }
}
