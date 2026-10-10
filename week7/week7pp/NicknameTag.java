public class NicknameTag {
    private final String firstName;
    private final String lastInitial;
    public NicknameTag(String fullName){String[] p=fullName.split(" ");firstName=p[0];lastInitial=p[1].substring(0,1);}
    public String getNickname(){return firstName+" "+lastInitial+".";}
    public static void main(String[] args){System.out.println(new NicknameTag("Maria Gomez").getNickname());}
}
