import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so sinh vien cao dang chinh quy:");
        int n = scan.nextInt();
        SVCĐCQ[] cdcq= new SVCĐCQ[n];
        while(n<2||n>4)
        {
            System.out.println("Vui long nhap lai so sinh vien cao dang chinh quy( tu 2 den 4):");
            n=scan.nextInt();
        }
        try {
            for (int i = 0; i < n; i++) {
                System.out.println("Sinh vien cao dang chinh quy " + (i + 1));
                cdcq[i] = new SVCĐCQ();
                cdcq[i].nhapCQ();
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for(int i=0;i<n;i++){
            System.out.println("====================================");
            System.out.println("Sinh vien cao dang chinh quy "+(i+1));
            cdcq[i].inCQ();
        }
        System.out.println("Nhap vao ma sinh vien de kiem tra:");
        String m= scan.next();
        boolean t= false;
        for(int i=0;i<n;i++){
            if(cdcq[i].getMaSV().equals(m)) {
                cdcq[i].inCQ();
                t=true;
                break;
            }
            if(!t) {
                System.out.println("Khong ton tai sinh vien!");
                break;
            }
        }

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            {
                if(cdcq[i].tinhDiem()<cdcq[j].tinhDiem()) {
                    SVCĐCQ temp= cdcq[i];
                    cdcq[i]= cdcq[j];
                    cdcq[j]=temp;
                }
            }
        System.out.println("=====================================================");
        System.out.println("Danh sach sinh vien sau sap xep theo diem trung binh la:");
        for(int i=0;i<n;i++){
            cdcq[i].inCQ();
        }
    }
}