public class ElectricityConnectionBilling {
    interface Billable {double bill(double units);}
    static class Domestic implements Billable {public double bill(double u){return u<=100?u*2:u<=200?200+(u-100)*3:500+(u-200)*5;}}
    static class Commercial implements Billable {public double bill(double u){return u*7;}}
    public static void main(String[] args){double units=250;Billable[] types={new Domestic(),new Commercial()};for(Billable b:types)System.out.printf("%.2f%n",b.bill(units));}
}
