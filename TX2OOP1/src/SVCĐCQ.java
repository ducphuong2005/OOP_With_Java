import java.util.Scanner;

public class SVCĐCQ extends Nguoi implements CDCQInter{
    Scanner sc = new Scanner(System.in);
    protected double TDKT;
    protected double SMKT;
    protected double DTKTHP;

    public SVCĐCQ(double TDKT, double SMKT, double DTKTHP) {
        super();
        this.TDKT = TDKT;
        this.SMKT = SMKT;
        this.DTKTHP = DTKTHP;
    }
    public SVCĐCQ(){}

    public double getTDKT() {
        return TDKT;
    }

    public void setTDKT(double TDKT) {
        this.TDKT = TDKT;
    }

    public double getSMKT() {
        return SMKT;
    }

    public void setSMKT(double SMKT) {
        this.SMKT = SMKT;
    }

    public double getDTKTHP() {
        return DTKTHP;
    }

    public void setDTKTHP(double DTKTHP) {
        this.DTKTHP = DTKTHP;
    }
    public void nhapCQ(){
        super.nhapThongTin();
        System.out.println("Nhap tong diem cac mon kiem tra:");
        TDKT=sc.nextDouble();
        System.out.println("Nhap so mon kiem tra:");
        SMKT=sc.nextDouble();
        System.out.println("Nhap diem thi KTHP::");
        DTKTHP=sc.nextDouble();
    }
    public void inCQ(){
        super.inThongTin();
        System.out.println("Tong diem cac mon kiem tra: "+TDKT);
        System.out.println("So mon kiem tra: "+SMKT);
        System.out.println("Diem thi KTHP: "+DTKTHP);

    }

    @Override
    public double tinhDiem() {
        return (TDKT/SMKT+DTKTHP)/3;
    }
}
