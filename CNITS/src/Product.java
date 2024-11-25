public class Product {
    protected String pID;
    protected String pName;
    protected double pPrice;
    protected double pTotal;

    public Product() {
    }

    public Product(String pID, String pName, double pPrice, double pTotal) {
        this.pID = pID;
        this.pName = pName;
        this.pPrice = pPrice;
        this.pTotal = pTotal;
    }

    public String getpID() {
        return pID;
    }

    public void setpID(String pID) {
        this.pID = pID;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getpPrice() {
        return pPrice;
    }

    public void setpPrice(double pPrice) {
        this.pPrice = pPrice;
    }

    public double getpTotal() {
        return pTotal;
    }

    public void setpTotal(double pTotal) {
        this.pTotal = pTotal;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pID='" + pID + '\'' +
                ", pName='" + pName + '\'' +
                ", pPrice=" + pPrice +
                ", pTotal=" + pTotal +
                '}';
    }
}
