public class PiggyBank {
    private final String id;
    private double savings;
    public PiggyBank(String id){this.id=id;}
    public void deposit(double amount){if(amount>0)savings+=amount;}
    public void withdraw(double amount){if(amount>0&&amount<=savings)savings-=amount;else System.out.println("Withdrawal rejected");}
    public double getSavings(){return savings;}
    public static void main(String[] args){PiggyBank p=new PiggyBank("PB-1");p.deposit(100);p.withdraw(30);p.withdraw(500);System.out.println(p.id+" savings = "+p.getSavings());}
}
