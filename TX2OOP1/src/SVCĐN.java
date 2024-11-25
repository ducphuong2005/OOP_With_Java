public class SVCĐN extends Nguoi implements CDCQInter{
    protected double TDKTCDN;
    protected double SMKTCDN;

    public SVCĐN(double TDKTCDN, double SMKTCDN) {
        super();
        this.TDKTCDN = TDKTCDN;
        this.SMKTCDN = SMKTCDN;
    }
    public SVCĐN(){}

    public double getTDKTCDN() {
        return TDKTCDN;
    }

    public void setTDKTCDN(double TDKTCDN) {
        this.TDKTCDN = TDKTCDN;
    }

    public double getSMKTCDN() {
        return SMKTCDN;
    }

    public void setSMKTCDN(double SMKTCDN) {
        this.SMKTCDN = SMKTCDN;
    }
    public void nhapCDN(){
        super.nhapThongTin();
        System.out.println("Nhap tong diem kiem tra:");
        TDKTCDN = sc.nextDouble();
        System.out.println("Nhap so mon kiem tra:");
        SMKTCDN = sc.nextDouble();
    }


    @Override
    public double tinhDiem() {
        return TDKTCDN/SMKTCDN;
    }
}
