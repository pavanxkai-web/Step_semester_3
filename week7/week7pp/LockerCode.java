public class LockerCode {
    private final int lockerNumber;
    private String code;
    public LockerCode(int number,String code){lockerNumber=number;this.code=code;}
    public boolean changeCode(String current,String next){if(code.equals(current)){code=next;return true;}return false;}
    public static void main(String[] args){LockerCode l=new LockerCode(101,"1234");System.out.println(l.changeCode("1234","5678")?"Code changed":"Change rejected");System.out.println(l.changeCode("0000","9999")?"Code changed":"Change rejected");System.out.println("Locker: "+l.lockerNumber);}
}
