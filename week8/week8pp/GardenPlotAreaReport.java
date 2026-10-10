import java.util.*;
public class GardenPlotAreaReport {
    static abstract class Plot {String owner;Plot(String o){owner=o;}abstract double area();abstract String shape();}
    static class Circle extends Plot {double r;Circle(String o,double r){super(o);this.r=r;}double area(){return Math.PI*r*r;}String shape(){return "CIRCLE";}}
    static class Rectangle extends Plot {double l,w;Rectangle(String o,double l,double w){super(o);this.l=l;this.w=w;}double area(){return l*w;}String shape(){return "RECTANGLE";}}
    static class Triangle extends Plot {double b,h;Triangle(String o,double b,double h){super(o);this.b=b;this.h=h;}double area(){return b*h/2;}String shape(){return "TRIANGLE";}}
    public static void main(String[] args){Plot[] p={new Circle("Asha",5),new Rectangle("Ravi",4,6),new Triangle("Neha",10,3)};double total=0;for(Plot x:p){System.out.printf("%s (%s): %.2f%n",x.owner,x.shape(),x.area());total+=x.area();}System.out.printf("Total Area: %.2f%n",total);}
}
