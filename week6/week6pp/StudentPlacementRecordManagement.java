public class StudentPlacementRecordManagement {
    static class PlacementRecord {
        String studentName, company; double packageLpa;
        PlacementRecord(String n,String c,double p){studentName=n;company=c;packageLpa=p;}
        void printRecord(){System.out.printf("%s -> %s @ %.1f LPA%n",studentName,company,packageLpa);}
    }
    public static void main(String[] args) {
        PlacementRecord[] a={new PlacementRecord("Ravi","TCS",4.5),new PlacementRecord("Anitha","Zoho",6.2),new PlacementRecord("Karthik","Infosys",4.0)};
        for(PlacementRecord p:a) p.printRecord();
    }
}
