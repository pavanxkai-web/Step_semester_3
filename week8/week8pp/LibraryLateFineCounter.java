public class LibraryLateFineCounter {
    static abstract class Item {int daysLate;Item(int d){daysLate=d;}abstract double fine();}
    static class Book extends Item {Book(int d){super(d);}double fine(){return daysLate*1.0;}}
    static class DVD extends Item {DVD(int d){super(d);}double fine(){return daysLate*2.0;}}
    static class Magazine extends Item {Magazine(int d){super(d);}double fine(){return daysLate*0.5;}}
    public static void main(String[] args){Item[] a={new Book(4),new DVD(3),new Magazine(6)};double total=0;for(Item i:a){System.out.printf("%.2f%n",i.fine());total+=i.fine();}System.out.printf("Total Fine: %.2f%n",total);}
}
