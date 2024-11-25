import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so giang vien:");
        int n=sc.nextInt();
        GVCoHuu[] gvCoHuu = new GVCoHuu[n];
        try{
            if(n<2||n>4)
                throw new Exception();
        }

        catch(Exception e){
            System.out.println(e.getMessage());

        }

    }
}