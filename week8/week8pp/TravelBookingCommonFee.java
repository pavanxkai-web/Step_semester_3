public class TravelBookingCommonFee {
    interface Booking {double fee(double base);}
    static class Flight implements Booking {public double fee(double b){return b+b*0.10;}}
    static class Train implements Booking {public double fee(double b){return b+b*0.05;}}
    static class Bus implements Booking {public double fee(double b){return b+b*0.02;}}
    public static void main(String[] args){Booking[] b={new Flight(),new Train(),new Bus()};for(Booking x:b)System.out.printf("%.2f%n",x.fee(1000));}
}
