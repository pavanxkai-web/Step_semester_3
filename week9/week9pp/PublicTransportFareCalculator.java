public class PublicTransportFareCalculator {
    interface Fare {double calculate(double distance);}
    static class Bus implements Fare {public double calculate(double d){return 10+Math.max(0,d-2)*3;}}
    static class Train implements Fare {public double calculate(double d){return 15+d*2;}}
    static class Metro implements Fare {public double calculate(double d){return 20+d*2.5;}}
    public static void main(String[] args){double d=12;Fare[] f={new Bus(),new Train(),new Metro()};for(Fare x:f)System.out.printf("%.2f%n",x.calculate(d));}
}
