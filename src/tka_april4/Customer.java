package tka_april4;

	
public class Customer {
    String name;
    int age;
    int mob;
    String email;
    char gender;
    String adhaarId;
    String panCard;
    double amount;

    void deposite(){
        System.out.println("Amt is Deposited");
    }
    void checkBal(){
        System.out.println("Now Balance is : " + amount);
        
    }
    void withDraw(){
        System.out.println("Amount is withdrawal...");
    }
    void ApplyLoan(){
        System.out.println("Applying for loan...");
    }
}
