package designpattern.builder2;

public class Main {
    public static void main(String[] args) {

        BankAccount2 account = new BankAccount2.Builder(1234L)
                .withOwner("Marge")
                .atBranch("Springfield")
                .openingBalance(100)
                .atRate(2.5)
                .build();

//        BankAccount anotherAccount = new BankAccount.Builder(4567L)
//                .withOwner("Homer")
//                .atBranch("Springfield")
//                .openingBalance(100)
//                .atRate(2.5)
//                .build();


    }

}
