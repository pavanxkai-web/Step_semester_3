public class HostelMessWalletManagement {
    static class MessWallet {
        private double balance;
        MessWallet(double opening){if(opening<0){System.out.println("Negative opening balance rejected");balance=0;}else balance=opening;}
        void topUp(double amount){if(amount<=0)System.out.println("Top-up rejected");else balance+=amount;}
        void deduct(double amount){if(amount<=0)System.out.println("Invalid amount");else if(amount>balance)System.out.println("Deduct rejected: insufficient balance");else balance-=amount;}
        double getBalance(){return balance;}
    }
    public static void main(String[] args){MessWallet w=new MessWallet(500);w.topUp(200);System.out.println("Balance after top-up: "+w.getBalance());w.deduct(1000);System.out.println("Final balance: "+w.getBalance());}
}
