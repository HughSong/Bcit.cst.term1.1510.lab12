package q1;

import java.text.NumberFormat;

public class Commission extends Hourly {
    double totalSale;
    double commissionRate;
    NumberFormat fmt = NumberFormat.getPercentInstance();
    //System.out.println(fmt.format(rate));
    public Commission(String name, String address, String phone, String ocSecNumber, double rate, double commissionRate) {
        super(name, address, phone, ocSecNumber, rate);
        this.commissionRate = commissionRate;

    }

    public void addSales(double totalSale) {
        this.totalSale = totalSale;
        
    }

    public double pay() {
        double payment = totalSale * commissionRate;
        payment += super.pay();
        totalSale =0;
        return payment;                
    }

    public String toString() {
        String result = super.toString();
        result += "\ntotal sale: " + totalSale;
        return result;
    }
}
