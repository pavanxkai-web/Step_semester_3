public class AttendanceSheet {
    private final String[] names;
    private int count;
    public AttendanceSheet(int capacity){names=new String[capacity];}
    public void markPresent(String name){if(isPresent(name)||count==names.length)return;names[count++]=name;}
    public int getPresentCount(){return count;}
    public boolean isPresent(String name){for(int i=0;i<count;i++)if(names[i].equals(name))return true;return false;}
    public static void main(String[] args){AttendanceSheet s=new AttendanceSheet(30);s.markPresent("Ana");s.markPresent("Ben");s.markPresent("Ana");System.out.println(s.getPresentCount());System.out.println(s.isPresent("Ben"));System.out.println(s.isPresent("Chen"));}
}
