public class LibraryIdCardManagement {
    static class LibraryCard {
        final String cardId; final String studentName; int booksBorrowed;
        LibraryCard(String id,String name){cardId=id;studentName=name;booksBorrowed=0;}
        void borrowBook(){booksBorrowed++;}
        void returnBook(){if(booksBorrowed>0)booksBorrowed--;}
        void printCard(){System.out.println(cardId+" | "+studentName+" | Books borrowed: "+booksBorrowed);}
    }
    public static void main(String[] args){LibraryCard c=new LibraryCard("LIB101","Ravi");c.borrowBook();c.borrowBook();c.returnBook();c.printCard();}
}
